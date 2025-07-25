package sub3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 날짜: 2025. 7. 24.
 * 이름: 장진원
 * 내용: 자바 필터 스트림 실습하기
 */
public class FilterStreamTest {

	public static void main(String[] args) {
		
		// 실습 리스트 생성
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(numbers);
		
		//중복 제거
		List<Integer> newNumbers= numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(newNumbers);
		
		numbers.stream().distinct().forEach(num->System.out.print(num+", "));
		System.out.println();
		
		//3이상 필터링
		List<Integer> numbers3=
								numbers
								.stream()
								.distinct()
								.filter(num->{
									
									if (num>3) {
										return false;
									} else {

										return true;
									}
								})
								.collect(Collectors.toList());
		System.out.println(numbers3);
		
		//중복제거,짝수 데이터 필터링, 내림차순 정렬
		List<Integer> numbers4=
								numbers
								.stream()
								.distinct()
								.filter(num->{
									if (num%2==0) {
										return true;
									} else {
										return false;
									}
								})
								.sorted(Collections.reverseOrder())
								.collect(Collectors.toList());
		System.out.println(numbers4);
		
		List<Integer> numbers4_2=
								numbers
								.stream()
								.distinct()
								.filter(num->num%2==0)
								.sorted(Collections.reverseOrder())
								.collect(Collectors.toList());
		System.out.println(numbers4_2);
	}

}
