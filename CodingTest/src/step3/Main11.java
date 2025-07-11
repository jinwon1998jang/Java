package step3;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		do {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a==0&&b==0) {
				continue;
			}
			System.out.println(a+b);
		}while(a!=0&&b!=0);
	}

}
