package test4.sub3;

public class MovieTicket {

	private String MovieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.MovieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	

	public void bookTicket() {
		if(isBooked==false) {
			System.out.printf("%s, %s, %s 예매 완료\n",this.MovieTitle,this.screenTime,this.seatNumber);
			this.isBooked = true;	
		}
		else {
			System.out.println("이미 예약됨");
		}
		
	}
	
	public void cancelBook() {
		if(isBooked==true) {
			this.isBooked = false;
			System.out.printf("%s, %s, %s 취소 완료\n",this.MovieTitle,this.screenTime,this.seatNumber);
		}
		else {
			System.out.println("아직 예매 안됨");
		}
		
		
	}
	
	public void printTicketInfo() {
		System.out.println("영화제목: "+this.MovieTitle);
		System.out.println("상영시간: "+this.screenTime);
		System.out.println("좌석번호: "+this.seatNumber);
		System.out.println("예매여부: "+(this.isBooked ? "YES":"NO"));
	}
	
	
	
	
	
}
