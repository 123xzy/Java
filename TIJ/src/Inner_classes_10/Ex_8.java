package Inner_classes_10;

class Outer{
	class Inner{
		private int j;
		private void h() {
			System.out.println("Inner.h");
			System.out.println("Inner.j " + j);
		}
	}
	public void test() {
		Inner i = new Inner();
		i.j = 47;
		i.h();
	}
}
public class Ex_8 {
	public static void main(String[]args) {
		Outer o = new Outer();
		o.test();
	}
}
