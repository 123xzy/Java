package control_4;
import java.util.*;
public class Eg_4_6 {
	
	public static void main(String[]args) {
		int a[]=new int[101];
		int i;
		for(i=1;i<=100;i++)
			a[i]=i;
		for(int j:a)
		{
			if(j==74)break;
			if(j%9!=0)continue;
			System.out.print(j+" ");
		}
		
			
	}
}
