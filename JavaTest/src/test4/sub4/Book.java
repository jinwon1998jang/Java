package test4.sub4;

public class Book {

	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}
	
	public void borrowBook() {
		this.isBorrowd=true;
	}
	
	public void returnBook() {
		this.isBorrowd=false;
	}
	
	public void getBookInfo() {
		System.out.println("도서명: "+this.title);
		System.out.println("저자: "+this.author);
		System.out.println("ISBN: "+this.isbn);
		
		System.out.println("대출여부: "+(isBorrowd ? "가능":"불가능"));

		
	}
	
	public String getTitle() {
		return title;
	}
	
	
}
