package holdingobjects_11;
import java.util.*;

interface Selector{
	boolean end();
	Object current();
	void next();
}

class Sequence {
	private final List<Object> items = new ArrayList<Object>();
	public void add(Object x) {	items.add(x);	}
	public class SequenceSelector implements Selector{
		private int i;
		public boolean end() {	return i == items.size();	}
		public Object current() {	return items.get(i);	}
		public void next() {	if(i < items.size())i++;	}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
}

public class Ex_3_Sequence{
	public static void main(String[]args) {
		Sequence sequence = new Sequence();
		for(int i = 0;i < 10;i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.println(selector.current() + " ");
			selector.next();
		}
	}
}
