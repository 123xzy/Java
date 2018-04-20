package holdingobjects_11;
import java.util.*;
/*
 * set保存不重复的元素
 * 10000个随机数被添加进set，但只有三十个数出现
 * HashSet使用的是散列函数
 */
public class SetOfInteger {
	public static void main(String[]args) {
		Random rand = new Random(47);
		Set<Integer> intset = new HashSet<Integer>();
		for(int i = 0;i < 10000 ;i++)
			intset.add(rand.nextInt(30));
		System.out.println(intset);
	}
}
