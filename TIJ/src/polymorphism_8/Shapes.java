/*
 * 动态绑定机制
 * 虽然不知道具体类型是什么，但可以正确调用draw()方法，
 */
package polymorphism_8;

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[]args) {
		Shape[] s = new Shape[9];
		for(int i = 0;i<s.length;i++)
			s[i] = gen.next();
		for (Shape shp : s) {
			shp.draw();
			shp.msg();
		}
	}
}
