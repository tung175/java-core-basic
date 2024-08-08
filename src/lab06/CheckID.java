package lab06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckID {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("0[0-9]{9,11}");
		Matcher matcher = pattern.matcher("0123456789");

		System.out.println("Check ID: " + matcher.matches());
	}
}
