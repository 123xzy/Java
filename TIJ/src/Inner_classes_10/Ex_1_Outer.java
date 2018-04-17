package Inner_classes_10;

public class Ex_1_Outer {
	class Inner{}
	public Inner f() {
		return new Inner();
	}
	
	public static void main(String[]args) {
		Ex_1_Outer out = new Ex_1_Outer();
		Ex_1_Outer.Inner i = out.f();
	}
}
