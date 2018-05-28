package String_13;
import static net.xzy.Print.*;
/**
 * String对象是不可变的，每个看起来会修改String的方法，实际都是创建
 * 一个全新的String对象，以包含修改后的字符串，最初的String不变
 * @author lenovo
 */
public class Immutable {
	/**
	 * @brief 将得到S的引用拷贝，而不是真的S
	 * @param s
	 * @return String
	 */
	public static String upcase(String s) {
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		String q = "howdy";
		print(q);
		String qq = upcase(q);
		print(q);
		print(qq);
	}
}
