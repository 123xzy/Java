package object_2;

	class StaticTest{
		static int i=47;
	}
	public class Ex_7_Incrementable {
	StaticTest st1=new StaticTest();
	static void increment() {
		StaticTest.i++;
	}
	public static void main(String[]args) {
		Ex_7_Incrementable sf1=new Ex_7_Incrementable();
		Ex_7_Incrementable sf2=new Ex_7_Incrementable();
		sf1.increment();
		System.out.println(StaticTest.i);
		Ex_7_Incrementable.increment();
		System.out.println(StaticTest.i);
	}
	
}
