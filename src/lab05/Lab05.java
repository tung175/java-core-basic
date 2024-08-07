package lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> myArray = new ArrayList<Double>();

		while (true) {
			System.out.println("Enter your number: ");
			double input = scanner.nextDouble();
			myArray.add(input);

			System.out.println("continue? Y or N");
			scanner.nextLine();
			String option = scanner.nextLine();

			if (option.equals("N") || option.equals("n")) {
				break;
			}

		}

		System.out.println("My array: " + myArray);

		double sum = 0;
		for (int i = 0; i < myArray.size(); i++) {
			sum += myArray.get(i);
		}

		System.out.println("Sum array: " + sum);

		scanner.close();
	}
}
