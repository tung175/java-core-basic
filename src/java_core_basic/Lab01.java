package java_core_basic;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
//		unit01
//		System.out.println("Run unit 1");
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Enter your name:");
//		String name = scanner.nextLine();
//
//		System.out.print("Enter your score:");
//		int score = scanner.nextInt();
//
//		scanner.close();
//
//		System.out.println("Name: " + name + " Score: " + score);

//		unit02
//		System.out.println("Run unit 2");
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter width:");
//		int width = scanner.nextInt();
//
//		System.out.println("Enter length:");
//		int length = scanner.nextInt();
//
//		int acreage = width * length;
//
//		int perimeter = (width + length) * 2;
//
//		int smallestEdge = Math.min(width, length);
//
//		scanner.close();
//		System.out.println("Acreage: " + acreage + " Perimeter: " + perimeter + " Smallest edge: " + smallestEdge);

//		unit03
		System.out.println("Run unit 3");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter edge :");
		int edge = scanner.nextInt();

		double volume = Math.pow(edge, 3);

		scanner.close();
		System.out.println("Volume: " + volume);
	}
}
