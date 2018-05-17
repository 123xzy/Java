package enumerated_19;

import static net.xzy.Print.*;

/**
 * 向enum中添加方法
 * @author xzy
 *
 */
public enum OzWitch {
	WEST("Miss Gulch,aka the Wicked witch of the west"),
	NORTH("Glinda,the Good witch of the north"),
	EAST("Wicked witch of the east,wearer of the ruby " +
			"slippers,crushed by doroth's house"),
	SOUTH("good by inference,but missing");
	private String description;
	private OzWitch(String descriotion) {
		this.description = descriotion;
	}
	public String getDescription() {	return description;	}
	public static void main(String[] args) {
		for(OzWitch witch : OzWitch.values())
			print(witch + ": " + witch.getDescription());
	}
}
