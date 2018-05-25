package concurrency_21;

import java.util.concurrent.*;
import static net.xzy.Print.*;

public class SimpleDaemons implements Runnable{
	public void run() {
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				print(Thread.currentThread() + " " + this);
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			print("sleep() interrupted");
		}
	}
	public static void main(String[] args)throws Exception {
		for(int i = 0;i < 10;i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);
			daemon.start();
		}
		print("All daemons started");
		TimeUnit.MILLISECONDS.sleep(100);
	}
}
