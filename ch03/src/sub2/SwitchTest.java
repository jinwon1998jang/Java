package sub2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 날짜: 2025. 7. 8.
 * 작성자:  Jang Jinwon
 * 내용: 자바 Switch 조건물 실습하기 
 */

public class SwitchTest {

	public static void main(String[] args) throws IOException {
		System.out.print("숫자 입력: ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("입력된 숫자:"+number);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int num2 = Integer.parseInt(br.readLine());
		switch(number%2){
		case 0:
			System.out.println("number는 짝수입니다");
			break; //조건식 탈출, 없으면 그다음 case실행
			
		case 1:
			System.out.println("number는 홀수입니다");
			break;
		}

	}

}
