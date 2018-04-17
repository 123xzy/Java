package Error_Exceptions_12;
/*
 * 创建自定义异常
 */
class MyException extends Exception{
	public MyException() {}
	//带参数的构造器法，用super调用基类构造器
	public MyException(String msg) {	super(msg);	}
}

public class FullConstructors {
	public static void f() throws MyException{
		System.out.println("Throw MyException from f()");
		throw new MyException();
	}
	public static void g() throws MyException{
		System.out.println("Throw MyException from g()");
		throw new MyException("Originated in g()");
	}
	public static void main(String[]args) {
		try {
			f();
		}catch(MyException m) {
			//打印从方法调用处直到异常抛出处的方法调用序列
			m.printStackTrace(System.err);//标准错误输出流，不被重定向，
			//m.printStackTrace();默认版本即输出到标准错误流
		}
		
		try {
			g();
		}catch(MyException m) {
			m.printStackTrace(System.out);
		}
	}
	
}
