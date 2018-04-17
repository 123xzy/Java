package Inner_classes_10;
/*
 * 内部类可以访问外围类的方法和字段
 * 
 * Sequence类只是一个固定大小的Object数组，
 */
interface Selector{
	boolean end();
	Object current();
	void next();
}

public class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) { items = new Object[size]; }
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end() { return i == items.length; }//检查是否到了末尾
		public Object current() { return items[i]; }//访问当前对象
		public void next() {if(i < items.length) i++; }//移到下一个对象
		public Sequence sequence() { return Sequence.this; }
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	public static void main(String[]args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0;i < 10;i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.next();
		}
	}
}
