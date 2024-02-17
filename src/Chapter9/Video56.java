package Chapter9;

import java.util.Scanner;

public class Video56 {
	public static String inputMSSV() {
		Scanner sc = new Scanner(System.in);
		String mssv = null;
		while (true) {
			try {
				System.out.print("nhap ma sinh vien: ");
				mssv = sc.nextLine();
				if (mssv.isEmpty()) {
					throw new IllegalArgumentException();
				}
				System.out.println("true");
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("input mssv invalid.");
			}
		}
		return mssv;
	}

	public static String inputName() {
		Scanner sc = new Scanner(System.in);
		String name = null;

		while (true) {
			try {
				System.out.print("nhap ho va ten sinh vien: ");
				name = sc.nextLine();
				if (name.isEmpty()) {
					throw new IllegalArgumentException();
				}
				System.out.println("true");
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("input name invalid");
			}
		}
		return name;
	}

	public static double inputScore() {
		Scanner sc = new Scanner(System.in);
		double score = 0;
		while (true) {
			try {
				System.out.print("nhap diem sinh vien: ");
				score = Double.parseDouble(sc.nextLine());
				if (score < 0 || score > 10) {
					throw new IllegalArgumentException();
				}
				System.out.println("true");
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("input score invalid");
			}
		}
		return score;
	}

	public static int inputAge() {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		while (true) {
			try {
				System.out.print("nhap tuoi sinh vien: ");
				age = Integer.parseInt(sc.nextLine());
				System.out.println("true");
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("input invalid age");
			}

		}
		return age;
	}

	public static void main(String[] args) {
		System.out.println("run video 56");

		try (Scanner sc = new Scanner(System.in)) {
			String mssv = inputMSSV();
			String name = inputName();
			double score = inputScore();
			int age = inputAge();

			SinhVien sv1 = new SinhVien(mssv, name, score, age);
			System.out.println(sv1);

		}
	}
}
