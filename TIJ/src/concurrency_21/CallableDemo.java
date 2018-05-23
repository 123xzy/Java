package concurrency_21;
import java.util.*;
import java.util.concurrent.*;

class TaskWithResult implements Callable<String>{
	private int id;
	public TaskWithResult(int id) {
		this.id = id;
	}
	public String call() {
		return "result of TaskWithResult " + id;
	}
}

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i = 0;i < 10;i++)
			results.add(executorService.submit(new TaskWithResult(i)));
		for(Future<String> fs :results)
			try {
				System.out.println(fs.get());
			}catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
				return;
			}catch (ExecutionException e) {
				// TODO: handle exception
				System.out.println(e);
			}finally {
				executorService.shutdown();
			}
	}
}
