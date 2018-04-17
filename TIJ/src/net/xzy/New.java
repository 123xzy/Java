package net.xzy;
import java.util.*;
/**
 * 
 * @author xzy
 *
 */
public class New {
	public static <K,V> Map<K, V> map(){
		return new HashMap<K,V>();
	}
	public static <T> LinkedList<T> LList(){
		return new LinkedList<T>();
	}
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
	public static <T> Queue<T> queue(){
		return new LinkedList<T>(); 
	}
	
	/**
	 * 测试用例
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<String>> sls = New.map();
		List<String> lStrings = New.list();
		LinkedList<String> lls = New.LList();
		Set<String> ss = New.set();
	}
}
