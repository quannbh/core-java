package Chapter5;

import java.util.ArrayList;

public class Video33 {
	public static void main(String[] args) {
		int a = 10;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(10);
		a1.add(-4);

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Hỏi dân IT với Eric 1");
		a2.add("Hỏi dân IT với Eric 2");
		a2.add("Hỏi dân IT với Eric 3");
		a2.add("Hỏi dân IT với Eric 4");
		a2.remove(1);
		System.out.println(a1.toString());
		System.out.println(a2.toString() + " " + a2.get(2));
	}
}
