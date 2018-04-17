package String_13;
import java.util.*;
/**
 * 格式化说明符，和c语言中的类似
 * @author lenovo
 *
 */
public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printTitle() {
		f.format("%-15s %5s %10s\n", "Item","Qty","Price");
		f.format("%-15s %5s %10s\n","----","---","-----" );
	}
	public void print(String name,int qty,double price) {
		f.format("%-15.15s %5d %10.0f\n", name,qty,price);
		total += price;
	}
	public void printToTal() {
		f.format("%-15s %5s %10.2f\n", "Tax"," ",total * 0.06);
		f.format("%-15s %5s %10s\n", "","","-----");
		f.format("%-15s %5s %10.2f\n", "Total","",total * 1.06);
	}
	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("jack's magic beans", 4, 4.25);
		receipt.printToTal();
	}
}
