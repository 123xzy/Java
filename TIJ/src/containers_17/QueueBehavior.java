package containers_17;

import java.util.concurrent.*;
import java.util.*;
import net.xzy.*;

/**
 * 队列的应用
 * @author xzy
 *
 */
public class QueueBehavior {
	private static int count = 10;
	static <T> void test(Queue<T> queue , Generator<T> generator) {
		for(int i = 0;i < count;i++)
			queue.offer(generator.next());
		while(queue.peek() != null)
			System.out.print(queue.remove() + " ");
		System.out.println();
	}
	static class Gen implements Generator<String>{
		String[] strings = ("one two three four five six seven eight nine ten").split(" ");
		int i;
		public String next() {	return strings[i++];	}
	}
	public static void main(String[] args) {
		test(new LinkedList<String>(), new Gen());
		test(new PriorityQueue<String>(), new Gen());
		test(new ArrayBlockingQueue<String>(count), new Gen());
		test(new ConcurrentLinkedQueue<String>(), new Gen());
		test(new LinkedBlockingQueue<String>(), new Gen());
		test(new PriorityBlockingQueue<String>(), new Gen());
	}
}
