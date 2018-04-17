package Inner_classes_10;
import Inner_classes_10a.Ex_6_Interface;
/*
 * 匿名类实现接口，并在外部类中定义一个方法返回对接口的引用
 */
public class Ex_13 {
	public Ex_6_Interface get() {
		return new Ex_6_Interface() {
			public void f() {
				System.out.println("f()");
			}
		};
	}
	public static void main(String[]args) {
		Ex_6_Interface in = new Ex_13().get();
		in.f();
	}
}
