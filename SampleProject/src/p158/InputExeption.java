package p158;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExeption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum=0,n=0;
		for (int i = 0; i <3; i++) {
			System.out.print(i+">>");
			try {
				n=sc.nextInt();
			} catch (InputMismatchException e) {
				String ex=sc.nextLine();
				System.out.println(ex+"은 정수가 아닙니다. 다시 입력하세요!");
				i--;
				continue;
			}
			sum+=n;
		}

		System.out.println("합은 "+sum);
		sc.close();
	}

}
