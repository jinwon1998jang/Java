package sub3;

/**
 * 날짜: 2025. 7. 8.
 * 작성자:  Jang Jinwon
 * 내용: 자바 For 반복문 실습하기
 */
public class ForTest {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("i: "+i);
		}
		int sum=0;
		
		for (int k = 0; k <=10; k++) {
			sum=sum+k;
			System.out.println("sum: "+sum);
		}
		
		int tot=0;
		
		for (int k = 0; k <=10; k++) {
			if(k%2==0) {
				tot+=k;
			}
			System.out.println("tot: "+tot);
		}
		
		for (int a = 0; a <=3; a++) {
			System.out.println("a:"+a);
			for (int b = 0; b <= 5; b++) {
				System.out.println("b:"+b);
			}
		}

		for (int x = 1; x <= 9; x++) {
			System.out.println(x+"단");
			for (int y = 1; y <= 9; y++) {
				System.out.println(x+" x "+y+"="+x*y);
				System.out.printf("%d x %d = %d\n", x,y,x*y);
			}
		}
		
		for (int start = 1; start <= 10; start++) {
			System.out.println();
			for (int end = 1; end <=start; end++) {
				System.out.print("★");
			}
		}
		
		for (int start = 10; start >= 1; start--) {
			System.out.println();
			for (int end = 1; end <=start; end++) {
				System.out.print("★");
			}
		}
	}
}
