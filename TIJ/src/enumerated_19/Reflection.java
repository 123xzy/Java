package enumerated_19;

import java.awt.Window.Type;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;
import net.xzy.OSExecute;
import static net.xzy.Print.*;

enum Explore{	HERE,THERE	}

public class Reflection {
	public static Set<String> analyze(Class<?> enumClass){
		print("-----Analyzing " + enumClass + " -----");
		print("Interfaces:");
		//for(Type type : enumClass.getGenericInterfaces())
			//print(type);
		print("Base: " + enumClass.getSuperclass());
		print("Methods: ");
		Set<String> methods = new TreeSet<String>();
		for(Method method : enumClass.getMethods())
			methods.add(method.getName());
		print(methods);
		return methods;
	}
	
	public static void main(String[] args) {
		Set<String> exploreMethods = analyze(Explore.class);
		Set<String> enumMethods = analyze(Enum.class);
		print("Explore.containsAll(Enum)?" + 
				exploreMethods.containsAll(enumMethods));
		printnb("Explore.removeAll(Enum):");
		exploreMethods.removeAll(enumMethods);
		print(exploreMethods);
		OSExecute.command("javap bin//enumerated_19//Explore.class");
	}
}
