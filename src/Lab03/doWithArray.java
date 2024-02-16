package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class doWithArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Input your array size: ");
		size = Integer.parseInt(sc.nextLine());
		int[] myArray = new int[size];
		System.out.println("Input your elements of array: ");
		for (int i = 0; i < size; i++) {
			myArray[i] = Integer.parseInt(sc.nextLine());
		}

		System.out.print("Array before: ");
		for (int i : myArray) {
			System.out.print(i + " ");
		}

		System.out.print("\nArray after sort: ");
		Arrays.sort(myArray);
		for (int i : myArray) {
			System.out.print(i + " ");
		}

		int max = myArray[0];
		for (int i = 0; i < myArray.length; i++) {
			max = Math.max(max, myArray[i]);
		}

		int min = myArray[0];
		for (int i = 0; i < myArray.length; i++) {
			min = Math.min(min, myArray[i]);
		}

		System.out.println("\nMax number: " + max);
		System.out.println("Min number: " + min);

	}

}
