package operator_3;

public class Eg_3_8_1 {

	static boolean test1(int val)
	{
		System.out.println("text("+val+")");
		System.out.println("result"+(val<1));
		return val<1;
	}
	
	static boolean test2(int val)
	{
		System.out.println("text("+val+")");
		System.out.println("result"+(val<2));
		return val<2;
	}
	
	static boolean test3(int val)
	{
		System.out.println("text("+val+")");
		System.out.println("result"+(val<3));
		return val<3;
	}
	
	public static void main(String[]args) {
		boolean r=test1(0)&&test2(2)&&test3(2);
		System.out.println(r);
	}
	
}
