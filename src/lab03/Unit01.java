package lab03;

import java.util.Scanner;

public class Unit01 {
	public static void main(String[] args) {
		System.out.println("Run unit 01");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number: ");
		int x = scanner.nextInt();

		int count = 0;

		for (int i = 2; i < x - 1; i++) {
			System.out.println("Other divisors: " + i);
			if (x % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.printf("%d is prime", x);
		} else {
			System.out.printf("%d is't prime", x);
		}

		scanner.close();
	}
}
