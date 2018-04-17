package arrays_16;
import java.util.*;
import static net.xzy.Print.*;
/**
 * 复制数组
 * @author xzy
 *
 */
public class CopyingArrays {
	public static void main(String[] args) {
		int[] i = new int[7];
		int[] j = new int[10];
		Arrays.fill(i, 47);
		Arrays.fill(j, 99);
		print(Arrays.toString(i));
		print(Arrays.toString(j));
		System.arraycopy(i, 0, j, 0, i.length);
		print(Arrays.toString(j));
		int[] k = new int[5];
		Arrays.fill(k, 103);
		System.arraycopy(i, 0, k, 0, k.length);
		print(Arrays.toString(k));
		
	}
}
