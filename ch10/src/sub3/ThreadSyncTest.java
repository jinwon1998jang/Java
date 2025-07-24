package sub3;


/**
 * 날짜: 2025. 7. 24.
 * 이름: 장진원
 * 내용: 자바 스레드 동기화 실습하기
 */
public class ThreadSyncTest {

	public static void main(String[] args) throws InterruptedException {
		
		Count count =new Count();
		
		CountThread c1=new CountThread(count);
		CountThread c2=new CountThread(count);
		CountThread c3=new CountThread(count);

		c1.start();
		c2.start();
		c3.start();
		
		c1.join();
		c1.join();
		c1.join();
		
		System.out.println("최종 결과: "+count.getNum());
	}

}
