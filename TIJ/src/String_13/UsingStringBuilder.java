package String_13;
import java.util.*;
/**
 * 如果在toString()中使用循环，最好创建一个StringBuilder对象，用它来构造结果
 * @author lenovo
 *
 */
public class UsingStringBuilder {
	public static Random rand = new Random(47);
	public String toString() {
		StringBuilder result = new StringBuilder('[');
		for(int i = 0;i < 25;i++)
		{
			result.append(rand.nextInt(100));
			result.append(",");
		}
		result.delete(result.length()-2, result.length());
		result.append("]");
		return result.toString();
	}
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}
}
