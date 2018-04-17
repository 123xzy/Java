package interfaces_9;

/*
 * 不包含任何抽象方法的抽象类，不能为该类创建任何实例
 */
abstract class Noabstractmethod{
	void f() {System.out.println("f()");}
}

public class Ex_2 {
	public static void main(String[]args) {
		//new Noabstractmethod();
	}
}
