package Arrray;

import java.util.Arrays;

public class practice_array_java {
	public static void main(String[] args) {
		int[] numbers = { 6, 4, 8, 1, 9, 10, 16, 25, 2, 3 };
		System.out.println(numbers);
		// Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		for (int i : numbers) {
			System.out.println(i);
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp;
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("After sorted: ");
		for (int i : numbers) {
			System.out.println(i);
		}
	}
}
