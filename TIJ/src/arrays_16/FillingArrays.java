package arrays_16;
import java.util.*;
import static net.xzy.Print.*;
/**
 * Arrays.fill方法只能同一个值填充各个位置,或者某个区域
 * @author xzy
 *
 */
public class FillingArrays {
	public static void main(String[] args) {
		int size = 6;
		boolean[] a1 = new boolean[size];
		byte[] a2 = new byte[size];
		String[] a3 = new String[size];
		Arrays.fill(a1, true);
		print(Arrays.toString(a1));
		Arrays.fill(a2, (byte)11);
		print(Arrays.toString(a2));
		Arrays.fill(a3, 3,5,"world");
		print(Arrays.toString(a3));
	}
}
