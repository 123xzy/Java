package polymorphism_8;

/*
 * 协变返回类型：在导出类的被覆盖方法可以返回基类方法的返回类型的某种导出类型
 */

class Grain{
	public String toString() {return "Grain";}
}

class Wheat extends Grain {
	public String toString() {return "Wheat";}
}

class Mill {
	Grain process() {return new Grain();}
}

class WheatMill extends Mill{
	Wheat process() {return new Wheat();}
}
public class CovariantReturn {
	public static void main(String[]args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);  
	}

}
