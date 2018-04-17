package String_13;

import java.util.ArrayList;
import java.util.List;
/**
 * 为了解决InfiniteRecursion类中的无意识递归  
 * 采用super.toString()方法打印对象的内存地址
 * @author xzy
 *
 */
public class Ex_2 {
	public String toString() {
		return "InfiniteRecursion:" + super.toString() + "\n";
	}
	public static void main(String[] args) {
		List<Ex_2> v = new ArrayList<Ex_2>();
		for(int i = 0;i < 10;i++)
			v.add(new Ex_2());
		System.out.println(v);
	}
}
