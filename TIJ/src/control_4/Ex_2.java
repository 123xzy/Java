package control_4;
import java.util.*;
public class Ex_2 {

	static Random rand=new Random(47);
	public static void compare()
	{
		int a=rand.nextInt();
		int b=rand.nextInt();
		if(a>b)
			System.out.println("a>b"+" "+"a="+a+" "+"b="+b);
		else if(a<b)
			System.out.println("a<b"+" "+"a="+a+" "+"b="+b);
		else if(a==b)
			System.out.println("a=b"+" "+"a="+a+" "+"b="+b);
	}
	
	public static void main(String[]args) {
		for(int i=0;i<25;i++)
			compare();
	}
}
