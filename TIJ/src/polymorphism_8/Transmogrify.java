package polymorphism_8;
import net.xzy.Print;

class Actor{
	public void act() {}
}

class HappyActor extends Actor{
	public void act() {Print.print("HappyActor");}
}

class SadActor extends Actor{
	public void act() {Print.print("SadActor");}
}

class Stage{
	private Actor actor = new HappyActor();
	public void change() {actor = new SadActor();}
	public void performPlay() {actor.act();}
}

public class Transmogrify {
	public static void main(String[]args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}
