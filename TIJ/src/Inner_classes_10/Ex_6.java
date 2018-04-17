package Inner_classes_10;
import Inner_classes_10b.Ex_6_Class;
import Inner_classes_10a.Ex_6_Interface;
/*
 * 第一个包创建至少含有一个方法的接口，第二个包创建一个类，其中增加一个protected的内部类以实现接口
 * 第三个包中继承这个类，并在一个方法中返回protected内部类的对象，返回时向上转型为接口的类型
 */
public class Ex_6 extends Ex_6_Class{
	public Ex_6_Interface get() {
		return new Inner();
	}
	public static void main(String[]args) {
		new Ex_6().get().f();
	}
}
