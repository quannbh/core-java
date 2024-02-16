package Chapter6;

public class Car extends Vehicle {
	private String modelName = "Mustang";

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.honk();
		System.out.println("Brand name: " + myCar.brand + " Model name: " + myCar.modelName);
	}
}
