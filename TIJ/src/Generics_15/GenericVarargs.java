package Generics_15;
import java.util.*;
/**
 * 可变参数和泛型方法
 * 可变长参数也就是在方法定义中可以使用个数不确定的参数，对于同一方法可以使用不同个数的参数调用
 * 
 * @author xzy
 *
 */
public class GenericVarargs {
	public static <T> List<T> makeList(T...args){
		List<T> result = new ArrayList<T>();
		for(T item : args)
			result.add(item);
		return result;
	}
	public static void main(String[] args) {
		List<String> lStrings = makeList("A");
		System.out.println(lStrings);
		lStrings = makeList("A","B","C");
		System.out.println(lStrings);
		lStrings = makeList("ABCSFFSS".split(""));
		System.out.println(lStrings);
	}
}
