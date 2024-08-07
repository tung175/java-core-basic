package lab03;

import java.util.Scanner;

public class Unit02 {
	public static void main(String[] args) {
		System.out.println("Run unit 02");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number: ");
		int x = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d", x, i, x * i);
			System.out.print("\n");
		}
		scanner.close();
	}
}
