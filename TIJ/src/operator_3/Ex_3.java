package operator_3;
class Fl{
	float f;
}
public class Ex_3 {

	static void change(Fl f)
	{
		f.f=9f;
	}
	public static void main(String[]args) {
		Fl f1=new Fl();
		f1.f=10f;
		System.out.println(f1.f);
		change(f1);
		System.out.println(f1.f);
	}
}
