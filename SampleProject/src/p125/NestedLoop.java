package p125;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
				System.out.print('\t');
			}
			System.out.println();
		}

	}

}
