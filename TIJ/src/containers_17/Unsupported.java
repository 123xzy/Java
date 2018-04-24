package containers_17;

import java.util.*;

/**
 * 
 * @author xzy
 *
 */
public class Unsupported {
	static void test(String msg,List<String> list) {
		System.out.println("--- " + msg + " ---");
		Collection<String> collection = list;
		Collection<String> sublist = list.subList(1, 8);
		Collection<String> collection2 = new ArrayList<String>(sublist);
		try {	collection.retainAll(collection2);	}catch (Exception e) {
			// TODO: handle exception
			System.out.println("retainAll(): " + e);
		}
		try {	collection.removeAll(collection2);	}catch(Exception e) {
			// TODO: handle exception
			System.out.println("removeAll(): " + e);
		}
		try {	collection.clear();	}catch (Exception e) {
			// TODO: handle exception
			System.out.println("clear(): " + e);
		}
		try {	collection.addAll(collection2);	}catch (Exception e) {
			// TODO: handle exception
			System.out.println("addAll(): " + e);
		}
		try {	collection.add("X");	}catch (Exception e) {
			// TODO: handle exception
			System.out.println("add(): " + e);
		}
		try {	collection.remove("C");	}catch (Exception e) {
			// TODO: handle exception
			System.out.println("remove(): " + e);
		}
		try {
			list.set(0, "X");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("List.set(): " + e);
		}
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
		test("Modefiale Copy", new ArrayList<String>(list));
		test("Arrays.aslist()", list);
		test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list)));
	}
}
