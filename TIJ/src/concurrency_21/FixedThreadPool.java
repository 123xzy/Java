package concurrency_21;

import java.util.concurrent.*;

public class FixedThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i = 0;i < 5;i++)
			executorService.execute(new LiftOff());
		executorService.shutdown();
	}
}
