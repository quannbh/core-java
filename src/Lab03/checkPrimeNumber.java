package Lab03;

import java.util.Scanner;

public class checkPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your number to check: ");
		int number = Integer.parseInt(sc.nextLine());
		boolean prime = check(number);
		if (prime) {
			System.out.println("Number " + number + " is prime number.");
		} else {
			System.out.println("Number " + number + " is not prime number.");
		}

	}

	private static boolean check(int number) {
		if (number < 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
