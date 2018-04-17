package interfaces_9;
/* 
 * Java allows multiple interface inheritance but not 
 * multiple implementation inheritance, which eliminates(防止) 
 * ambiguity(模棱两可) about which of two identical members we use
 * when combining implementations of the same base class.
 * We replicate f( ) in the interfaces above to demonstrate 
 * that Java avoids the “diamond problem” 
 * 允许接口的多重继承，但不允许实现的多重继承，为了防止"菱形问题"的出现
 */
interface BaseInterface{
	void f();
}

interface IntermediateInterface1 extends BaseInterface{
	void f();
}

interface IntermediateInterface2 extends BaseInterface{
	void f();
}

interface CombinedInterface extends IntermediateInterface1,IntermediateInterface2{
	void f();
}

class CombinedImpl implements CombinedInterface{
	public void f() {System.out.println("CombinedImpl.f()");}
}
public class Ex_13 {
	public static void main(String[]args) {
		new CombinedImpl().f();
	}
}
