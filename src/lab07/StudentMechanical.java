package lab07;

public class StudentMechanical extends Student {
	private String skill;
	private double scoreCNC;
	private double scorePLC;

	public StudentMechanical(String id, String name, double price, double tax, String skill, double scoreCNC,
			double scorePLC) {
		super(id, name, price, tax);
		this.skill = skill;
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	@Override
	void sumScore() {
		// TODO Auto-generated method stub

	}

	@Override
	double getScore() {
		// TODO Auto-generated method stub
		return (scoreCNC + scorePLC) / 2;
	}

}
