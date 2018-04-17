package arrays_16;

import java.util.Arrays;
import java.util.Random;
/**
 * 数组构成的向量可以是任意长度
 * @author xzy
 *
 */
public class RaggedArray {
	public static void main(String[] args) {
		Random  random = new Random(47);
		int[][][] a = new int[random.nextInt(7)][][];
		for(int i = 0;i < a.length;i++) {
			a[i] = new int [random.nextInt(5)][];
			for(int j = 0;j < a[j].length;j++)
				a[i][j] = new int[random.nextInt(5)];
		}
		System.out.println(Arrays.deepToString(a));
	}
}
