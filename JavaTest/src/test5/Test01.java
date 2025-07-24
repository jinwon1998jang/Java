package test5;
import java.io.*;
import java.util.*;
/**
 * 날짜: 2025. 7. 23.
 * 이름: 장진원
 * 내용: 예외처리 연습문제
 */
public class Test01 {

	public static void main(String[] args) {
		int answer =(int)(Math.random()*10)+1;
		int input=0,count=0;
		
		do {
			count++;
			System.out.println("--------------------");
			System.out.println("1~10 사이의 값 입력:");
			
			try {
				Scanner sc=new Scanner(System.in);
				input=sc.nextInt();
				
				if(input<0) {
					throw new Exception("움수는 입력할 수 없습니다.");
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				continue;
			}catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			if(answer>input) {
				System.out.println("더 큰수 입력하세요.");
			}else if(answer<input) {
				System.out.println("더 작은수 입력하세요");
			}else {
				System.out.println(answer+"정답입니다!");
				System.out.println("횟수"+count+"회");
				break;
			}
		}while(true);
		System.out.println("프로그램 종료...");
	}
}
