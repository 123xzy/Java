package initialization_5;
/**
 * 可变参数列表，应用于参数个数或者类型位置的场合
 * 可以不用像VarArgs一样去显式的编写数组语法
 * 对于已经是数组的，则可以直接当做可变参数列表来接受，如printArray((Object[])new Integer[] {1,2,3,4});
 * @author xzy
 *
 */
public class NewVarArgs {
	static void printArray(Object...args) {
		for(Object obj : args)
			System.out.println(obj + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		printArray(new Integer(47),new Float(3.14),
				new Double(11.11));
		printArray(47,3.14F,11.11);
		printArray("one","two","three");
		printArray(new A(),new A(),new A());
		printArray((Object[])new Integer[] {1,2,3,4});
		printArray();
	}
}
