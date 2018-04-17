package arrays_16;
import java.util.*;
/**
 * 返回一个数组，c语言返回的是指向数组的指针，容易造成内存泄漏
 * Java中返回数组则很方便
 * @author xzy
 *
 */
public class IceCream {
	private static Random random = new Random(47);
	static final String[] FLAVORS = {
			"Chocolate","Strawberry","Vanilla Fudge Swirl",
			"Mint Chip","Mocha Almond Fudge","Rum Raisin",
			"Praline Cream","Mud pie"
	};
	public static String[] flavorSet(int n) {
		if(n > FLAVORS.length)
			throw new IllegalArgumentException("set too big");
		String[] results = new String[n];
		boolean[] picked = new boolean[FLAVORS.length];
		for(int i = 0;i < n;i++)
		{
			int t;
			do 
				t = random.nextInt(FLAVORS.length);
			while(picked[t]);
			results[i] = FLAVORS[t];
			picked[t] = true;
		}
		return results;
	}
	
	public static void main(String[] args) {
		for(int i = 0;i < 7;i++)
			System.out.println(Arrays.toString(flavorSet(3)));
	}
}
