package sub4;

public class Engineer extends Person{
	private String field;
	
	public Engineer(String name,int age, String field) {
		super(name, age);
		this.name=name;
		this.age=age;
		this.field=field;
		
	}
	public void work() {
		super.introduce();
		System.out.println("저는["+this.field+"]엔지니어 입니다.");
	}
}
