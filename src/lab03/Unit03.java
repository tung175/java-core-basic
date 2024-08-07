package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Unit03 {
	public static void main(String[] args) {
		System.out.println("Run unit 03");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size aray: ");
		int size = scanner.nextInt();
		int[] a = new int[size];

		System.out.println("Enter number for aray: ");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.printf("Array: " + Arrays.toString(a));
		System.out.print("\n");

		// use library
		Arrays.sort(a);

		// min
		System.out.printf("Min array: " + a[0]);
		System.out.print("\n");

		// max
		System.out.printf("Max array: " + a[a.length - 1]);
		System.out.print("\n");
		scanner.close();

		// not use library
		// max
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
		}

		// max
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
