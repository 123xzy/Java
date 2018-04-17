package interfaces_9;
/*
 * java中的多重继承
 */
interface CanFight{
	void fight();
}

interface CanSwim{
	void swim();
}

interface CanFly{
	void fly();
}

interface CanClimb{
	void CanClimb();
}

class ActionCharacter{
	public void fight() {}
}

//Hero组合了具体类ActionCharacter和接口CanFight，CanSwim，CanFly
class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly{
	public void swim() {}
	public void fly() {}
}
public class Eg_Adventure {
	public static void t(CanFight x) {x.fight();}
	public static void u(CanSwim x) {x.swim();}
	public static void v(CanFly x) {x.fly();}
	public static void w(ActionCharacter x) {x.fight();}
	public static void main(String[]args)
	{
		Hero h = new Hero();
		//Hero依次被向上转型为每一个接口
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
