package concurrency_21;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LiftOff {
	public void run() {
		try {
			while(countDown-- > 0){
				System.out.print(status());
				TimeUnit.MILLISECONDS.sleep(100);
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.err.println("Interrupted");
		}		
	}
	public static void main(String[] args) {
		ExecutorService ex = Executors.newCachedThreadPool();
		for(int i = 0;i < 5 ;i++)
			ex.execute(new SleepingTask());
		ex.shutdown();
	}
}
