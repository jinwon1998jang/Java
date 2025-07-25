package app;
import java.util.*;

public class BankApp {
	
	private List<Account> accounts = new ArrayList<Account>();
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		BankApp app = new BankApp(); 
		app.start(); // BankApp의 start() 메서드 호출
		
		System.out.println("프로그램 종료");
	}

	public void start() {
		
		boolean running = true;
		
		while (running) {
			printMenu();
			System.out.print("선택> "); 
			
			int choice = Integer.parseInt(scanner.nextLine()); // nextLine()으로 읽고 정수로 파싱

			switch (choice) {
			case 1 -> createAccount();
			case 2 -> listAccounts();
			case 3 -> depositAccount(); 
			case 4 -> withdrawAccount();
			case 5 -> {
				running = false; // 프로그램 종료
			}
			default -> System.out.println("올바른 번호를 선택하세요.");
			}
		}
		scanner.close(); // 프로그램 종료 시 Scanner 닫기
	}
	
	public void printMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
	}
	
	// 계좌생성 메서드
	public void createAccount() {
		System.out.println("-----------------------계좌생성--------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		// 계좌번호 중복 검사
		if (findAccount(ano) != null) {
			System.out.println("결과: 이미 존재하는 계좌번호입니다.");
			System.out.println("------------------------------------------------------");
			return; // 메서드 종료
		}

		System.out.print("계좌주: ");
		String owner = scanner.nextLine(); 

		System.out.print("초기입금액: ");
		int balance = 0; 
		balance = Integer.parseInt(scanner.nextLine()); // nextLine()으로 읽고 정수로 파싱	
		Account newAccount = new Account(ano, owner, balance); // 새 Account 객체 생성
		accounts.add(newAccount); // 리스트에 추가
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		System.out.println("------------------------------------------------------");
	}
	
	// 계좌목록 메서드
	public void listAccounts() {
		System.out.println("-----------------------계좌목록--------------------------");
		if (accounts.isEmpty()) {
			System.out.println("생성된 계좌가 없습니다.");
		} else {
			for (Account acc : accounts) {
				System.out.println(acc.toString()); // Account 클래스의 toString() 활용
			}
		}
		System.out.println("------------------------------------------------------");
	}
	
	// 입금 메서드
	public void depositAccount() {
		System.out.println("-----------------------예금--------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("예금액: ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano); // 계좌 검색
		
		if (account == null) {
			System.out.println("결과: 계좌가 업습니다.");
		} else {
			account.setBalance(account.getBalance() + amount); // 잔고 증가
			System.out.println("결과: 예금이 성공되었습니다.");
		}
		System.out.println("------------------------------------------------------");
	}
	
	// 출금 메서드
	public void withdrawAccount() {
		System.out.println("-----------------------출금--------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("출금액: ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano); // 계좌 검색
		
		if (account == null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
		} else {
			account.setBalance(account.getBalance() - amount); // 잔고 감소
			System.out.println("결과: 출금이 성공되었습니다.");
			
		}
		System.out.println("------------------------------------------------------");
	}
	
	// 계좌 검색 메서드 (내부 사용을 위해 private으로 선언)
	private Account findAccount(String ano) {
		for (Account acc : accounts) {
			if (acc.getAno().equals(ano)) { 
				return acc;
			}
		}
		return null;
	}
}