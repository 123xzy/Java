package holdingobjects_11;

import java.util.*;

/**
 * 适配器方法惯用法
 * 现有一个Iterable类，如果想要向前迭代列表，如果直接继承这个类，并覆盖Iterator方法，这样却不能实现向后迭代
 * 因此在默认的前向迭代器的基础上，添加反向迭代器的能力
 * 
 * @author xzy
 *
 */
class ReversibleArrayList<T> extends ArrayList<T>{
	public ReversibleArrayList(Collection<T> collection) {	super(collection);	}
	public Iterable<T> reversed(){
		return new Iterable<T>() {
			public Iterator<T> iterator(){
				return new Iterator<T>() {
					int current = size() - 1;
					public boolean hasNext() {	return current > -1;	}
					public T next() {	return get(current--);	}
					public void remove() {
						throw new  UnsupportedOperationException();
					}
				};
			}
		};
	}
}
public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReversibleArrayList<String> reversibleArrayList =
				new ReversibleArrayList<String>(
						Arrays.asList("To be or not to be".split(" ")));
		for(String string : reversibleArrayList)
			System.out.print(string + " ");
		System.out.println(); 	 
		for(String string : reversibleArrayList.reversed())
			System.out.print(string + " ");
	}
}
