package Inner_classes_10;
/*
 * 在匿名内部类中，如果基类需要带参数的构造器
 */
public class Parcel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			public int value() {
				return super.value()*47;
			}
		};//标记的是表达式的结束，只不过表达式正巧包含了匿名内部类
	}
	public static void main(String[]args) {
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(10);
	}
}
