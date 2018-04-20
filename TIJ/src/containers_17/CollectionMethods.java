package containers_17;

import java.util.*;
import net.xzy.*;
import static net.xzy.Print.*;

/**
 * Collection的基本方法
 * @author xzy
 *
 */
public class CollectionMethods {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();
		//collection.addAll(Countries.names(6));
		collection.add("ten");
		collection.add("eleven");
		print(collection);
		
		Object[] array = collection.toArray();
		String[] strings = collection.toArray(new String[0]);
		
		print("Collections.max(collection) = " + Collections.max(collection));
		print("Collections.min(collection) = " + Collections.min(collection));
		
		Collection<String> collection2 = new ArrayList<String>();
		collection2.add("xzy");
		collection2.add("das");
		collection.addAll(collection2);
		
		print(collection);
		
		collection.remove("ten");
		print(collection);
		collection.remove("eleven");
		print(collection);
		
		collection.removeAll(collection2);
		print(collection);
		
		collection.addAll(collection2);
		print(collection);
		
		String val = "ten";
		print("collection.contains(\"" + val + "\"): " + collection.contains(val));
		
		print(collection);
		collection.clear();
		print(collection);
		
		
	}
}
