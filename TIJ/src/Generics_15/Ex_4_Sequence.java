package Generics_15;
/**
 * 将sequence泛型化
 * @author xzy
 *
 * @param <T>
 */
interface Selector<T>{
	boolean end();
	T current();
	void next();
}

class Sequence<T>{
	private Object[] items;
	private int next;
	/**
	 * 构造器
	 * @param size
	 */
	public Sequence(int size) {
		items = new Object[size];
	}
	public void add(T x) {
		if(next < items.length)
			items[next++] = x;
	}
	/**
	 * 队列选择器，内部类
	 * 可以判断队列是否到队尾，当前元素，下一个元素
	 * 将队列的功能封装在一个selector类中
	 * @author xzy
	 */
	private class SequenceSelector implements Selector<T>{
		private int i;
		public boolean end() {	return i == items.length;	}
		public T current() {	return (T)items[i];	}
		public void next() {	if(i < items.length)i++;	}
	}
	public Selector<T> selector(){
		return new SequenceSelector();
	}
}

public class Ex_4_Sequence {
	public static void main(String[] args) {
		Sequence<String> sequence = new Sequence<String>(10);
		for(int i = 0;i < 10;i++)
			sequence.add(Integer.toString(i));
		Selector<String> selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
