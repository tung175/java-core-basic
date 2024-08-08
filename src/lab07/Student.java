package lab07;

public abstract class Student {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	abstract void sumScore();

	abstract double getScore();

	public Student(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public double getPriceTax(double price, double tax) {
		return price * tax;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public static void main(String[] args) {
		Student IT = new StudentIT("70DCTT21196", "Duong", 10000, 10, "Javascript", 10, 5);

		Student MC = new StudentMechanical("MC110096", "Bách khoa cơ khí", 500000, 50, "Java", 7, 8);

		System.out.println("IT Student: " + IT.name + " Score IT: " + IT.getScore());

		System.out.println("MC Student: " + MC.name + " Score MC: " + MC.getScore());
	}
}
