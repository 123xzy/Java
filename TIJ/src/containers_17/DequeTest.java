package containers_17;

import net.xzy.*;
import static net.xzy.Print.*;

/**
 * 双向列表测试
 * @author xzy
 *
 */
public class DequeTest {
	static void fillTest(Deque<Integer> deque) {
		for(int i = 20;i < 27;i++)
			deque.addFirst(i);
		for(int i = 50;i < 55;i++)
			deque.addLast(i);
	}
	public static void main(String[] args) {
		Deque<Integer> deque = new Deque<Integer>();
		fillTest(deque);
		print(deque);
		while(deque.size() != 0)
			printnb(deque.removeFirst() + " ");
		print();
		fillTest(deque);
		while(deque.size() != 0) 
			printnb(deque.removeLast() + " ");
	}
}
