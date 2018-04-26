package containers_17;

import java.util.*;
import net.xzy.*;
import java.util.concurrent.*;
import static net.xzy.Print.*;

/**
 * 
 * @author xzy
 *
 */
public class Maps {
	public static void printKeys(Map<Integer, String> map) {
		printnb("size = " + map.size() + ", ");
		printnb("keys: ");
		printnb(map.keySet());
	}
	public static void test(Map<Integer, String> map) {
		print(map.getClass().getSimpleName());
		map.putAll(new CountingMapData(25));
		printKeys(map);
		printnb("values: ");
		print(map.values());
		print(map);
		print("map.containsKey(11): " + map.containsKey(11));
		print("map.get(11): " + map.get(11));
		print("map.containsValue(\"F0\"): "
				+ map.containsValue("F0"));
		Integer key = map.keySet().iterator().next();
		print("first key in map: " + key);
		map.remove(key);
		printKeys(map);
		map.clear();
		print("map.isEmpty(): " + map.isEmpty());
		map.putAll(new CountingMapData(25));
		map.keySet().removeAll(map.keySet());
		print("map.isEmpty(): " + map.isEmpty());
	} 
	public static void main(String[] args) {
		test(new HashMap<Integer,String>());
		test(new TreeMap<Integer,String>());
		test(new LinkedHashMap<Integer,String>());
		test(new IdentityHashMap<Integer,String>());
		test(new ConcurrentHashMap<Integer,String>());
		test(new WeakHashMap<Integer,String>());
	}
}
