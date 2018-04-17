package Inner_classes_10;

class StringHolder{
	String s;
	StringHolder(String s){ this.s = s; }
	public String toString() { return s; }
}
public class Ex_2 {
	public static void main(String[]args) {
		Sequence s = new Sequence(10);
		for(int i = 0;i < 10;i++)
			s.add(new StringHolder(Integer.toString(i)));
		Selector selector = s.selector();
		while(!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
	}
}
