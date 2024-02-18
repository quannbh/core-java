package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ParallelSum {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		final long limit = 100L;
		final int numThreads = Runtime.getRuntime().availableProcessors();

		System.out.println("num thread: " + numThreads);
		ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

		long chunkSize = (limit + numThreads - 1) / numThreads;
		System.out.println("chunk size: " + chunkSize);

		long start = 0;
		long end = chunkSize;

		AtomicLong sum = new AtomicLong(0);

		for (int i = 0; i < numThreads; i++) {
			final long threadStart = start;
			final long threadEnd = Math.min(end, limit);

			executorService.submit(() -> {
				long threadSum = calculateSum(threadStart, threadEnd);
				sum.addAndGet(threadSum);
			});

			start += chunkSize;
			end += chunkSize;
		}

		executorService.shutdown();

		try {
			executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Sum: " + sum.get());

		// Ghi lại thời điểm kết thúc
		long endTime = System.currentTimeMillis();

		// Tính thời gian thực hiện
		long executionTime = endTime - startTime;
		System.out.println("Thời gian thực hiện: " + executionTime + " milliseconds");
	}

	private static long calculateSum(long start, long end) {
		long threadSum = 0;
		for (long i = start; i < end; i++) {
			threadSum += i;
		}
		return threadSum;
	}
}
