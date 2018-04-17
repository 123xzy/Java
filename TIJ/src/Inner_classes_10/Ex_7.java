package Inner_classes_10;
/*
 * 内部类能够访问外部类的对象，私有方法和私有域
 */
public class Ex_7 {
	private int i = 10;
	private void f() {}
	class Inner{
		void g() {
			i++;
			f();
		}
	}
	public void h() {
		Inner in = new Inner();
		in.g();
		System.out.println(i);
	}
	public static void main (String[]args) {
		Ex_7 in = new Ex_7();
		in.h();
	}
}
