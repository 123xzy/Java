/*
 * 展示组合、继承和多态在构建顺序的作用
 */
package polymorphism_8;
import net.xzy.Print;

class Meal{
	Meal(){Print.print("Meal()");}
}

class Bread{
	Bread(){Print.print("Bread()");}
}

class Cheese{
	Cheese(){Print.print("Cheese()");}
}

class Lettuce{
	Lettuce(){Print.print("Lettuce()");}
}

class Pickle{
	Pickle(){Print.print("Pickle()");}
}
class Lunch extends Meal{
	Lunch(){Print.print("Lunch()");}
}

class PortableLunch extends Lunch{
	PortableLunch(){Print.print("PortableLunch");}
}

public class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();
	public Sandwich() {Print.print("Sandwich()");}
	public static void main(String[]args) {
		Sandwich s = new Sandwich();
	}
}
