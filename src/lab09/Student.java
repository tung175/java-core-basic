package lab09;

public class Student {
	private int id;
	private String name;
	private double mark;
	private double age;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", age=" + age + "]";
	}

	public Student(int id, String name, double mark, double age) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

}
