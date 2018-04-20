package holdingobjects_11;
import java.util.*;
/**
 * 队列有不同的规则，最典型的就是先进先出，优先队列则是申明下一个弹出元素是最需要的元素
 * 实例展示了PriorityQueue和Integer、String、Character这样的内置类型一起工作
 * String中空格的优先级比字母高
 * 如果使用自己的类结合PriorityQueue，就必须包含额外的功能进行排序，或者提供自己的Comparator
 * @author xzy
 *
 */
public class PriorityQueueDemo {
	public static void main(String[]args) {
		PriorityQueue<Integer> prioQ = new PriorityQueue<Integer>();
		Random rand = new Random(47);
		for(int i = 0;i < 10;i++)
			prioQ.offer(rand.nextInt(i + 10));
		QueueDemo.printQueue(prioQ);
		
		List<Integer> ints = Arrays.asList(25,22,20,18,14,9,3,1,1,2,2,3,9,15);
		prioQ = new PriorityQueue<Integer>(ints);
		QueueDemo.printQueue(prioQ);
		
		String st = "GHJQDADJTGJHGJHJG  HJKH HJKH";
		List<String> sts = Arrays.asList(st.split(""));
		PriorityQueue<String> SprioQ = new PriorityQueue<String>(sts);
		QueueDemo.printQueue(SprioQ);
		
		SprioQ = new PriorityQueue<String>(sts.size(),Collections.reverseOrder());
		SprioQ.addAll(sts);
		QueueDemo.printQueue(SprioQ);
		
		Set<Character> charSet = new HashSet<Character>();
		for(char c : st.toCharArray())
			charSet.add(c);
		PriorityQueue<Character> CprioQ = new PriorityQueue<Character>(charSet);
		QueueDemo.printQueue(CprioQ);
	}
}
