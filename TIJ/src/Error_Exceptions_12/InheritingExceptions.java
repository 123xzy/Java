package Error_Exceptions_12;
/*
 * 从已有的异常类继承自定义自己的异常类
 */
class SimpleException extends Exception{}

public class InheritingExceptions {
	public void f() throws SimpleException{
		System.out.println("Throw SimpleException from f()");
		//调用默认构造器
		throw new SimpleException();
	}
	public static void main(String[]args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		}catch(SimpleException e) {
			System.out.println("Caught it!");
		}
	}
}
