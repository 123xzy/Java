package reusing_classes_7;

import net.xzy.Print;

class Component1{
	Component1(int i){Print.print("Component1"+i);}
	void dispose() {Print.print("Component1 dispose");}
}

class Component2{
	Component2(int i){Print.print("Component2"+i);}
	void dispose() {Print.print("Component2 dispose");}
}

class Component3{
	Component3(int i){Print.print("Component3"+i);}
	void dispose() {Print.print("Component3 dispose");}
}

class Root{
	Component1 c1=new Component1(1);
	Component2 c2=new Component2(2);
	Component3 c3=new Component3(3);
	public Root() {Print.print("Root");}
	void dispose() {
		Print.print("Root dispose");
		c1.dispose();
		c2.dispose();
		c3.dispose();
	}
}

class Stem extends Root{
	Component1 c1=new Component1(4);
	Component2 c2=new Component2(5);
	Component3 c3=new Component3(6);
	public Stem() {Print.print("Stem");}
	void dispose() {
		Print.print("Stem dispose");
		c1.dispose();
		c2.dispose();
		c3.dispose();
	}
}

public class Ex_9 {

	public static void main(String[]args) {
		new Stem().dispose();
	}
	 
}
