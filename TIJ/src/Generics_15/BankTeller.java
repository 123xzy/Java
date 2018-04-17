package Generics_15;
import java.util.*;
import net.xzy.*;
/**
 * 匿名内部类
 * 由于Customer和Teller都是private的构造器，所以必须强制使用Generator对象
 * @author xzy
 *
 */
class Customer{
	private static long counter = 1;
	private final long id = counter++;
	private Customer() {}
	public String toString() {	return "Customer " + id;	}
	public static Generator<Customer> generator(){
		return new Generator<Customer>() {
			@Override
			public Customer next() {
				// TODO Auto-generated method stub
				return new Customer();
			}
		};
	}
}

class Teller{
	private static long counter = 1;
	private final long id = counter++;
	private Teller() {}
	public String toString() {	return "Teller " + id ;	}
	public static Generator<Teller> generator = new Generator<Teller>() {
		@Override
		public Teller next() {
			// TODO Auto-generated method stub
			return new Teller();
		}
	};
}

public class BankTeller {
	public static void serve(Teller teller, Customer c) {
		System.out.println(teller + " serves " + c);
	}
	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<Customer> queue = new LinkedList<Customer>();
		Generators.fill(queue, Customer.generator(),15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator, 4);
		for(Customer c : queue)
			serve(tellers.get(rand.nextInt(tellers.size())), c);
	}
}
