package enumerated_19;

import static net.xzy.Print.*;

/**
 * Enum的一些功能
 * @author xzy
 *
 */
enum Shrubbery{	GROUND,CRAWLING,HANGING	}

public class EnumClass {
	public static void main(String[] args) {
		for(Shrubbery s : Shrubbery.values()) {
			print(s + " ordinal: " + s.ordinal());
			printnb(s.compareTo(Shrubbery.CRAWLING) + " ");
			printnb(s.equals(Shrubbery.CRAWLING) + " ");
			print(s == Shrubbery.CRAWLING);
			print(s.getDeclaringClass());
			print(s.name());
			print("----------------------");
		}
		for(String string : "HANGING CRAWLING GROUND".split(" ")) {
			Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, string);
			print(shrubbery);
		}
	}
}
