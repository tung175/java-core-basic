package lab06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[A-Za-z0-9.]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
		Matcher matcher = pattern.matcher("duongkq3@gmail.com");

		System.out.println("Check ID: " + matcher.matches());
	}
}
