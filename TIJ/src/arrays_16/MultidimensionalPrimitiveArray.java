package arrays_16;
import java.util.*;
/**
 * 多维数组
 * Arrays.deepToString()方法可以将多维数组转换为多个String
 * @author xzy
 *
 */
public class MultidimensionalPrimitiveArray {
	public static void main(String[] args) {
		int[][] a = {
				{1,2,3},
				{4,5,6},
		};
		System.out.print(Arrays.deepToString(a));
	}
}
