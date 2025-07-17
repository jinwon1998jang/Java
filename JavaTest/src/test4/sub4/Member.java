package test4.sub4;

public class Member {
	
	protected String name;
	protected String memberId;
	protected String borrowedBook;
	
	public Member(String name, String memberId) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	public void borrowBook(Book book) {
		if(borrowedBook==null) {
			this.borrowedBook = book.getTitle();	
			System.out.println("도서대출: "+this.borrowedBook );
		}
		else {
			System.out.println(this.borrowedBook+" 이미 대출됨");
		}
		
	}
	
	public void returnBook(Book book) {
		if(borrowedBook!=null) {
			System.out.println("도서 반납: "+borrowedBook);
			this.borrowedBook = null;
		}
		else {
			System.out.println("반납 가능 도서 없음");
		}

	}
	
	public void getMemberInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("회원 ID: "+this.memberId);
		if(borrowedBook!=null) {
			System.out.println("대출한 도서: "+this.borrowedBook);	
		}
		else {
			System.out.println("대출한 도서: 없음");
		}
		
	}


	
	
	

}
