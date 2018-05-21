package enumerated_19;

/**
 * Cover toString()
 * @author xzy
 *
 */
public enum SpaceShip {
	SCOUT,CARGO,TRANSPORT,CRUISER,BATTLESHIP,MOTHERSHIP;
	public String toString() {
		/* Get spaceships' name */
		String id = name();
		
		/* capitalize the first letter */
		String lower = id.substring(1).toLowerCase();
		return id.charAt(0) + lower;
	}
	public static void main(String[] args) {
		for(SpaceShip ship : values()) {
			System.out.println(ship);
		}
	}
}
