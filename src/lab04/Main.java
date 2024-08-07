package lab04;

public class Main {
	public static void main(String[] args) {
		Product pr = new Product();

		Product pr1 = pr.importInfo("ABC", 200, 0.2);
		pr.exportInfo(pr1);
		System.out.println(" tax = " + pr.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
