package arrays_16;
import java.util.*;
import static net.xzy.Print.*;
/**
 * 数组比较
 * @author xzy
 *
 */
public class ComparingArrays {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		int[] a2 = new int[10];
		Arrays.fill(a1, 47);
		Arrays.fill(a2, 47);
		print(Arrays.equals(a1, a2));
		a2[3] = 11;
		print(Arrays.equals(a1, a2));
		String[] s1 = new String[3];
		Arrays.fill(s1, "Hi");
		String[] s2 = { new String("Hi"),new String("Hi"),new String("Hi")	};
		print(Arrays.equals(s1, s2));
	}
}	
