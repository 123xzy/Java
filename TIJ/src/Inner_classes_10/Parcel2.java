package Inner_classes_10;
/*
 * 外部类方法返回一个指向内部类的引用
 * 想从外部类的非静态方法之外的任意位置创建某个内部类对象，需具体指明对象的类型
 */
public class Parcel2 {
	class Contents{
		private int i = 11;
		public int value() { return i; }
	}
	class Destination{
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel() { return label; }
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	public Contents contents() {
		return new Contents();
	}
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	public static void main(String[]args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Parcel2 q = new Parcel2();
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Borneo");
	}
}
