package reusing_classes_7;

class Villain{
	private String name;
	protected void set(String nm) {name=nm;}
	public Villain(String name) {this.name=name;}
	public String toString() {
		return "I'm a Villain and my name is "+name;
	}
}

public class Ex_Orc extends Villain{
	private int orcNumber;
	public Ex_Orc(String name,int orcNumber) {
		super(name);
		this.orcNumber=orcNumber;
	}
	
	public void change(String name,int orcNumber) {
		set(name);
		this.orcNumber=orcNumber;
	}
	public String toString() {
		return "Orc"+orcNumber+":"+super.toString();
	}
	
	public static void main(String[]args) {
		Ex_Orc orc=new Ex_Orc("Limburger",12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
}


