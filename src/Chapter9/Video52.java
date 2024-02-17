package Chapter9;

import java.util.Scanner;

public class Video52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("nhap x: ");

			try {
				int x = Integer.parseInt(sc.nextLine());
				try {
					System.out.println("kết quả 10/x = " + 10 / x);
					break;
				} catch (Exception e) {
					System.out.println("run error with x 0: " + x);
				}
			} catch (Exception e) {
				System.out.println("run error with x");
			}
		}

	}
}
