package Chapter6;

import java.util.Scanner;

public class Video38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String username = sc.nextLine();
		System.out.print("Enter your password: ");
		String password = sc.nextLine();

		System.out.println("Username: " + username + " Password: " + password);
		if (username.toLowerCase().equals("hoidanit")) {
			System.out.println("Your username is correct!");
		} else {
			System.out.println("Your username is incorrect!");
			return;
		}
		if (password.length() >= 6) {
			System.out.println("Your password is correct!");
		} else {
			System.out.println("Your password is incorrect!");
		}
	}
}
