package containers_17;

import java.util.*;
import static net.xzy.Print.*;

/**
 * SortedSet常见功能
 * @author xzy
 *
 */
public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		Collections.addAll(sortedSet, "one two three fout five six seven eight".split(" "));
		print(sortedSet);
		String low = sortedSet.first();
		String high = sortedSet.last();
		print(low);
		print(high);

		Iterator<String> iterator = sortedSet.iterator();
		for(int i = 0;i <= 6 ;i++) {
			if(i == 3)low = iterator.next();
			if(i == 6)high = iterator.next();
			else {
				iterator.next();
			}
		}
		
		print(low);
		print(high);
		print(sortedSet.subSet(low, high));
		print(sortedSet.headSet(high));
		print(sortedSet.tailSet(low));
	}
}
