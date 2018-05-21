package net.xzy;

import java.util.*;

/**
 * random choice from enum by Generics
 * @author xzy
 *
 */
public class Enums {
	private static Random random = new Random(47);
	public static <T extends Enum<T>> T random(Class<T> ec) {
		return random(ec.getEnumConstants());
	}
	public static <T> T random(T[] values) {
		return values[random.nextInt(values.length)];
	}
}
