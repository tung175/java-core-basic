package lab09;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static int importID() {
		int id;

		while (true) {
			System.out.println("Enter your ID Student: ");
			try {
				id = sc.nextInt();
				if (id >= 10) {
					break;
				} else {
					System.out.println("Please try again enter your ID! ");
				}
			} catch (Exception e) {
				System.out.println("Please try again enter your ID! ");
			}

		}

		return id;
	}

	public static String importName() {
		String name;

		while (true) {
			System.out.println("Enter your name: ");
			try {
				name = sc.next();
				if (!name.trim().isEmpty()) {
					break;
				} else {
					System.out.println("Name not empty! ");
				}
			} catch (Exception e) {
				System.out.println("Please try again enter your name! ");
			}

		}

		return name;
	}

	public static double importMark() {
		double mark;

		while (true) {
			System.out.println("Enter your mark: ");
			try {
				mark = sc.nextDouble();
				if (mark >= 0 && mark <= 10) {
					break;
				} else {
					System.out.println("Mark must be between 0 and 10! ");
				}
			} catch (Exception e) {
				System.out.println("Please try again enter your mark! ");
			}

		}
		return mark;
	}

	public static double importAge() {
		double age;

		while (true) {
			System.out.println("Enter your age: ");
			try {
				age = sc.nextDouble();
				if (age > 0) {
					break;
				} else {
					System.out.println("Age must be positive");
				}
			} catch (Exception e) {
				System.out.println("Please try again enter your age ");
			}

		}
		return age;
	}

	public static void main(String[] args) {
		System.out.println("Run Lab09");

		int id = importID();
		String name = importName();
		double mark = importMark();
		double age = importAge();

		Student st = new Student(id, name, mark, age);

		System.out.println(st);

		sc.close();

	}
}
