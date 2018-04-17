package HoldingYourObjects_11;
import java.util.*;
import static net.xzy.Print.*;

public class UniqueWords {
	public static void main(String[]args) {
		Set<String> words = new TreeSet<String>(new TextFile("SetOperations.java","\\W+"));
		print(words);
	}
}
