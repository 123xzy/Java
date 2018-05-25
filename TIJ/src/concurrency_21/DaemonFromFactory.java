package concurrency_21;

import java.util.concurrent.*;
import net.xzy.DaemonThreadFactory;
import static net.xzy.Print.*;

public class DaemonFromFactory implements Runnable{
	public void run() {
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				print(Thread.currentThread() + " " + this);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			print("Interrupted");
		}
	}
	public static void main(String[] args) throws Exception{
		ExecutorService executorService = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for(int i = 0;i < 10;i++)
			executorService.execute(new DaemonFromFactory());
		print("all daemons started");
		TimeUnit.MILLISECONDS.sleep(500);
	}
}
