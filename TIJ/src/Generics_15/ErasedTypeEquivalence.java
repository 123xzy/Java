package Generics_15;
import java.util.*;
/**
 * 擦除：
 * 初看ArrayList<String>()和ArrayList<Integer>()是不同的类型
 * 但在该例子中却是相同的类型
 * @author xzy
 *
 */
public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class class1 = new ArrayList<String>().getClass();
		Class class2 = new ArrayList<Integer>().getClass();
		System.out.println(class1 == class2);
	}
}
