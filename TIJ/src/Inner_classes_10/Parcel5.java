package Inner_classes_10;
/*
 * 局部内部类
 */
public class Parcel5 {
	//向上转型为基类
	public Destination destination(String s) {
		//该类是destination方法的一部分，不是parcel的一部分
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo) {
				label = whereTo;
			}
			public String readLabel() {	return label;	}
		}
		
		return new PDestination(s);
	}
	
	public static void main(String[]args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Tasmania");
	}
}
