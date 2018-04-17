package Inner_classes_10;
/*
 * 匿名内部类使用外部定义的对象，编译器要求其参数是final的
 */
public class Parcel9 {
	public Destination  destination(final String dest) {
		return new Destination() {
			private String label = dest;
			public String readLabel() {	return label;	}
		};
	}
	public static void main(String[]args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}
}
