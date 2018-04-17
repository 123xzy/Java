package reusing_classes_7;

import net.xzy.Print;

class Game{
	Game(int i){
		Print.print("Game constructor");
	}
}
class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		Print.print("BoardGame constructor");
	}
}
public class Eg_5_Chess extends BoardGame {

	Eg_5_Chess(){
		super(11);
		Print.print("Eg_5_Chess constructor");
	}
	public static void main(String[]args) {
		Eg_5_Chess x=new Eg_5_Chess();
	}
}
