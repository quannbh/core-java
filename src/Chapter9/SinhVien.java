package Chapter9;

public class SinhVien {
	private String mssv;
	private String name;
	private double score;
	private int age;

	public SinhVien(String mssv, String name, double score, int age) {
		this.mssv = mssv;
		this.name = name;
		this.score = score;
		this.age = age;
	}

	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", name=" + name + ", score=" + score + ", age=" + age + "]";
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
