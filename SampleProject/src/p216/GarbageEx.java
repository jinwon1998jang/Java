package p216;

public class GarbageEx {

	public static void main(String[] args) {
		String a=new String("Good");
		String b=new String("Bad");
		String c=new String("Normal");
		String d,e;
		a=null;//가비지
		d=c;
		c=null; //d가 c생성 normal 객체  참조중
		System.gc();
		System.out.println(a);

	}

}
