package enumerated_19;

import static net.xzy.Print.*;

/**
 * enum in switch 
 * @author xzy
 *
 */

enum Signal{	GREEN,YELLOW,RED,	}

public class TrafficLight {
	Signal color = Signal.RED;

	public void change() {
		/* enum has natrue of ints,so we can use it in switch */
		switch (color) {
			/* do not need Signal.RED */
			case RED:	color = Signal.GREEN;
						break;
			case GREEN:	color = Signal.YELLOW;
						break;
			case YELLOW:color = Signal.RED;
						break;
			/* If case has return ,compiler will complain it lack default */
		}
	}
	public String toString() {
		return "The traffic light is " + color;
	}
	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		for(int i = 0;i < 7;i++) {
			print(trafficLight);
			trafficLight.change();
		}
	}
}
