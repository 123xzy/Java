package String_13;
/**
 * 格式化输出
 * @author xzy
 *
 */
public class SimpleFormat {
	public static void main(String[] args) {
		int x = 5;
		double y = 3.141592;
		System.out.println("Row1 :[" + x + " " + y + "]");
		System.out.format("Row2 :[%d %f]\n",x,y);
		System.out.printf("Row2 :[%d %f]",x,y);
	}
}
