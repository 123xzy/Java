package concurrency_21;

public class BasicThreads {
	public static void main(String[] args) {
		Thread thread = new Thread(new LiftOff());
		thread.start();
		System.out.println("waiting for liftoff");
	}
}
