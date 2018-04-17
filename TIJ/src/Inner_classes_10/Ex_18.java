package Inner_classes_10;
/*
 * You can refer to just the class name when inside the 
 * method of a class with a defined nested (static inner) class, 
 * but outside the class, you must specify the outer class and 
 * nested class, as shown in Other, above.
 */
public class Ex_18 {
	static class Nested{
		void f() {	System.out.println("Nested.f");	}
	}
	public static void main(String[]args) {
		Nested n = new Nested();
		n.f();
	}
}

class Other{
	void f() {
		Ex_18.Nested n = new Ex_18.Nested();
	}
}
