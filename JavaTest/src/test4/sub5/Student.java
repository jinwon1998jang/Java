package test4.sub5;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects =new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	
	 public void enrollSubject(Subject subject) {
	        if (subjectCount < subjects.length) {
	            subjects[subjectCount] = subject;
	            subject.addStudent(this); // 과목에도 학생 추가
	            System.out.println(name + " - " + subject.getName() + " 과목 신청완료");
	            subjectCount++;
	        } else {
	            System.out.println(name + "님은 더 이상 과목을 수강 신청할 수 없습니다.");
	        }
	    }

	    public void setScore(Subject subject, int score) {
	        for (int i = 0; i < subjectCount; i++) {
	            if (subjects[i]==subject) {
	                scores[i] = score;
	                System.out.println(name + " - " + subject.getName() + " 점수 입력완료");
	                return;
	            }
	        }
	        System.out.println(name + "님은 " + subject.getName() + " 과목을 수강하고 있지 않습니다.");
	    }

	    public void printStudentInfo() {
	        System.out.println("학생명 : " + name);
	        System.out.println("아이디 : " + studentId);
	        System.out.println("성적");
	        for (int i = 0; i < subjectCount; i++) {
	            System.out.println(" - " + subjects[i].getName() + ":" + scores[i]);
	        }
	    }

	    public String getName() {
	        return name;
	    }
	}