package containers_17;

/**
 * 每个都带有不同的TestParm，因此还包含静态的array()方法，使得创建TestPram对象数组变得容易
 * array()第一个版本接受可变参数列表
 * 第二个版本接受相同类型的列表
 * @author xzy
 */
public class TestParam {
	public final int size;
	public final int loops;
	public TestParam(int size,int loops) {
		this.size = size;
		this.loops = loops;
	}
	public static TestParam[] array(int...values) {
		int size = values.length/2;
		TestParam[] result = new TestParam[size];
		int n = 0;
		for(int i = 0;i < size;i++)
			result[i] = new TestParam(values[n++], values[n++]);
		return result;
	}
	public static TestParam[] array(String[] values) {
		int[] vals = new int[values.length];
		for(int i = 0;i < vals.length;i++)
			vals[i] = Integer.decode(values[i]);
		return array(vals);
	}	
}
