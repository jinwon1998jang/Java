package test4.sub5;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		this.students=new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("정원 초과로 " + student.getName() + " 학생을 추가할 수 없습니다.");
        }
    }

    public void printSubjectInfo() {
        System.out.println("과목명 : " + subName);
        System.out.print("수강생 : ");
        for (int i = 0; i < studentCount; i++) {
            System.out.print(students[i].getName());
            if (i < studentCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(", "); // 출력 결과에 맞춰 추가
    }

    public String getName() {
        return subName;
    }
}
