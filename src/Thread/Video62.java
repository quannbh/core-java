package Thread;

public class Video62 extends Thread {
	public void run() {
		long startTime = System.currentTimeMillis();
		System.out.println("start thread");
		long sum = 0L;
		for (long i = 0L; i < 10000L; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("end thread");
		long endTime = System.currentTimeMillis();

		// Tính thời gian thực hiện
		long executionTime = endTime - startTime;
		System.out.println("Thời gian thực hiện: " + executionTime + " milliseconds");
	}

	public static void main(String[] args) {
		int MAX = 1;
		for (int i = 0; i < MAX; i++) {
			(new Video62()).start();
		}
		System.out.println("finish");
	}
}
