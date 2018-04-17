/*
 * @Override是伪代码，所以是可写可不写的．它表示方法重写，写上会给我们带来好处． 
 * 1．可以当注释用,方便阅读． 
 * 2．告诉阅读你代码的人，这是方法的复写． 
 * 3．编译器可以给你验证@Override下面的方法名是否是你父类中所有的，如果没有则报错．
 */
package polymorphism_8;

import net.xzy.Print;

public class Circle extends Shape {
	@Override public void draw() {Print.print("Circle.draw()");} //复写Shape()基类中的draw()方法
	@Override public void erase() {Print.print("Circle.erase()");}
	public void msg() {Print.print("Circle.msg()");}
}

