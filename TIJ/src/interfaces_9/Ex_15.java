package interfaces_9;

import net.xzy.Print;

abstract class Abstract{
	abstract void f();
}

class All2 extends Abstract{
	void f() {Print.print("All2.f()");}
}
	
public class Ex_15 {
	public static void main(String[]args)
	{
		All2 a2 = new All2();
		a2.f();
	}
}
