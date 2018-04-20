package arrays_16;

import javax.management.RuntimeErrorException;

import net.xzy.*;

/**
 * 
 * @author xzy
 *
 */
public class GeneratorTest {
	public static int size = 10;
	public static void test(Class<?> surroundingClass) {
		for(Class<?> type : surroundingClass.getClasses()) {
			System.out.print(type.getSimpleName() + ": ");
			try {
				Generator<?> generator = (Generator<?>)type.newInstance();
				for(int i = 0;i < size;i++)
					System.out.printf(generator.next() + " ");
				System.out.println();
			}catch (Exception e) {
				// TODO: handle exception
				throw new RuntimeException(e);
			}
		}
	} 
	public static void main(String[] args) {
		test(CountingGenerator.class);
	}
}
