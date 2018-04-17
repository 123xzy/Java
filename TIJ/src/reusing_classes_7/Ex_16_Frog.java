package reusing_classes_7;
/*
 * 练习16：Frog向上转型为Amphibian
 * 练习17：修改Frog，使Frog覆盖基类的方法定义
 */
class Amphibian{
	public void moveInWater() {System.out.println("Moving in water");}
	public void moveOnLand() {System.out.println("Moving on land");}
}

class Frog extends Amphibian{
	public void moveInWater() {System.out.println("swimming");}
	public void moveOnLand() {System.out.println("jumping");}
}
public class Ex_16_Frog {

	public static void main(String[]args) {
		Amphibian frog = new Frog();
		frog.moveInWater();
		frog.moveOnLand();
	}
}
