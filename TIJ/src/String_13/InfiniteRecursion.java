package String_13;
import java.util.*;
/**
 * 无意识递归：
 * return "InfiniteRecursion:" + this + "\n";
 * this原指InfiniteRecursion类型，但是编译器看到+前面是String对象，而后面却不是，
 * 于是将this转换成String，此时要调用toString()方法，就发生了无限递归
 * @author xzy
 *
 */
public class InfiniteRecursion {
	public String toString() {
		return "InfiniteRecursion:" + this + "\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for(int i = 0;i < 10;i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
	}
}
