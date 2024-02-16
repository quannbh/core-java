package Lab03;

import java.util.Scanner;

public class multiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your number to generate multiplication table: ");
		int number = Integer.parseInt(sc.nextLine());
		Multiplication(number);
	}

	public static void Multiplication(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}
	}
}
