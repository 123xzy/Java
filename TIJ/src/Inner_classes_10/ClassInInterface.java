package Inner_classes_10;
/*
 * 接口内部的类：
 * 嵌套类可以作为接口的一部分，接口中的任何类都是public和static的，并且可以在内部类中实现外围接口
 * 
 */
public interface ClassInInterface {
	void howdy();
	class Test implements ClassInInterface
	{
		public void howdy() {
			System.out.println("Howdy!");
		}
		public static void main(String[]args) {
			new Test().howdy();
		}
		
	}
	
}
