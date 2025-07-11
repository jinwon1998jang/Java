package sub2;
/**
 * 날짜: 2025/07/07
 * 이름: 장진원
 * 내용: 자바 다양한 출력 실습
 */
public class PrintTest {
	public static void main(String[] args) {
		// 기본 출력
		System.out.println("Hello Java"); //한줄복사 ctrl+Alt+방향키 아래(위)
		System.out.println("Hello Korea!"); //한줄삭제 ctrl+d
		System.out.println("Hello Busan!"); //작업취소 ctrl+z
		// 한줄 출력
		System.out.print("Welcome"); //ln(줄바꿈, 개행) 처리 안하고 출력
		System.out.print("Java!");
		// 개행 출력
		System.out.println();
		System.out.print("Welcome\n"); // \n: 이스케이프 특수문자
		System.out.print("Korea!");

	}

}
