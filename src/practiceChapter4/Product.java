package practiceChapter4;

import java.util.Scanner;

public class Product {
	private String name;
	private double price;
	private double tax;

	public void nhapThongTin(Product product) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name of product: ");
		product.setName(sc.nextLine());
		System.out.print("Price of product: ");
		product.setPrice(Double.parseDouble(sc.nextLine()));
		System.out.print("Tax of product: ");
		product.setTax(Double.parseDouble(sc.nextLine()));
	}

	public void xuatThongTin(Product product) {
		System.out.println("Product name: " + product.getName());
		System.out.println("Product price: $" + product.getPrice());
		System.out.println("Product tax: " + product.getTax());
		System.out.println("Product tax price: $" + String.format("%.2f", product.getTaxPrice()));
		System.out.println("Total price you must pay: $" + String.format("%.2f", product.getTotalPrice()));
		System.out.println("===============================");
	}

	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTaxPrice() {
		return price * tax;
	}

	public double getTotalPrice() {
		return getTaxPrice() + getPrice();
	}
}
