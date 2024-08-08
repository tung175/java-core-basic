package lab08;

public class Student extends Persion {
	private int mark;
	private String grade;

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", grade=" + grade + "]";
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (this.mark >= 8) {
			this.grade = "A";
		} else if (this.mark >= 7 && this.mark < 8) {
			this.grade = "B";
		} else if (this.mark >= 6 && this.mark < 7) {
			this.grade = "C";
		} else if (this.mark >= 5 && this.mark < 6) {
			this.grade = "D";
		} else if (this.mark < 5) {
			this.grade = "Fall";
		}
	}

	public static void main(String[] args) {
		Student st = new Student("015077677", "Tung", 18, 9);
		Persion pr = new Persion("015077677", "Tung", 18);

		System.out.println("Student: " + st);
		st.setGrade();
		System.out.println("Student: " + st);
		System.out.println("Student: " + pr);
	}

}
