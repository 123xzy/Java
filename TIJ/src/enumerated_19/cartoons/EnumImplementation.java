package enumerated_19.cartoons;

import java.util.*;
import net.xzy.*;

/**
 * enum's inherit 
 * @author xzy
 *
 */
enum CartoonCharacter implements Generator<CartoonCharacter>{
	SLAOOY,SPANKY,PUNCHYmSILLY,BOUNCY,NUTTY,BOB;
	private Random rand = new Random(47);
	public CartoonCharacter next() {
		return values()[rand.nextInt(values().length)];
	}
}
public class EnumImplementation {
	public static<T> void printNext(Generator<T> rg) {
		System.out.print(rg.next() + ", ");
	}
	public static void main(String[] args) {
		CartoonCharacter cartoonCharacter = CartoonCharacter.BOB;
		for(int i = 0;i < 10;i++)
			printNext(cartoonCharacter);
	}
}

