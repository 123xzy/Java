package Inner_classes_10;
import static net.xzy.Print.print;

abstract class Base{
	public Base(int i) {
		print("Base constructor,i = " + i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
	public static Base getBase(int i) {
		//该匿名类的i不要求是final，因为i被传递给了基类的构造器，不在匿名类的内部被直接使用
		return new Base(i) {
			//实例初始化,达到和创建一个构造器一样的效果
			{	print("Inside instance initializer");	}
			public void f() {
				print("In anonymous f()");
			}
		};
	}
	public static void main(String[]args) {
		Base base = getBase(47);
		base.f();
	}
}
