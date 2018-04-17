package Inner_classes_10;

public class Ex_3_Outer {
	private String s;
	Ex_3_Outer(String s){ this.s = s; }
	class Inner{
		public String toString() { return s; }
	}
	public Inner getInner() {
		return new Inner();
	}
	public static void main(String[]args) {
		Ex_3_Outer o = new Ex_3_Outer("yeah");
		Ex_3_Outer.Inner i = o.getInner();
		System.out.println(i.toString());
	}
}
