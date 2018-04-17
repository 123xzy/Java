package reusing_classes_7;

class A{
	A(int i){System.out.println(i);}
}
class B{
	B(int i){System.out.println(i);}
}
class C extends A{
	C(){super(12);}
	B x=new B(11);
}
public class Ex_5 {

	public static void main(String[]args) {
		C x=new C();
	}
}
