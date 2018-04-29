package holdingobjects_11;
import typeinfo_14.pets.*;
import java.util.*;
import static net.xzy.Print.*;

public class MapOfList {
	public static Map<Person, List<? extends Pet>>
		petPeople = new HashMap<Person,List<? extends Pet>>();
	static {
		petPeople.put(new Person("Dawn"),
				Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
	}	
}
