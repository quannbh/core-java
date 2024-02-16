package Chapter6;

public class Video42_1 {
	public static void main(String[] args) {
		SinhVienIT st1 = new SinhVienIT("123", "Eric", 10.2, 0.1, "Java");
		st1.getMoney();
		System.out.println("check st1: " + st1.toString());

		SinhVienCoKhi st2 = new SinhVienCoKhi("124", "Hoi dan it", 16.2, 0.2, "Lap trinh");
		System.out.println("check st2: " + st2.toString());
	}
}
