package test1;

/**
 * 날짜: 2025. 7. 9.
 * 작성자:  장진원
 * 내용: 자바 연산자 연습문제
 */

public class test03 {

	public static void main(String[] args) {
		int result=0;
		int num = 1;
		
		result=num++;
		System.out.println("result: "+result);
		
		result=++num;
		System.out.println("result: "+result);
		
		result=num--;
		System.out.println("result: "+result);
		
		result=--num;
		System.out.println("result: "+result);

	}

}
