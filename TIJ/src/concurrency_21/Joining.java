package concurrency_21;

import static net.xzy.Print.*;

class Sleeper extends Thread{
	private int duration;
	public Sleeper(String name,int sleepTime) {
		super(name);
		duration = sleepTime;
		start();
	}
	public void run() {
		try {
			sleep(duration);
		}catch (InterruptedException e) {
			// TODO: handle exception
			print(getName() + " was interrupted. " +
					"isInterrupted(): " + isInterrupted());
			return;
		}
		print(getName() + " has awakened");
	}
}

class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name,Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}
	public void run() {
		try {
			sleeper.join();
		}catch (InterruptedException e) {
			// TODO: handle exception
			print("Interrupted");
		}
		print(getName() + " join completed");
	}
}

public class Joining{
	public static void main(String[] args) {
		Sleeper
			sleepy = new Sleeper("sleepy", 1500),
			grumpy = new Sleeper("grumpy", 1500);
		Joiner
			dopey = new Joiner("doper", sleepy),
			doc = new Joiner("doc", grumpy);
		grumpy.interrupt();  
	}
}
