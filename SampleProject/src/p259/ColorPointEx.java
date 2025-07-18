package p259;

class Point{
	private int x,y;
	public void set(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color;

	public ColorPoint(String color) {
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx{
    public static void main(String[] args) {
		Point point = new Point();
		point.set(1, 2);
		point.showPoint();

		System.out.println("--------------------");

		ColorPoint cp = new ColorPoint("red"); 
		cp.set(3, 4); 
		cp.showColorPoint(); 
    }
}