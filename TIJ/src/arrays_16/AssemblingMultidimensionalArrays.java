package arrays_16;

import java.util.*;

public class AssemblingMultidimensionalArrays {
	public static void main(String[] args) {
		Integer[][] aIntegers;
		aIntegers = new Integer[3][];
		for(int i = 0;i < aIntegers.length;i++)
		{
			aIntegers[i] = new Integer[3];
			for(int j = 0;j < aIntegers[i].length;j++)
				aIntegers[i][j] = i*j;
		}
		System.out.println(Arrays.deepToString(aIntegers ));
	}
}
