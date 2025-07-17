package test4.sub2;

public class Main {

	public static void main(String[] args) {
		
		//상품객체생성
		Product keyboard = new Product("P001", "키보드", 35000, 10);

		//상품 정보출력
		keyboard.printProductInfo();
		System.out.println("----------------------");
		
		//가격 수정 및 재고 관리 테스트
		keyboard.updatePrice(30000);
		System.out.println("----------------------");
		
		//상품 정보 출력
		keyboard.printProductInfo();
		System.out.println("----------------------");
		
		//재고 추가
		keyboard.addStock(5);
		System.out.println("----------------------");
		
		//상품 정보 출력
		keyboard.printProductInfo();
		System.out.println("----------------------");
	}

}
