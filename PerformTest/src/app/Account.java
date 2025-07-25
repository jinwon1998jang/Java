package app;

public class Account {

	private String ano;    // 계좌번호
	private String owner;  // 입금주
	private int balance;   // 잔고
	
	//생성자
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

	//toString() 메서드 오버라이드
	@Override
	public String toString() {
		return ""+ano+" "+owner+" "+balance+" ";
	}
}

