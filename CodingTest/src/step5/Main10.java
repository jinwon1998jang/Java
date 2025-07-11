package step5;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		int total=0;
		Scanner sc= new Scanner(System.in);
		String input = sc.next();
		
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			
			case 'A':case'B':case'C':
				total+=2;
				break;
			case 'D':case'E':case'F':
				total+=3;
				break;
			case 'G':case'H':case'I':
				total+=4;
				break;
			case 'J':case'K':case'L':
				total+=5;
				break;
			case 'M':case'N':case'O':
				total+=6;
				break;
			case 'P':case'Q':case'R':case'S':
				total+=7;
				break;
			case 'T':case'U':case'V':
				total+=8;
				break;
			case 'W':case'X':case'Y':case'Z':
				total+=9;
				break;
			}
		}
		System.out.println(total+input.length());
	}
}
