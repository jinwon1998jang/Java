package test5;


public class Grape  { 

	private String country;
	private int price;
	public Grape(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Grape [country=" + country + ", price=" + price + "]";
	}

	
}
