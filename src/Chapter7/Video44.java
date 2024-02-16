package Chapter7;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}
}

class BabyDog extends Dog {
	void eat() {
		System.out.println("babydog is eating...");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("cat is eating...");
	}
}

public class Video44 {
	public static void main(String[] args) {
		System.out.println("run video 44");
		Animal a = new BabyDog();
		a.eat();
		Animal b = new Cat();
		b.eat();
	}
}
