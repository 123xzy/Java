package typeinfo_14.pets;

/**
 * 
 * @author xzy
 *
 */
public class Individual implements Comparable<Individual> {
	private static long counter = 0;
	private final long id = counter++;
	private String name;
	public Individual(String name) {
		this.name = name;
	}
	public Individual() {}
	public String toString() {
		return getClass().getSimpleName() + 
				(name == null ? "" : " " + name);
	}
	public long id() {	return id;	}
	public boolean equals(Object object) {
		return object instanceof Individual &&
				id == ((Individual)object).id;
	}
	public int hashCode() {
		int result = 17;
		if(name != null)
			result = 37 * result + name.hashCode();
		result = 37 * result + (int)id;
		return result;
	}
	public int compareTo(Individual arg) {
		String first = getClass().getSimpleName();
		String argfirst = arg.getClass().getSimpleName();
		int firstCompare = first.compareTo(argfirst);
		if(firstCompare != 0)
			return firstCompare;
		if(name != null && arg.name != null) {
			int secondCompare = name.compareTo(arg.name);
			if(secondCompare != 0)
				return secondCompare;
		}
		return (arg.id < id ? -1 :(arg.id == id ? 0 : 1));
	}
}
