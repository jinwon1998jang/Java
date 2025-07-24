package sub2;

/**
 * 날짜: 2025. 7. 24.
 * 이름: 장진원
 * 내용: 자바 스레드 상태 실습하기
 */

class WorkThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("WorkThread - "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadJoinTest {

	public static void main(String[] args) {
		WorkThread work = new WorkThread();
		work.start();
		
		//작업 스레드 종료 대기
		try {
			work.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
