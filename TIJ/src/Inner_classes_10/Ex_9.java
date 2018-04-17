package Inner_classes_10;
import Inner_classes_10a.Ex_6_Interface;
/*
 * 创建一个至少含有一个方法的接口，在某个方法内部定义一个内部类以实现此接口，该方法返回对此接口的引用
 */
public class Ex_9 {
	public Ex_6_Interface get() {
	
		class SI implements Ex_6_Interface{
			public void f() {	System.out.println("SI.f()");	}
		}
		
		return new SI();
	}
	
	public static void main(String[]args) {
		Ex_6_Interface si =  new Ex_9().get();
		si.f();
	}
}
