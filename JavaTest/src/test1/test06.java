package test1;

import java.util.Scanner;

/**
 * 날짜: 2025. 7. 9.
 * 작성자:  장진원
 * 내용: 자바 상항연산자 연습문제
 */
public class test06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("x값 입력: ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력: ");
		int y = sc.nextInt();
		
		String result = x>y ? "x가 더 큽니다.":"y가 더 큽니다";
		
		System.out.printf(result);
		sc.close();
	}
}
