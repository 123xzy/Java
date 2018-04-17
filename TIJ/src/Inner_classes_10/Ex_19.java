package Inner_classes_10;
/*
 * The class names produced are: 
 * E19_InnerInsideInner.class  
 * E19_InnerInsideInner$Inner1.class 
 * E19_InnerInsideInner$Inner1$Inner2.class 
 * E19_InnerInsideInner$Nested1.class 
 * E19_InnerInsideInner$Nested1$Nested2.class 
 */
public class Ex_19 {
	class Inner1{
		class Inner2{
			void f() {}
		}
		Inner2 makerInner2() {	return new Inner2();	}
	}
	Inner1 makerInner1() {	return new Inner1();	}
	
	static class Nested1{
		static class Nested2{
			void f() {}
		}
		void f() {}
	}
	
	public static void main(String[]args) {
		new Ex_19.Nested1().f();
		new Ex_19.Nested1.Nested2().f();
		Ex_19 x1 = new Ex_19();
		Ex_19.Inner1 x2 = x1.makerInner1();
		Ex_19.Inner1.Inner2 x3 = x2.makerInner2();
		x3.f();
		
	}
}
