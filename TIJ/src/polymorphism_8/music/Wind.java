package polymorphism_8.music;

public class Wind extends Instrument{
	public void play(Note note) {
		System.out.println("Wind.play() " + note);
	}
}
