package interfaces_9;
/*
 * 组合接口时名字冲突
 */

interface I1{void f();}
interface I2{int f(int i);}
interface I3{int f();}

class c{public int f() {return 1;}}

class c2 implements I1,I2{
	public void f() {}
	public int f(int i) {return 1;}
}

class c3 extends c implements I2{
	public int f(int i) {return 1;}//重载
}

class c4 extends c implements I3{
	public int f() {return 1;}
}

//The return types are incompatible for the inherited methods I1.f(), I3.f()
//重载方法不能通过返回类型区分
//class c5 extends c implements I1{}
//interface I4 extends I1,I3{}

public class Eg_InterfaceCollision {

}
