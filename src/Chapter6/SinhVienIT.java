package Chapter6;

public class SinhVienIT extends SinhVien {
	private String language;

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax);
		this.language = language;
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "SinhVienIT [language=" + language + ", id=" + id + ", name=" + name + ", price=" + price + ", tax="
				+ tax + "]";
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void getMoney() {
		System.out.println("run getMoney on sinhvienIT");
		super.info();
	}

	public void info() {
		System.out.println("info from sinhvienit");
	}
}
