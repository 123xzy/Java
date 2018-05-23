package concurrency_21;

import java.util.concurrent.*;

public class SingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for(int i = 0 ;i < 5;i++)
			executorService.execute(new LiftOff());
		executorService.shutdown();
	}
}
