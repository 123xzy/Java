package reusing_classes_7;

class Engine{
	public void start() {}
	public void rev() {}
	public void stop() {}
	public void service() {}
}

class Wheel{
	public void inflate(int psi) {}
}

class Window{
	public void rollup() {}
	public void rolldown() {}
}

class Door{
	public Window window=new Window();
	public void open() {}
	public void close() {}
}

public class Ex_14_Car {

	public Engine engine=new Engine();
	public Wheel[] wheel=new Wheel[4];
	public Door
		left=new Door(),
		right=new Door();
	public Ex_14_Car() {
		for(int i=0;i<4;i++)
			wheel[i]=new Wheel();
	}
	public static void main(String[]args) {
		Ex_14_Car car=new Ex_14_Car();
		car.left.window.rollup();
		car.engine.service();
	}
}
