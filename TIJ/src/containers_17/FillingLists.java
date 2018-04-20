package containers_17;

import java.util.*;

/**
 * 填充容器
 * fill只对list对象有用，且只能替换已有的list存在的元素，不能添加新元素
 * @author xzy
 *
 */
class StringAddress{
	private String string;
	public StringAddress(String string) { this.string = string;	}
	public String toString() {
		return super.toString() + " "  + string;
	}
}
public class FillingLists {
	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("hello")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("World!"));
		System.out.println(list);
	}
}
