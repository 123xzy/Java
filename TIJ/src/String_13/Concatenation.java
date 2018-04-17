package String_13;
/**
 * @brief +重载，正是由于String的只读性，该操作将会产生很多的String对象，也就是很多垃圾回收的中间对象
 * 通过javap -c Concatenation反汇编中看出，编译器自动引入了java.lang.StringBuilder类，因为它更高效
 * 编译器创建一个StringBuilder对象，用来构造最后的String，并调用了三次append()方法，最后调用toString()
 * ，对应指令为astore_2
 * @author xzy
 *
 */
public class Concatenation {
	public static void main(String[] args) {
		String mango = "mango";
		String s = "abc" + mango + "def" + 47;
		System.out.println(s);
	}
}
