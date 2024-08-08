package lab08;

public class Persion implements IPersion {
	protected String id;
	protected String name;
	protected int age;

	@Override
	public void input() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Persion [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Persion(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
