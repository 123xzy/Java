package control_4;
import java.util.*;
public class Eg_4_4_1 {

	public static void main(String[]args) {
		Random rand=new Random();
		float f[]=new float[10];
		for(int i=0;i<10;i++)
		{
			f[i]=rand.nextFloat();
		}
		for(float x:f)
		{
			System.out.println(x);
		}
	}
}
