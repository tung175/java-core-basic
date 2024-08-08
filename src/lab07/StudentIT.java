package lab07;

public class StudentIT extends Student {
	private String language;
	private double scoreHTML;
	private double scoreJava;

	public StudentIT(String id, String name, double price, double tax, String language, double scoreHTML,
			double scoreJava) {
		super(id, name, price, tax);
		this.language = language;
		this.scoreHTML = scoreHTML;
		this.scoreJava = scoreJava;
	}

	@Override
	void sumScore() {
		// TODO Auto-generated method stub

	}

	@Override
	double getScore() {
		// TODO Auto-generated method stub
		return (scoreJava * 2 + scoreHTML) / 3;
	}

}
