package Generics_15.decorator;

import java.util.*;

/**
 * 装饰器模式
 * 装饰器用于满足各种可能的组合
 * @author xzy
 *
 */
class Basic{
	private String value;
	public void set(String val) {	value = val;	}
	public String get() {	return value;	}
}

class Decorator extends Basic{
	protected Basic basic;
	public Decorator(Basic basic) {	this.basic = basic;	}
	public void set(String val) {	basic.set(val);	}
	public String get() {	return basic.get();	}
}

class TimeStamped extends Decorator{
	private final long timeStamp;
	public TimeStamped(Basic basic) {
		super(basic);
		timeStamp = new Date().getTime();
	}
	public long getStamp() {	return timeStamp;	}
}

class SerialNumberd extends Decorator{
	private static long counter = 1;
	private final long serialNumer = counter++;
	public SerialNumberd(Basic basic) {	super(basic);	}
	public long getSerialNumber() {	return serialNumer;	}
}

public class Decoration {
	public static void main(String[] args) {
		TimeStamped timeStamped = new TimeStamped(new Basic());
		TimeStamped timeStamped2 = new TimeStamped(new SerialNumberd(new Basic()));
		SerialNumberd serialNumberd = new SerialNumberd(new Basic());
		SerialNumberd serialNumberd2 = new SerialNumberd(new TimeStamped(new Basic())); 
	}
}
