package sub3;

/**
 * 날짜: 2025. 7. 21.
 * 이름: 장진원
 * 내용: 자바 예외 발생시키기 실습하기
 */

//사용자 정의 예외 클래스
class MinusExeption extends Exception{

	public MinusExeption(String message) {
		super(message);
	}
}

class OverException extends Exception{

	public OverException(String message) {
		super(message);
	}
}

class score{
	public void check(int score) throws MinusExeption, OverException {
		if (score<0) {
			//예외 발생 시키기
			throw new MinusExeption("점수는 음수가 될 수 없습니다.");
		}
		else if (score>100) {
			//예외 발생시키기
			throw new OverException("점수가 100점을 초과할 수 없습니다.");
		}
		else {
			System.out.println("점수가 이상 없습니다.");
		}
	}
}
public class TrowTest {

	public static void main(String[] args) {
		score score = new score();
		
		try {
			//score.check(-3);
			//score.check(120);
			score.check(96);
			
		} catch (MinusExeption e) {
			e.printStackTrace();
		} catch (OverException e) {
			e.printStackTrace();
		}

	}

}
