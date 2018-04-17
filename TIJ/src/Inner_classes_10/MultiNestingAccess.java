package Inner_classes_10;
/*
 * 内部类被嵌套多少层不重要，它能透明的访问所有它所嵌入的外围类的所有成员
 * 
 */
class MNA{
	private void f() {}
	class A{
		private void g() {}
		public class B{
			void h() {
				//即使被定义为private，调用时也无需条件
				g();
				f();
			}
		}
	}
}

public class MultiNestingAccess {
	public static void main(String[]args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();//.new 语法能产生正确的作用域，不必在调用构造器时限定类名
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
	}
}
