package Chapter6;

import java.util.ArrayList;

public class Video38_1 {
	public static void main(String[] args) {
		Student st1 = new Student("Nguyễn Văn An", "1");
		Student st2 = new Student("Nguyễn Trần Trung Quân", "2");
		Student st3 = new Student("Harry Pham", "3");
		Student st4 = new Student("Nguyễn Hải Yến", "4");
		Student st5 = new Student("Ngô Văn Long", "5");

		ArrayList<Student> listStudent = new ArrayList<Student>();
		listStudent.add(st1);
		listStudent.add(st2);
		listStudent.add(st3);
		listStudent.add(st4);
		listStudent.add(st5);

		System.out.println("check list: " + listStudent.toString());

		for (Student i : listStudent) {
			if (i.getName().startsWith("Nguyễn")) {
				System.out.println(i.getName());
			}
		}
	}
}
