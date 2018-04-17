package net.xzy;
import java.util.*;
/**
 * 作为泛型方法的一个示例，使用set来表示数学集合的关系式
 * @author xzy
 *
 */

public class Sets {
	//两个集合的并集
	public static<T> Set<T> union(Set<T> a,Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	//两个集合的交集
	public static <T> Set<T> intersection(Set<T> a,Set<T> b){
		Set<T> result = new HashSet(a);
		result.retainAll(b);
		return result;
	}
	//集合superset移除subset包含的元素
	public static <T> Set<T> difference(Set<T> superset,Set<T> subset){
		Set<T> result = new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	//返回除了交集以外的集合元素
	public static <T> Set<T> complement(Set<T> a,Set<T> b){
		return difference(union(a, b), intersection(a, b));
	}
}
