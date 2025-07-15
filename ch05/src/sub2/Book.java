package sub2;

/**
 * 날짜: 2025. 7. 15.
 * 이름: 장진원
 * 내용:
 * 문제 1. 아래 요구사항을 충족하는 Book 클래스를 정의하세요.

<속성>

title (String): 책 제목

author (String): 저자 이름

isbn (String): ISBN 번호

availableCopies (int): 이용 가능한 복사본 수

<생성자>

모든 인스턴스 변수를 초기화하는 생성자

<메서드>

borrowBook()

이용 가능한 복사본이 있으면 availableCopies를 1 감소시키고 true를 반환

이용 가능한 복사본이 없으면 false를 반환

returnBook()

availableCopies를 1 증가

show()

모든 인스턴스 변수의 값을 출력

각 인스턴스 변수에 대한 getter와 setter 메서드 정의
 * 
 */
public class Book {


	private String title;
	private String author;
	private String isbn;
	private int availablcopies;
	
	// 생성자
	public Book(String title, String author, String isbn, int availableCopies) {
	    this.title = title;
	    this.author = author;
	    this.isbn = isbn;
	    this.availablcopies = availableCopies;
	}
	

	//메서두
	public boolean borrowBook() {
		
		if(availablcopies>0) { //이용 가능한 복사본(도서)이 있으면
			availablcopies--;
			return true;
		} 
		else {
			return false;	
		}
	}
	
	public void returnBook() {
		availablcopies++;
	}
	
	public void show() {
		System.out.println("도서명: "+this.title);
		System.out.println("지은이: "+this.author);
		System.out.println("도서번호: "+this.isbn);
		System.out.println("이용 가능한 복사본수: "+this.availablcopies);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAvailablcopies() {
		return availablcopies;
	}
	public void setAvailablcopies(int availablcopies) {
		this.availablcopies = availablcopies;
	}
	
}
