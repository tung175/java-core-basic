package lab02;

import java.util.Scanner;

public class Unit01 {
	public static void unit01(int a, int b) {
		System.out.printf("The first degree equation has the form %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Equation has infinite solutions");
		} else if (a == 0 && b != 0) {
			System.out.println("Equation has no solutions");
		} else {
			float x = (float) -b / a;
			System.out.printf("Equation has one solution equal to: %.3f", x);
		}
	}

	public static void main(String[] args) {
		System.out.println("Run unit 1");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a");
		int a = scanner.nextInt();

		System.out.println("Enter b");
		int b = scanner.nextInt();

		unit01(a, b);

		scanner.close();
	}
}
