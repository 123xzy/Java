package interfaces_9;
import java.util.*;
/*
 * 可以被非常量表达式初始化
 */
//The public type RandVals must be defined in its own file
interface RandVals{
	Random rand = new Random(47);
	int RANDOM_INT = rand.nextInt(10);
}
public class Eg_TestRandVals {
	public static void main(String[]args) {
		System.out.println(RandVals.RANDOM_INT);
	}
}
