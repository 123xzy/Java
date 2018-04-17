package Generics_15;
import Generics_15.Coffee.*;
import java.util.*;
import net.xzy.*;
/**
 * 利用生成器，可以方便的填充一个Collection，而泛型化这种操作具有实际意义
 * @author xzy
 *
 */
public class Generators {
	public static <T> Collection<T> fill(Collection<T> collection,Generator<T> gen,int n){
		for(int i = 0;i < n;i++)
			collection.add(gen.next());
		return collection;
	}
	public static void main(String[] args) {
		Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		for(Coffee c : coffees)
			System.out.println(c);
		Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
		for(int i : fnumbers)
			System.out.print(i + " ");
	}
}
