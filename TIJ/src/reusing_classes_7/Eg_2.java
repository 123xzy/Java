package reusing_classes_7;
import static net.xzy.Print.*;
class Soap{
	private String s;
	Soap(){
		print("Soap()");
		s="Constructed";
	}
	public String toString() {return s;}
}
public class Eg_2{
	private String s1="Happy",s2="Happy",s3,s4;
	private Soap castille;
	private int i;
	private float toy;
	public Eg_2() {
		print("Inside Bath()");
		s3="Joy";
		toy=3.14f;
		castille=new Soap();
	}
	{i=47;}
	public String toString() {
		if(s4==null)
			s4="Joy";
		return 
			"s1="+s1+"\n"+
			"s2="+s2+"\n"+
			"s3="+s3+"\n"+
			"i="+i+"\n"+
			"toy="+toy+"\n"+
			"castille="+castille;
	}
	public static void main(String[]args) {
		Eg_2 b=new Eg_2();
		print(b);
	}
}
