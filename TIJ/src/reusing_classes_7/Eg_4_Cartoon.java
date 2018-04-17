package reusing_classes_7;

import net.xzy.Print;

class Art{
	Art(){Print.print("Art constructor");}
}
class Drawing extends Art{
	Drawing(){Print.print("Drawing constructor");}
}
public class Eg_4_Cartoon extends Drawing {

	public Eg_4_Cartoon() {Print.print("Eg_4_Cartoon constructor");}
	public static void main(String[]args) {
		Eg_4_Cartoon x=new Eg_4_Cartoon();
	}
}
