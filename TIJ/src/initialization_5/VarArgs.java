package initialization_5;
/**
 * 所有类都间接或者直接继承与object类，所以可以创建以object数组为参数的方法
 * @author xzy
 *
 */
class A{}

public class VarArgs {
	static void printArray(Object[] args) {
		for(Object obj : args)
			System.out.print(obj + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		printArray(new Object[] {
				new Integer(47),new Float(3.14),new Double(11.11)
		});
		printArray(new Object[] {"one","two","three"});
		printArray(new Object[] {new A(),new A(),new A() });
	}
}
