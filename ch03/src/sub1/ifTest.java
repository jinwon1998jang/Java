package sub1;

/**
 * 날짜: 2025. 7. 8.
 * 작성자:  Jang Jinwon
 * 내용: 자바 조건문 실습하기
 */
public class ifTest {

	public static void main(String[] args) {
		
        // 1. 변수 선언 및 초기화
        int num1 = 1;
        int num2 = 2;

        // 2. 첫 번째 if 문
        if (num1 < num2) {
            // 조건이 참일 때 실행
            System.out.println("num1이 num2보다 작다.");
        }

        // 3. 두 번째 if 문
        if (num1 > 1) {
            System.out.println("num1은 1보다 크다.");
        }

        // 4. 중첩 if 문
        if (num1 > 0) {
            if (num2 > 1) {
                // 이 부분은 이미지에서 비어있던 곳이며, 임의로 내용을 추가했습니다.
                System.out.println("num1은 0보다 크고 num2는 1보다 큽니다.");
            }
        }
        
        if (num1 > 0 && num2>1) {
            System.out.println("num1은 0보다 크고 num2는 1보다 큽니다.");
        }
        
        int n1 = 1, n2 = 2, n3 = 3, n4 = 4;

        if (n1 > n2) {
            System.out.println("n1은 n2보다 크다.");
        } else if (n2 > n3) {
            System.out.println("n2은 n3보다 크다.");
        } else if (n3 > n4) {
            System.out.println("n3은 n4보다 크다.");
        } else {
            System.out.println("n4가 제일 크다.");
        }
	}
}
