package containers_17;

import java.util.*;
import net.xzy.*;
import static net.xzy.Print.*;

/**
 * 
 * @author xzy
 *
 */
class Letters implements Generator<Pair<Integer, String>>,Iterable<Integer>{
	private int size = 9;
	private int number = 1;
	private char letter = 'A';
	
	public Pair<Integer, String> next(){
		return new Pair<Integer, String>(number++, "" + letter++);
	}
	
	public Iterator<Integer> iterator(){
		return new Iterator() {
			
			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return number++;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return number < size;
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}
public class MapDataTest {
	public static void main(String[] agrs) {
		print(MapData.map(new Letters(), 11));
		print(MapData.map(new CountingGenerator.Character(), 
				"Value",6));
		print(MapData.map(new Letters(), "pop"));
	}
}
