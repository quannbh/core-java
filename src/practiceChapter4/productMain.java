package practiceChapter4;

public class productMain {
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Iphone");
		product1.setPrice(499.99);
		product1.setTax(0.0855);

		Product product2 = new Product("Ipad", 1499.59, 0.12);
		product1.xuatThongTin(product1);
		product2.xuatThongTin(product2);

		Product product3 = new Product();
		product3.nhapThongTin(product3);
		product3.xuatThongTin(product3);
	}
}
