package Chapter9;

import java.util.Scanner;

public class Video53 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		try {
//			System.out.print("nhap x: ");
//			int x = Integer.parseInt(sc.nextLine());
//			System.out.println("run try");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("run catch");
//		} finally {
//			System.out.println("run finally");
//			sc.close();
//		}

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("nhap y: ");
			int y = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
