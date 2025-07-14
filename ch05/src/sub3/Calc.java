package sub3;

import java.security.KeyStore.PrivateKeyEntry;

/**
 * 날짜: 2025. 7. 14.
 * 이름: 장진원
 * 내용: 싱글톤
 */

public class Calc {
	
	//싱글톤(Singleton) 객체
	private static Calc instance =new Calc();
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {} //외부 new 동적 생성을 막기위해 private 생성자 선언
	

	public int plus(int a, int b) {
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multi(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
}
