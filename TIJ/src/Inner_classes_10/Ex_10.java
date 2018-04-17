package Inner_classes_10;
import Inner_classes_10a.Ex_6_Interface;
/*
 * 内部类定义在方法的一个作用域内
 */
public class Ex_10 {
	public Ex_6_Interface get() {
		{
			class SI implements Ex_6_Interface{
				public void f() {	System.out.println("SI.f()");	}
			}
			
			return new SI();//如果return在花括号外面，那内部类对return就是不可见的
		}
		
	}
	
	public static void main(String[]args) {
		Ex_6_Interface si =  new Ex_10().get();
		si.f();
	}
}
