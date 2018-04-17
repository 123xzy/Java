package Generics_15;
import java.lang.reflect.*;
import java.util.*;
/**
 * 泛型表示无意义的事物
 * @author xzy
 *
 * @param <T>
 */
public class ArrayMaker<T> {
	private Class<T> kind;
	public ArrayMaker(Class<T> kind){	this.kind = kind;	}
	@SuppressWarnings("unchecked")
	T[] create(int size) {
		return (T[])Array.newInstance(kind, size);
	}
	public static void main(String[] args) {
		ArrayMaker<String> stringMaker =
				new ArrayMaker<String>(String.class);
		String[] stringArray =stringMaker.create(9);
		System.out.println(Arrays.toString(stringArray));
	}
}
