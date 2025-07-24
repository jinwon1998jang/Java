package sub02;

class Product{
	protected static String prodId;
	protected static String prodName;
	protected static int price;
	protected static int quentity;
	
	public Product(String prodId, String prodName, int price, int quentity) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quentity = quentity;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", quentity=" + quentity
				+ "]";
	}
	
}

class Computer extends Product{
	private String manufactor;

	public Computer(String manufactor) {
		super(prodId,prodName,quentity, price);
		this.manufactor = manufactor;
	}

	@Override
	public String toString() {
		return "Computer [manufactor=" + manufactor + "]";
	}
	
}

class Clothes{
	
}

public class Main {

	public static void main(String[] args) {
		

	}

}
