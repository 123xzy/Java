package Generics_15;

import java.util.*;

/**
 * 混型可以产生一个表示混型中所有类型的类，如果在混型类中修改某些东西
 * 这些修改可以应用于混型所引用的所有类型上
 * 混型的价值之一是可以将特性和行为一致地应用于多个类上
 * 使用接口实现混型
 * @author xzy
 */
interface TimeStamped{	long getStamp();	}

class TimeStampedImp implements TimeStamped{
	private final long timeStamp;
	public TimeStampedImp() {
		timeStamp = new Date().getTime();
	}
	public long getStamp() {	return timeStamp;	}
}

interface SerialNumbered{	long getSerialNumber();	}

class SerialNumberdImp implements SerialNumbered{
	private static long counter = 1;
	private final long serialNumber = counter++;
	public long getSerialNumber() {	return serialNumber;	}
}

interface Basic{
	public void set(String val);
	public String get();
}

class BasicImp implements Basic{
	private String value;
	public void set(String val) {	value = val;	}
	public String get() {	return value;	}
}

class Mixin extends BasicImp implements TimeStamped,SerialNumbered{
	private TimeStamped timeStampe = new TimeStampedImp();
	private SerialNumbered serialNumber = new SerialNumberdImp();
	public long getStamp() {	return timeStampe.getStamp();	}
	public long getSerialNumber() {	return serialNumber.getSerialNumber();	}
}

public class Mixins {
	public static void main(String[] args) {
		Mixin mixin1 = new Mixin(),mixin2 = new Mixin();
		mixin1.set("test string 1");
		mixin2.set("test string 2");
		System.out.println(mixin1.get() + " " +
				mixin1.getStamp() + " " /*mixin1.getSerialNumber()*/);
		System.out.println(mixin2.get() + " " + 
				mixin2.getStamp() + " " /*mixin2.getSerialNumber()*/);
		
	}
}
