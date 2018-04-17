package control_4;

public class Ex_1 {
	public static void main(String[]args) {
		int a[]=new int[101];
		int i;
		for(i=1;i<=100;i++)
			a[i]=i;
		for(int j:a)
			System.out.println(j);
	}
}
