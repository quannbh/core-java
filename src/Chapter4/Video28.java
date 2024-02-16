package Chapter4;

public class Video28 {
	public static void main(String[] args) {
		System.out.println("Run video 28");
		Student st1 = new Student();
		Student st2 = new Student("Eric", 27);
		st2.setName("Hoi dan IT ERIC CATONA");
		System.out.println("Student with name = " + st2.getName() + " and age = " + st2.getAge());
	}
}
