package holdingobjects_11;
import java.util.*;
/**
 * 展示了foreach和所有collection对象工作的特性
 * @author xzy
 *
 */
public class ForEachCollections {
	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "Take the long way home".split(" "));
		for(String string : cs)
			System.out.println(" " + string + " ");
	}
}
