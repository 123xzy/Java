package holdingobjects_11;
import java.util.LinkedList;
/*
 * T表示参数化类型
 */
public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T t){	storage.addFirst(t);	}
	public T peek() {	return storage.getFirst();	}//提供栈顶元素，但不移除
	public T pop() {	return storage.removeFirst();	}//移除并返回栈顶元素
	public boolean empty() {	return storage.isEmpty();	}
	public String toString() {	return storage.toString();	}
}
