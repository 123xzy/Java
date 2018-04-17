package Inner_classes_10;
/* 嵌套类：
 * 如果不需要内部类和外围类对象之间的联系，可以将内部类申明为static
 * 创建嵌套类不需要其外围类的对象
 * 不能从嵌套类的对象中访问非静态的外围类对象
 */
public class Parcel11 {
	private static class ParcelContents implements Contents{
		private int i = 11;
		public int value() {	return i;	}
	}
	protected static class ParcelDestination implements Destination{
		private String label;
		private ParcelDestination(String whereTo) {
			label = whereTo;
		}
		public String readLabel() {	return label;	}
		public static void f() {}
		static int x = 10;
		static class AnotherLevel{
			public static void f() {}
			static int x = 10;
		}
	}
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	public static Contents contents() {
		return new ParcelContents();
	}
	public static void main(String[]args) {
		Contents c = contents();
		Destination d = destination("Tasmania");
	}
}
