package interfaces_9;

import net.xzy.Print;
import polymorphism_8.Note;

abstract class Instrument {
	private int i;
	public abstract void play(Note n) ;
	public String toString() {return "Instrument";}
	public abstract void adjust();
}
	
class Wind extends Instrument{
	public void play(Note n) {Print.print("Wind.play()"+n);}
	public String toString() {return "Wind";}
	public void adjust() {}
}
	
class Percussion extends Instrument{
	public void play(Note n) {Print.print("Percussion.play()"+n);}
	public String toString() {return "Percussion";}
	public void adjust() {}
}
	
class Stringed extends Instrument{
	public void play(Note n) {Print.print("Stringed.play()"+n);}
	public String toString() {return "Stringed";}
	public void adjust() {}
}
	
class Brass extends Wind{
	public void play(Note n) {Print.print("Brass.play()"+n);}
	public void adjust() {Print.print("Adjusting Brass");}
}
	
class Woodwind extends Wind{
	public void play(Note n) {Print.print("Woodwind.play()"+n);}
	public String toString() {return "Woodwind";}
}

public class Eg_Music4 {

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	
	public static void main(String[]args) {
		Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),		
			new Brass(),
			new Woodwind()			
		};
		tuneAll(orchestra);
	}
}

