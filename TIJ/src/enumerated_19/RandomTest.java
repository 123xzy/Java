package enumerated_19;

import net.xzy.*;

/**
 * case of RandomEnum
 * @author xzy
 *
 */
enum Activity{	SITTING,LYING,STANDING,HOPPING,RUNNING,DOGING,JUMPING,FALLING,FLYING	}

public class RandomTest {
	public static void main(String[] args) {
		for(int i = 0;i < 5 ;i++)
			System.out.print(Enums.random(Activity.class) + " ");
	}
}
