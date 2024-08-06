package lab02;

import java.util.Scanner;

public class Unit02 {
	public static void unit02(int a, int b, int c) {
		System.out.printf("The quadratic has the form %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0) {
			Unit01.unit01(b, c);
		} else {
			int d = b * b - 4 * a * c;
			if (d < 0) {
				System.out.println("Equation has no solutions");
			} else if (d == 0) {
				float x = (float) -b / 2 * a * c;
				System.out.println("Equation with double roots: " + x);
			} else {
				double x1 = (-b + Math.sqrt(d)) / (2 * a);
				double x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.printf("The equation has two distinct solutions, x1 = %.3f and x2 = %.3f.", x1, x2);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Run unit 2");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a");
		int a = scanner.nextInt();

		System.out.println("Enter b");
		int b = scanner.nextInt();

		System.out.println("Enter c");
		int c = scanner.nextInt();
		unit02(a, b, c);

		scanner.close();
	}
}
