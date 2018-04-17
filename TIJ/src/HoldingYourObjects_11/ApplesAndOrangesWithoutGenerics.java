package HoldingYourObjects_11;
import java.util.*;

class Apple{
	private static long counter;
	private final long id = counter++;
	public long id() {	return id;	}
}

class Orange{}

public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[]args) {
		ArrayList apples = new ArrayList();
		for(int i = 0;i < 3;i++)
			apples.add(new Apple());
		//apples.add(new Orange());
		for(int i = 0;i < apples.size();i++)
			//get取出的对象只是object引用，必须将其转型为apple
			((Apple)apples.get(i)).id();
	}
}
