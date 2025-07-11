package p146;

import java.util.Iterator;

public class ReturnArray {
	static int[] makeArray() {
		int[] temp = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] intArray;
		intArray=makeArray();
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}

	}
}

/*public: 모든 클래스에서 접근 가능합니다.

protected: 같은 패키지 내의 클래스와 다른 패키지에 있는 자식 클래스에서 접근 가능합니다.

private: 해당 클래스 내부에서만 접근 가능합니다.

default (패키지-프라이빗):
아무런 접근 제어자도 명시하지 않으면 자동으로 default 접근 제어자가 적용됩니다.
default 접근 제어자는 같은 패키지(package) 내에 있는 클래스들에서만 접근할 수 있도록 허용합니다. 다른 패키지에 있는 클래스에서는 접근할 수 없습니다.
*/