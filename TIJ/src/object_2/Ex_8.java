package object_2;

public class Ex_8 {
	static int i=320;
	public static void main(String[]args) {
		Ex_8 s1=new Ex_8();
		Ex_8 s2=new Ex_8();
		Ex_8 s3=new Ex_8();
		System.out.println(s1.i);
		s2.i++;
		System.out.println(s1.i);
		System.out.println(s2.i);
		System.out.println(s3.i);
	}
}
