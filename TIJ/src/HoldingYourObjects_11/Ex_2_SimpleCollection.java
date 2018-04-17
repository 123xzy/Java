package HoldingYourObjects_11;
import java.util.*;
/*
 * set不包含重复元素
 */
public class Ex_2_SimpleCollection {
	public static void main(String[]args) {
		Collection<Integer> c = new HashSet<Integer>();
		for(int i = 0;i < 10;i++)
			c.add(i);
		c.add(3);
		for(Integer i : c)
			System.out.println(i);
	}
}
