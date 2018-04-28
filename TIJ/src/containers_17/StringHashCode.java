package containers_17;

/**
 * String有个特点，对于多个String对象，都包含相同的字符串序列，
 * 那么这些对象都映射到同一块内存对象，因此产生相同的hashCode()
 * hashCode()速度快，但不一定唯一，但通过equals()必须能确定对象的身份
 * @author xzy
 *
 */
public class StringHashCode {
	public static void main(String[] args) {
		String[] hellos = "Hello Hello".split(" ");
		/**
		 * 对于String，hashCode()是基于String内容
		 */
		System.out.println(hellos[0].hashCode());
		System.out.println(hellos[1].hashCode());
	}
}
