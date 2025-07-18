package p224;

import java.lang.reflect.Method;

import p234.StaticMember;

class Sample{
	public int a;
	public int b;
	int c; //디폴트 접근 지정
	protected static int d;
}
class sub extends Sample{
	public static void method() {
		int d=1;
	}
}
public class AccessEx extends Sample {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a=10;
		sample.b=10;
		sample.c=10;
		sample.d=10;

		System.out.println(sample.a);
		System.out.println(sample.b);
		System.out.println(sample.c);
		System.out.println(sample.d);
		
		//method();
		System.out.println(d);
	}

}
