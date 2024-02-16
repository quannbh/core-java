package Chapter6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Video40_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Run video 40.2");
		System.out.print("Enter your password: ");
		String password = sc.nextLine();
		Pattern pattern = Pattern.compile("[0-9]{6,}");
		Matcher matcher = pattern.matcher(password);
		System.out.println("Input password matches regex - " + matcher.matches());

		System.out.print("Enter your identity number: ");
		String identityCard = sc.nextLine();
		Pattern patternIdentityCard = Pattern.compile("0\\d{11}");
		Matcher matcherIdentityCard = patternIdentityCard.matcher(identityCard);
		System.out.println("Input identity card matches regex - " + matcherIdentityCard.matches());

		System.out.print("Enter your email: ");
		String email = sc.nextLine();
		Pattern patternEmail = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
		Matcher matcherEmail = patternEmail.matcher(email.toLowerCase());
		System.out.println("Input identity card matches regex - " + matcherEmail.matches());
	}
}
