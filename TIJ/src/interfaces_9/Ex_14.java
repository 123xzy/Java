package interfaces_9;
import net.xzy.Print;

interface Interface1{
	void f1();
	void g1();
}

interface Interface2{
	void f2();
	void g2();
}

interface Interface3{
	void f3();
	void g3();
}

interface Multiple extends Interface1,Interface2,Interface3{
	void h();
}

class Concrete{
	String s;
	public Concrete(String s) {this.s = s;}
}

class All extends Concrete implements Multiple{
	All(){super("All");}
	public void h() {Print.print("All.h()");}
	public void f1() {Print.print("All.f1()");}
	public void f2() {Print.print("All.f2()");}
	public void f3() {Print.print("All.f3()");}
	public void g1() {Print.print("All.g1()");}
	public void g2() {Print.print("All.g2()");}
	public void g3() {Print.print("All.g3()");}
}

public class Ex_14 {
	 static void takes1(Interface1 i) {  
		 i.f1();   
		 i.g1();  
	 }
	 static void takes2(Interface2 i) {  
		 i.f2();   
		 i.g2();  
	 }
	 static void takes3(Interface3 i) {  
		 i.f3();   
		 i.g3();  
	 }
	 static void takes4(Multiple i) {  
		 i.f1();   
		 i.g1(); 
		 i.f2();   
		 i.g2(); 
		 i.f3();   
		 i.g3(); 
		 i.h();
	 }
	 public static void main(String[]args) {
		 All a = new All();
		 takes1(a);
		 takes2(a);
		 takes3(a);
		 takes4(a);
	 }
}
