package lab06;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("Login");
		System.out.println("Pease Enter your username and password");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Username: ");
		String username = scanner.nextLine();

		System.out.println("Password: ");
		String password = scanner.nextLine();

		if (username.equals("kyutung") && password.length() > 6) {
			System.out.println("Login sucssec");
		} else {
			System.out.println("Username or password isconrect");
		}

		scanner.close();
	}
}
