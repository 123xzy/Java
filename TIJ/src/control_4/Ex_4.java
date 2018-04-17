package control_4;

public class Ex_4 {

	public static void main(String[]args) {
		for(int i=1;i<=100;i++)
		{
			int j;
			for(j=2;j<i;j++)
				if(i%j==0)break;
			if(i==j)System.out.print(i+" ");	
		}
	}
}
