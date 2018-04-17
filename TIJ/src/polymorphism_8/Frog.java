/*
 * 销毁顺序和初始化顺序相反
 * 对于字段，与申明顺序相反
 * 对于基类，应该先对导出类清理，然后才是基类
 * 因为导出类的清理可能会调用基类的一些方法，所以不应该过早的销毁基类
 */
package polymorphism_8;
import net.xzy.Print;

class Characteristic{
	private String s;
	Characteristic(String s){
		this.s = s;
		Print.print("Creating Characteristic" + s);
	}
	protected void dispose() {
		Print.print("disposing Characteristic" + s);
	}
}

class Description{
	private String s;
	Description(String s){
		this.s = s;
		Print.print("Creating Description" + s);
	}
	protected void dispose(){
		Print.print("disposing Description" + s);
	}
}

class LivingCreature{
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic living Creature");
	LivingCreature(){Print.print("LivingCreature()");}
	protected void dispose(){
		Print.print("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature{
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");
	Animal(){Print.print("Animal()");}
	protected void dispose() {
		Print.print("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal{
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	Amphibian(){Print.print("Amphibian()");}
	protected void dispose() {
		Print.print("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}
public class Frog extends Amphibian{
	 private Characteristic p = new Characteristic("Croaks");
	 private Description t = new Description("Eats Bugs");
	 public Frog() {Print.print("Frog()");}
	 protected void dispose() {
		 Print.print("Frog dispose");
		 t.dispose();
		 p.dispose();
		 super.dispose();
	 }
	 public static void main(String[]args) {
		 Frog frog = new Frog();
		 Print.print("Bye!");
		 frog.dispose();
	 }

}
