package concurrency_21;

import java.util.concurrent.*;

public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for(int i = 0;i < 5;i++)
			executorService.execute(new LiftOff());
		executorService.shutdown();
	}
}
