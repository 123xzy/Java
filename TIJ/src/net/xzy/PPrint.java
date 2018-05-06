package net.xzy;

import java.util.*;

/**
 * 编写一个灵巧打印机，使输出更容易浏览，可以添加新行和缩排所有元素
 * @author xzy
 *
 */
public class PPrint {
	public static String pformat(Collection<?> collection) {
		//对没有元素和只有一个元素进行特殊处理
		if(collection.size() == 0)return "[]";
		StringBuilder result = new StringBuilder("[");
		for(Object elem : collection) {
			if(collection.size() != 1)
				result.append("\n ");
			result.append(elem);
		}
		if(collection.size() != 1)
			result.append("\n");
		result.append("]");
		return result.toString();
	}
	public static void pprint(Collection<?> collection) {
		System.out.println(pformat(collection));
	}
	public static void pprint(Object[] cObjects) {
		System.out.println(pformat(Arrays.asList(cObjects)));
	}
}
