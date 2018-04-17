package HoldingYourObjects_11;
import java.util.*;
/**
 * 也不是所有数组都是Iterable
 * 直接把数组传参会报错，说明不存在从数组到Iterablede自动转换，必须手工转换
 * @author xzy
 *
 */
public class ArrayIsNotIterable {
	static<T> void test(Iterable<T> ib) {
		for(T t : ib)
			System.out.println(t + " ");
	}
	public static void main(String[] args) {
		test(Arrays.asList(1,2,3));
		String[] strings = {"A","B","C"};
		//test(strings);
		test(Arrays.asList(strings));
	}
}
