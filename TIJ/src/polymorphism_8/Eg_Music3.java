package polymorphism_8;
import net.xzy.Print;

class Instrument {
	void play(Note n) {Print.print("Instrument.play()"+n);}
	public String toString() {return "Instrument";}
	void adjust() {Print.print("Adjusting Instrument");}
}
	
class Wind extends Instrument{
	void play(Note n) {Print.print("Wind.play()"+n);}
	public String toString() {return "Wind";}
	void adjust() {Print.print("Adjusting Wind");}
}
	
class Percussion extends Instrument{
	void play(Note n) {Print.print("Percussion.play()"+n);}
	public String toString() {return "Percussion";}
	void adjust() {Print.print("Adjusting Percussion");}
}
	
class Stringed extends Instrument{
	void play(Note n) {Print.print("Stringed.play()"+n);}
	public String toString() {return "Stringed";}
	void adjust() {Print.print("Adjusting Stringed");}
}
	
class Brass extends Wind{
	void play(Note n) {Print.print("Brass.play()"+n);}
	void adjust() {Print.print("Adjusting Brass");}
}
	
class Woodwind extends Wind{
	void play(Note n) {Print.print("Woodwind.play()"+n);}
	public String toString() {return "Woodwind";}
}

public class Eg_Music3 {

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	
	public static void main(String[]args) {
		RandomInstrumentGenerator ins = new RandomInstrumentGenerator();
		for(int i = 0;i<10;i++)
			Print.print(ins.next() );
		/*Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),		
			new Brass(),
			new Woodwind()			
		};
		//tuneAll(orchestra);
		for(Instrument i : orchestra)
			Print.print(i);*/
	}
}
