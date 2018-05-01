package containers_17;

import java.util.*;
import net.xzy.*;
import static net.xzy.Print.*;

/**
 * 设定Collection和Map不可修改
 * @author xzy
 *
 */
public class ReadOnly {
	static Collection<String> data =
			new ArrayList<String>(Countries.names(6));
	public static void main(String[] args) {
		Collection<String> collection = 
				Collections.unmodifiableCollection(new ArrayList<String>(data));
		print(collection);
		//collection.add("one");
		
		List<String> aList = Collections.unmodifiableList(
				new ArrayList<String>(data));
		
		ListIterator<String> liT = aList.listIterator();
		print(liT.next());
		//liT.add("one");
		
		Set<String> set = Collections.unmodifiableSet(
				new HashSet<String>(data));
		print(set);
		//set.add("one");
		
		Set<String> strings = Collections.unmodifiableSortedSet(
				new TreeSet<String>(data));
		
		Map<String, String> map = Collections.unmodifiableMap(
				new HashMap<String,String>(Countries.capitals(6)));
		print(map);
		//map.put("Ralph", "howdy");
		
		Map<String,String> sMap = 
				Collections.unmodifiableSortedMap(
						new TreeMap<String,String>(Countries.capitals(6)));
	}
}
