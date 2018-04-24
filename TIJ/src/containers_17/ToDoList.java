package containers_17;

import java.util.*;

/**
 * 优先级队列
 * 自定义排序标准
 * @author xzy
 *
 */
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
	static class ToDoItem implements Comparable<ToDoItem>{
		private char primary;
		private int secondary;
		private String item;
		public ToDoItem(String td,char pri,int sec) {
			primary = pri;
			secondary = sec;
			item = td;
		}
		public int compareTo(ToDoItem arg) {
			if(primary > arg.primary)
				return +1;
			if(primary == arg.primary)
				if(secondary > arg.secondary)
					return +1;
				else if(secondary == arg.secondary)
					return 0;
			return -1;
		}
		public String toString() {
			return Character.toString(primary) + 
					secondary + ": " + item;
		}
	}
	public void add(String td,char pri,int sec) {
		super.add(new ToDoItem(td, pri, sec));
	}
	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
		toDoList.add("empty trash",'C',4);
		toDoList.add("feed dog",'A',2);
		toDoList.add("feed bird",'B',7);
		toDoList.add("Mow lawn",'C',3);
		toDoList.add("water lawn",'A',1);
		toDoList.add("feed cat",'B',1);
		while(!toDoList.isEmpty())
			System.out.println(toDoList.remove());
	}
}
