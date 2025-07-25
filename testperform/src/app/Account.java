package app;

public class Account {

	private String ano;    // 계좌번호
	private String owner;  // 계좌주
	private int balance;   // 잔고
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// Getter 메서드들
	public String getAno() {
		return ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	// 잔고는 예금/출금 시 변경되므로 Setter 필요
	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 계좌 정보를 보기 좋게 출력하기 위해 toString() 메서드 오버라이드
	@Override
	public String toString() {
		return ""+ano+" "+owner+" "+balance+" ";
	}
}