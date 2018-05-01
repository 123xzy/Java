package containers_17;

import java.util.*;

import org.w3c.dom.ls.LSException;

import static net.xzy.Print.*;

/**
 * Collections类内部的静态方法
 * @author xzy
 *
 */
public class Utilities {
	static List<String> list = Arrays.asList(
			"one two three four five six one".split(" "));
	public static void main(String[] args) {
		print(list);
		
		/**
		 * disjoint()两个集合没有任何相同元素时，返回true
		 */
		print("'list' disjoint (four)? : " +
				Collections.disjoint(list, Collections.singletonList("four")));
		
		/**
		 * 分别采用内置的自然比较法，和Comparator进行比较
		 */
		print("max: " + Collections.max(list));
		print("min: " + Collections.min(list));
		
		print("max: " + Collections.max(list, String.CASE_INSENSITIVE_ORDER));
		print("min: " + Collections.min(list,String.CASE_INSENSITIVE_ORDER));
		
		/**
		 * 返回target在source中最后出现的位置，找不到时返回-1
		 */
		List<String> sublist = Arrays.asList("four five six".split(" "));
		print("indexofsublist: " + Collections.indexOfSubList(list, sublist));
		
		/**
		 * 替换所有oldval
		 */
		Collections.replaceAll(list, "one", "Yo");
		print("replaceAll: " + list);
	
		/**
		 * 逆转次序
		 */
		Collections.reverse(list);
		print("reverse: " + list);
	
		/**
		 * 所有元素向后移动distance个位置，后面的元素循环到前面来
		 */
		Collections.rotate(list, 3);
		print("rotate: " + list);
		
		List<String> source = 
				Arrays.asList("in the matrix".split(" "));
		Collections.copy(list, source);
		print("copy: " + list);
		
		/**
		 * 交换i,j元素的位置
		 */
		Collections.swap(list, 0, list.size()-1);
		print("swap: " + list);
		
		/**
		 * 随机改变列表的顺序
		 */
		Collections.shuffle(list,new Random(47));
		print("shuffle: " + list);
		
		Collections.fill(list, "pop");
		print("fill: " + list);
		print("frequency of 'pop': " + Collections.frequency(list, "pop"));
		
		/**
		 * 返回大小为n的list，且不可变，引用都指向x
		 */
		List<String> dups = Collections.nCopies(3, "snap");
		print("dups: " + dups);
		print("'list' disjoint 'dups'?: " + Collections.disjoint(list, dups));
		
		Enumeration<String> enumeration = Collections.enumeration(dups);
		Vector<String> vector = new Vector<String>();
		
		while(enumeration.hasMoreElements())
			vector.addElement(enumeration.nextElement());
		ArrayList<String> arrayList = Collections.list(vector.elements());
		print("arraylist: " + arrayList);
		
	}
	
	
}
