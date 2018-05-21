package String_13;

import Generics_15.Coffee;
import Generics_15.CoffeeGenerator;
import java.util.*;

public class ArrayListDisplay {
	public static void main(String[] args) {
		ArrayList<Coffee> coffees = new ArrayList<Coffee>();
		for(Coffee coffee : new CoffeeGenerator(10))
			coffees.add(coffee);
		System.out.println(coffees);
	}
}
