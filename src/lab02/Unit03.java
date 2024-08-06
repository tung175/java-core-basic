package lab02;

import java.util.Scanner;

public class Unit03 {
	public static void unit03(int a) {
		if (a <= 100) {
			int money = a * 1000;
			System.out.println("Electricity bill: " + money);
		} else {
			int money = a * 1000 + (a - 100) * 1500;
			System.out.println("Electricity bill: " + money);
		}
	}

	public static void main(String[] args) {
		System.out.println("Run unit 3");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter electricity: ");
		int a = scanner.nextInt();

		unit03(a);

		scanner.close();
	}
}
