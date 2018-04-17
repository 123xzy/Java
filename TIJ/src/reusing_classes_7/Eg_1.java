package reusing_classes_7;

class WaterSource{
	private String s;
	WaterSource(){
		System.out.println("WaterSource()");
		s="Constructed";
	}
	public String toString() {return s;}
}

public class Eg_1{
	private String valve1,valve2,valve3,valve4;
	private WaterSource source=new WaterSource();
	private int i;
	private float f;
	public String toString() {
		return 
				"valve1="+valve1+" "+
				"valve2="+valve2+" "+
				"valve3="+valve3+" "+
				"valve4="+valve4+"\n"+
				"i="+i+" "+"f="+f+" "+
				"source="+source;
	}
	public static void main(String[]args) {
		Eg_1 sprinklers=new Eg_1();
		System.out.println(sprinklers);
	}
}

