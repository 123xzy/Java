package HoldingYourObjects_11;
import java.util.*;
/*
 * 向上转型，作用于泛型，
 * 打印类名，后面跟随的是对象的散列码的无符号十六进制表示
 */
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}

public class GenericsAndUpcasting {
	public static void main(String[]args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for(Apple c : apples)
			System.out.println(c);
	}
}
