package String_13;
import java.util.Formatter;
/**
 * 修改了Receipt.java，将宽度都由常量来控制，目的是使宽度可以自由修改
 * @author xzy
 *
 */
public class Ex_4 {
	private static final int ITEM_WIDTH = 15;
	private static final int QTY_WIDTH = 5;
	private static final int PRICE_WIDTH = 10;
	private static final String TITLE_FRMT = 
			"%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "s\n";
	private static final String ITEM_FRMT = 
			"%-" + ITEM_WIDTH + "." + ITEM_WIDTH + "s %" + 
			QTY_WIDTH + "d %" + PRICE_WIDTH + ".2f\n";
	private static final String TOTAL_FRMT = 
			"%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + ".2f\n";
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printTitle() {
		f.format(TITLE_FRMT, "Item","Qty","Price");
		f.format(TITLE_FRMT,"----","---","-----" );
	}
	public void print(String name,int qty,double price) {
		f.format(ITEM_FRMT , name,qty,price);
		total += price;
	}
	public void printToTal() {
		f.format(TOTAL_FRMT, "Tax"," ",total * 0.06);
		f.format(TITLE_FRMT, "","","-----");
		f.format(TOTAL_FRMT, "Total","",total * 1.06);
	}
	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("jack's magic beans", 4, 4.25);
		receipt.printToTal();
	}
}
