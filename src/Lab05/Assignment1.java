package Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		while (true) {
			System.out.print("Input your double number: ");
			double x = Double.parseDouble(sc.nextLine());
			list.add(x);
			System.out.print("Do you want continue adding new element?: ");
			if (sc.nextLine().toLowerCase().equals("n")) {
				break;
			}
		}
		System.out.println(list.toString());
		double total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		System.out.println("Total of array list: " + total);
	}
}
