package Inner_classes_10;
import Inner_classes_10a.Ex_6_Interface;
/*
 * 创建一个private内部类，实现一个public接口，写一个方法返回指向private内部类的实例引用，并向上转型为给接口
 * Notice that get2( ) returns an object of the private class Inner. However, when you call get2( ) 
 * from outside of Outer, you can’t use the return value’s actual type because it’s private and 
 * visible only inside the class. You can only upcast the return value to a visible base interface.
 *  Thus, Outer methods can use the actual type, while methods of other classes must use the upcast
 *   result. 
 */
class Outer5 {
	private class Inner implements Ex_6_Interface{
		public void f() {
			System.out.println("Ex_11.Inner.f()");
		}
	}
	public Ex_6_Interface get() {	return new Inner();	}
	public Inner get2() {	return new Inner();	}
}

public class Ex_11{
	public static void main(String[]args) {
		Outer5 out = new Outer5();
		Ex_6_Interface If = out.get();
		If = out.get2();
	}
}
