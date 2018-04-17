package reusing_classes_7;
class Base{
	Base(int i){System.out.println(i);}
}
public class Ex_8 extends Base {

	Ex_8(){super(47);}
	Ex_8(int i){super(i);}
	
	public static void main(String[]args) {
		new Ex_8();
		new Ex_8(4);
	}
}
