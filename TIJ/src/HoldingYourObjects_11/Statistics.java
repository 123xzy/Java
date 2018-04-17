package HoldingYourObjects_11;
import java.util.*;
/*
 * 键是由random产生的数字
 * 值是数字出现的次数
 */
public class Statistics {
	public static void main(String[]args) {
		Random rand = new Random(47);
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i = 0;i < 10000;i++)
		{
			int r = rand.nextInt(20);
			Integer freq = m.get(r);//如果随机产生第一次的键，get()将返回null，产生于键相关联的Integer值
			m.put(r,freq == null ? 1 : freq + 1);//发生了Integer的自动包装机制
		}
		System.out.println(m);
	}
}
