package polymorphism_8.music;

import static net.xzy.Print.*;

/**
 * 这样做虽然行得通但是缺点很明显：
 * 如果在添加新的Instrument类，需要再次编写tune方法
 * 而且如果忘记重载新的方法，编译器不会反悔错误信息
 * 
 * 如果编写tune()以基类作为参数，情况就会好很多
 * 这正体现了多态的可扩展性
 * @author xzy
 *
 */

class Stringed extends Instrument{
	public void play(Note note) {
		print("Stringed.play()" + note);
	}
}

class Brass extends Instrument{
	public void play(Note note) {
		print("Brass.play()" + note);
	}
}
public class Music2 {
	public static void tune(Wind wind) {
		wind.play(Note.MIDDLE_C);
	}
	public static void tune(Stringed stringed) {
		stringed.play(Note.MIDDLE_C);
	}
	public static void tune(Brass brass) {
		brass.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(frenchHorn);
		tune(violin);
	}
}
