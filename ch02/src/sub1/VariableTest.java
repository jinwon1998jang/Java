package sub1;
/*
날짜: 2025/07/07
이름: 장진원
내용: 2장 변수 살습하기
*/

public class VariableTest {

	public static void main(String[] args) {
		
		//변수(Variable)
		int a=3; //변수 선언 및 초기화
		int b=7;
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		a=5; //재할당
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		//상수(Constant)
		final int NUM= 10;
		//상수는 초기화 된 값으로 고정되기 떄문에 재할당 안됨
		//NUM=11;
		System.out.println("NUM: "+ NUM);

	}

}
