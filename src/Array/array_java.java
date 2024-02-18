package Array;

import java.util.Arrays;

public class array_java {
	public static void main(String[] args) {
		// Khi khai báo thế này sẽ không thể thêm sửa xóa phần tử trong mảng
		String[] clubs = { "MU", "ManCity", "Liverpool" };
		// Cách khai báo thứ hai, cách này phải truyền phần tử vào số lượng phần tử
		String[] clubs1 = new String[5];
		// Nếu khai báo như thế này thì chương trình sẽ báo lỗi, phải khai báo từng phần
		// tử.
		// clubs1 = {"Fulham", "StokeCity", "Everton", "Chelsea", "Barcelona"};

		// Nếu thiếu phần tử ở index nào thì sẽ mặc định bằng null
		clubs1[0] = "Fulham";
		clubs1[1] = "StokeCity";
		clubs1[2] = "Everton";
		clubs1[3] = "Chelsea";
		clubs1[4] = "Barcelona";

		clubs[0] = "Arsenal";
		System.out.println("The length of array " + clubs.length);
		System.out.println("This array " + Arrays.toString(clubs));

		System.out.println("The array 2 :" + Arrays.toString(clubs1));

		for (int i = 0; i < clubs.length; i++) {
			System.out.println(clubs[i]);
		}

		for (String str : clubs1) {
			System.out.println(str);
		}
	}
}
