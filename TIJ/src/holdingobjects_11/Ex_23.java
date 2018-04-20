package holdingobjects_11;
import java.util.*;
import java.util.Map.Entry;
import static net.xzy.Print.*;
/*
 * 对statistics.java产生的数的次数排序
 */

//计数器，记录一个数字出现的次数
class Counter{
	int i = 1;
	//public String toString() {	return Integer.toString(i);	}
}

class HistoUnit implements Comparable<HistoUnit>{
	Counter counter;
	Integer val;
	public HistoUnit(Counter counter,Integer val) {
		this.counter = counter;
		this.val = val;
	}
	//从Camparable继承过来的接口，比较两个键值的大小，
	public int compareTo(HistoUnit o) {
		int lv = o.counter.i;
		int rv = counter.i;
		return (lv < rv ? -1 : (lv == rv ? 0 : 1));
	}
	public String toString() {
		return "Value = " + val + ",Occurrences =" + counter.i + "\n";
	}
}
public class Ex_23 {
	public static Random rand = new Random(47);
	public static void main(String[]args) {
		
		//将键(随机产生的数字)和值(数字出现的次数)加入Map
		Map<Integer,Counter> m = new HashMap<Integer,Counter>();
		for(int i = 0;i < 10000;i++) {
			int r = rand.nextInt(100);
			if(m.containsKey(r)) {
				m.get(r).i++; //计数器+1
			}
			else m.put(r, new Counter());//生成新的计数器
		}
		
		List<HistoUnit> lst = new ArrayList<HistoUnit>();
		Iterator<Entry<Integer,Counter>> it = m.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer,Counter> entry = it.next();
			lst.add(new HistoUnit(entry.getValue(),entry.getKey()));
		}
		Collections.sort(lst);
		System.out.println(lst);
		
	}
}
