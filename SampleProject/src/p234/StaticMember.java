package p234;

import java.util.Scanner;

public class StaticMember {

	class CurrencyConverter{
		private static double rate;
		public static double toDollar(double won) {
			return won/rate;
		}
		public static double toKWR(double doolar) {
			return doolar*rate;
		}
		public static void setRate(double r) {
			rate=r;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("환율(1달러)>>");
		double rate=scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+ CurrencyConverter.toDollar(1000000)+"원입니다.");
		System.out.println("$100는 "+ CurrencyConverter.toKWR(100)+"원입니다.");
		scanner.close();

	}

}
