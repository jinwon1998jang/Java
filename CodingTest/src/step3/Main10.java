package step3;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n-i; j >1; j--) {
				System.out.print(" ");	
			}
			for (int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
