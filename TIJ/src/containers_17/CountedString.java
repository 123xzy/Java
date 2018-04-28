package containers_17;

import java.util.*;

import javax.swing.text.html.CSS;

import static net.xzy.Print.*;

/**
 * 怎样写出一份像样的hashCode()
 * @author xzy
 *
 */
public class CountedString {
	private static List<String> created = 
			new ArrayList<String>();
	private String string;
	private int id = 0;
	public CountedString(String string) {
		this.string = string;
		created.add(string);
		for(String string2 : created)
			if(string2.equals(string))
				id++;
	}
	public String toString() {
		return "String: " + string + ",id: " + id +
				" hashCode(): " + hashCode();
	}
	public int hashCode() {
		int result = 17;
		result = 37 * result + string.hashCode();
		result = 37 * result + id;
		return result;
	}
	public boolean equals(Object object) {
		return object instanceof CountedString &&
				string.equals(((CountedString)object).string) &&
				id == ((CountedString)object).id;
	}
	public static void main(String[] args) {
		Map<CountedString, Integer> map = 
				new HashMap<CountedString,Integer>();
		CountedString[] countedStrings = new CountedString[5];
		for(int i = 0;i < countedStrings.length;i++) {
			countedStrings[i] = new CountedString("hi");
			map.put(countedStrings[i], i);
		}
		print(map);
		for(CountedString cString : countedStrings) {
			print("Looking up " + cString);
			print(map.get(cString));
		}
	}
}
