package sub4;

public class Docter extends Person {

	private String specialty;
	
	public Docter(String name, int age, String speciality) {
		super(name, age);
		this.name=name;
		this.age=age;
		this.specialty=speciality;
	}
	
	public void work() {
		super.introduce();
		System.out.println("저는 의사이며 전공은["+this.specialty+"]엔지니어 입니다.");
	}
}

