package HoldingYourObjects_11;
import java.util.*;
/**
 * Iterable的接口，该接口包含一个能够产生Iterator的iterator()方法
 * 该接口被foreach用来在序列中移动
 * iterator方法返回的是Iterator的匿名内部类的实例，该实例可以遍历数组的所有单词
 * @author xzy
 *
 */
public class IterableClass implements Iterable<String> {
	protected String[] words = ("And that is how " + 
			"we know the Earth to be banana-shaped.").split(" ");
	public Iterator<String> iterator(){
		return new Iterator<String>() {
			private int index = 0;
			@Override
			public String next() {
				// TODO Auto-generated method stub
				return words[index++];
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < words.length;
			}
		};
	}
	public static void main(String[] args) {
		for(String s : new IterableClass())
			System.out.print(s + " ");
	}
}
