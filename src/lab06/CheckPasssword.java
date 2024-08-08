package lab06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPasssword {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[0-9]{6,}");
		Matcher matcher = pattern.matcher("123456");

		System.out.println("Check password: " + matcher.matches());
	}
}
