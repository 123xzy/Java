package Inner_classes_10;
/*
 * 创建内部类的引用
 * 要想直接创建内部类的对象，必须使用外部类的对象来创建内部类对象
 */
public class DotNew {
	public class Inner{}
	public static void main(String[]args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
	}
}
