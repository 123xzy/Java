package containers_17;

/**
 * 每个Test对象都存储了测试的名字，当调test()方法时，必须给出待测容器
 * 以及数据传输对象，保存有待测的各种参数，如size，loops
 * @author xzy
 *
 * @param <C>
 */
public abstract class Test<C> {
	String name;
	public Test(String name) {	this.name = name;	}
	abstract int test(C container,TestParam tp);
}
