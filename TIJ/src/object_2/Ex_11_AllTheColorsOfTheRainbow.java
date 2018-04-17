package object_2;

public class Ex_11_AllTheColorsOfTheRainbow {

	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors=newHue;
	}
	public static void main(String[]args) {
		Ex_11_AllTheColorsOfTheRainbow change=new Ex_11_AllTheColorsOfTheRainbow();
		change.changeTheHueOfTheColor(45);
		System.out.println(change.anIntegerRepresentingColors);
	}
}
