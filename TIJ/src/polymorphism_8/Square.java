package polymorphism_8;
import net.xzy.Print;

public class Square extends Shape{
	@Override public void draw() {Print.print("Square.draw()");}
	@Override public void erase() {Print.print("Square.erase()");}
}
