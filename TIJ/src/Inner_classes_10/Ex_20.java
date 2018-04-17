package Inner_classes_10;
/*
 * 创建一个包含嵌套类的接口，实现此接口并创建嵌套类的实例
 * 即使接口没有用，嵌套类始终有用，嵌套类只是置于接口的命名空间内
 * 嵌套类不能访问外部类成员
 */
interface WithNested{
	class Nested{
		int i;
		public Nested(int i) {	this.i = i;	}
		void f() {	System.out.println(i);	}
	}
}

class B2 implements WithNested{}

public class Ex_20 {
	public static void main(String[]args) {
		B2 b = new B2();
		WithNested.Nested WN = new WithNested.Nested(5);
		WN.f();
	}
}
