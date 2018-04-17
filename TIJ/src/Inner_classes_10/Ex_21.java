package Inner_classes_10;

/*
 * 创建一个包含嵌套类的接口，该嵌套类中有一个static方法，它将调用接口中的方法，实现该接口，并将实现的
 * 一个实例传递给方法
 */
interface I{
	void f();
	void g();
	class Nested{
		static void call(I impl) {
			System.out.println("call I.f()");
			impl.f();
			System.out.println("call I.g()");
			impl.g();
		}
	}
}
public class Ex_21 {
	public static void main(String[]args) {
		//使用匿名类实现接口
		I impl = new I() {
			public void f() {}
			public void g() {}
		};
		I.Nested.call(impl);
		
	}
}
