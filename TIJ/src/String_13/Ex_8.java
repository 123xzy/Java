package String_13;

import java.util.Arrays;

/**
 * 在you|the处将字符串划分
 * @author xzy
 *
 */
public class Ex_8 {
	public static void split(String regex) {
		System.out.println(Arrays.toString(Splitting.knights.split(regex)));
	}
	public static void main(String[] args)
	{
		split("you|the");
	}
}
