package holdingobjects_11;
import java.util.*;
import java.util.Map.Entry;
/*
 * Entry是Map的一个接口，entrySet()返回map键值对的集合，并获取迭代器
 */

public class Ex_17 {
	public static void main(String[]args) {
		Map<String,Gerbil> m = new HashMap<String,Gerbil>();
		m.put("Fuzzy", new Gerbil(1));
		m.put("Spot", new Gerbil(2));
		Iterator<Entry<String,Gerbil>> it = m.entrySet().iterator();
		//遍历map
		while(it.hasNext()) {
			Entry<String,Gerbil> entry = it.next();
			//获取键
			System.out.println(entry.getKey() + ": ");
			//获取值，即一个Gerbil实例，并让它产生hop()行为
			entry.getValue().hop();
		}
	}
}
