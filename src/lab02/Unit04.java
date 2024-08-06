package lab02;

import java.util.Scanner;

public class Unit04 {
	public static void main(String[] args) {
		System.out.println("Run unit 4");

		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		int chosen = scanner.nextInt();

		switch (chosen) {
		case 1: {

			break;
		}
		case 2: {
			break;
		}
		case 3: {
			break;
		}
		default:
			System.exit(0);
		}

		scanner.close();
	}
}
