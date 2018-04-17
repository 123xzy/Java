package Inner_classes_10;

public class Ex_12 {
	private int i = 10;
	private void f() {
		System.out.println("f()");
	}
	public void g() {
		new Object() {
			void h() {
				i++;
				f();
			}
		}.h();
	System.out.println("i = "+i);
	}
	public static void main(String[]args) {
		Ex_12 in = new Ex_12();
		in.g();
	}
}
