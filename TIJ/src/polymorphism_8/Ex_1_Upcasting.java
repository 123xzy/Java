/* 向上转型
 * 如果每个子类从同一个父类继承，并且都需要相同的方法时，
 * 方法若是以父类做参数，就不用给每个新类写方法
 */
package polymorphism_8;

class Cycle{
	public int wheels() {return 0;}
}

class Unicycle extends Cycle{
	public int wheels() {return 1;}
}

class Bicycle extends Cycle{
	public int wheels() {return 2;}
}

class Tricycle extends Cycle{
	public int wheels() {return 3;}
}

public class Ex_1_Upcasting {

	//public static void ride(Cycle c) {System.out.println("Upcasting");}
	public static void ride(Cycle c) {System.out.println("Num of wheels:"+c.wheels());}
	public static void main(String[]args) {
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());
		
	}
}
