package sub2;

import java.applet.Applet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sub1.Apple;

/**
 * 날짜: 2025. 7. 22.
 * 이름: 장진원
 * 내용: 자바 리스트 실습하기
 */
public class ListTest {

	public static void main(String[] args) {
		
		//ArrayList 기본
		ArrayList<Integer> list = new ArrayList();
		
		//데이터 삽입
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1,6);
		System.out.println(list);
		

		//데이터 제거
		list.remove(2); //index 2번 데이터 삭제
		System.out.println(list);
		
		list.remove(3); //index 3번 데이터 삭제
		System.out.println(list);
		
		//데이터 출력
		System.out.println("list 1번째 원소: "+list.get(0));
		System.out.println("list 1번째 원소: "+list.get(1));
		System.out.println("list 1번째 원소: "+list.get(2));
		
		//데이터 크기
		System.out.println("list 크기: "+list.size());
		
		//리스트 반복
		for (int num : list) { //Auto-Unboxing
			System.out.println("num: "+num);
		}
		for (Integer num : list) {
			System.out.println("num: "+num);
		}
		
		//문자열 리스트 실습
		List<String> people = new ArrayList();

		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		people.add("정약용");
		System.out.println(people);
		people.add(4,"이성계");
		System.out.println(people);
		people.add(1,"비담");
		System.out.println(people);
		//people.remove(3);
		people.remove(people.indexOf("장보고"));
		System.out.println(people);
		people.add(3,"왕건");
		System.out.println(people);
		
		people.set(5,"정도전"); //set() -리스트 원소 교체
		System.out.println(people);
		
		/////////////////////////////
		//객체 리스트 실습
		/////////////////////////////
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("일본",3000);
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("중국", 1000));
		
		Apple koreaaApple = apples.get(0);
		System.out.println(koreaaApple);
		
		for (Apple apple : apples) {
			System.out.println(apple);
		}
		
		
		///////////////////////////
		//LinkedList
		//////////////////////////
		
		LinkedList<String> cities=new LinkedList();
		cities.add("서울");
		cities.add("대전");
		cities.add("대구");
		cities.add("부산");
		cities.add("광주");
		System.out.println(cities);
		
		//데이터 삽입
		cities.add(1,"수원");
		cities.addFirst("인천");
		cities.addLast("울산");
		System.out.println(cities);
	}

}
