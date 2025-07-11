package sub2;

/**
 * 날짜: 2025. 7. 9.
 * 작성자:  Jang Jinwon
 * 내용: 자바 메서드 실습하기
 */
public class MethodTest { //Java는 파일은 class 구조체로 Method로 구성

	//main 메서드: Java 애플리케이션의 시작 메서드(진입점
	public static void main(String[] args) {
		
		//메서드 호출
		int y1=	f(1);
		int y2=	f(2);
		int y3=	f(3);
		int y4=	f(4);
		System.out.println("y1: "+y1);
		System.out.println("y2: "+y2);
		System.out.println("y3: "+y3);
		System.out.println("y4: "+y4);
		//지역변수와 메서드 호출
		int total1=sum(1, 10);
		int total2=sum(1, 100);
		System.out.println("total1: "+total1);
		System.out.println("total2: "+total2);
	}

	//메서드 정의
	public static int f(int x) {
		int y=2*x+3;
		return y;
	}
	
	//메서드 정의
	public static int sum(int start, int end) {
		//지역변수: 메서드 내에서 선언한 변수, 메서드 호출 스택에서 메서드가 종료되면 사라짐(해제)
		int total=0;
		
		for (int k = start; k <= end; k++) { //k변수는 for문에서 선언했기 때문에 for가 종료되면 해제됨
			total+=k;
		}
		return total;
	}
}
