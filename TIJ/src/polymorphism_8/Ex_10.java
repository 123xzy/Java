package polymorphism_8;

class TwoMethods{
	public void me1() {
		System.out.println("method1");
		me2();
	}
	public void me2() {
		System.out.println("method2");
	}
}

class Inherited extends TwoMethods{
	public void me2() {
		System.out.println("Inherited method1");
	}
}
public class Ex_10 {
	public static void main(String[]args) {
		TwoMethods x = new Inherited();
		x.me1();
	}
}
