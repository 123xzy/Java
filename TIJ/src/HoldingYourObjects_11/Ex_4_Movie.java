package HoldingYourObjects_11;
import java.util.*;
import net.xzy.*;
import static net.xzy.Print.*;

class MovieGenerator implements Generator<String>
{
	String[] characters = {
			"Grumpu","Happy","Sleepy","Dopey","Doc","Sneezy"
	};
	int next;
	public String next() {
		String r = characters[next];
		next = (next + 1) % characters.length;
		return r ;
	}
}
public class Ex_4_Movie {
	private static final MovieGenerator mng = new MovieGenerator();
	
	static String[] fill(String[] array) {
		for(int i = 0;i < array.length;i++)
			array[i] = mng.next();
		return array;
	}
	
	static Collection<String> fill(Collection<String> collection){
		for(int i = 0;i < 5;i++)
			collection.add(mng.next());
		return collection;
	}
	
	public static void main(String[]args) {
		print(Arrays.toString(fill(new String[5])));
		print(fill(new ArrayList<String>()));
		print(fill(new LinkedList<String>()));
		print(fill(new HashSet<String>()));
		print(fill(new LinkedHashSet<String>()));
		print(fill(new TreeSet<String>()));
	}
}
