package containers_17;

import java.util.*;
import static net.xzy.Print.*;

/**
 * 
 * @author xzy
 *
 */
public class ListSortSearch {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Utilities.list);
		list.addAll(Utilities.list);
		print(list);
		
		Collections.shuffle(list,new Random(47));
		print("shuffle: " + list);
		
		ListIterator<String> iterator = list.listIterator(10);
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		print("Trimmed: " + list);
		Collections.sort(list);
		print("sorted: " + list);
		
		String key = list.get(7);
		int index = Collections.binarySearch(list, key);
		print("location of " + key + " is " + index + 
				", list.get(" + index + ") = " + list.get(index));
		
		Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
		print("sorted: " + list);
		
		key = list.get(7);
		index = Collections.binarySearch(list, key,String.CASE_INSENSITIVE_ORDER);
		print("location of " + key + " is " + index + 
				", list.get(" + index + ") = " + list.get(index));
	}
}
