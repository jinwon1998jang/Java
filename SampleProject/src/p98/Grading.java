package p98;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {

		char grade;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("점수를 입력하시오(0~100: ");
		int score=sc.nextInt();
		if(score>=90)
			grade='A';
		else if(score>=80)
			grade='B';
		else if(score>=70)
			grade='C';
		else if(score>=60)
			grade='D';
		else
			grade='F';
		System.out.println(grade);
		sc.close();

	}

}
