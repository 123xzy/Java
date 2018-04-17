package Inner_classes_10;
/*
 * 匿名类,这种语法指的是创建一个继承自contents匿名类的对象，
 * 通过new表达式返回的引用被自动向上转型为对contents的引用
 */
public class Parcel7 {
	public Contents contents(){
		return new Contents() {
			private int i = 11;
			public int value() {	return i;	}
		};
	}
	public static void main(String[]args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
	}
}
