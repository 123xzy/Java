package HoldingYourObjects_11;
import java.util.*;
import static net.xzy.Print.*;
public class QueueDemo {
	public static void printQueue(Queue q) {
		while(q.peek() != null)  //判断队列的头不为空但不移除，element()效果类似但会在空队列时返回异常
			System.out.print(q.remove() + " ");//返回队列的头,poll()队列为空时返回null
		print();
	}
	public static void main(String[]args) {
		Queue<Integer> q = new LinkedList<Integer>();
		Random rand = new Random(47);
		for(int i = 0;i < 10;i++)
			q.offer(rand.nextInt(i + 10));//将随机数加入队列
		printQueue(q);
		Queue<Character> qc = new LinkedList<Character>();
		for(char c : "Bafaffafaf".toCharArray())
			qc.offer(c);
		printQueue(qc);
	}
}
