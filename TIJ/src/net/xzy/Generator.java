package net.xzy;
/**
 * 将泛型引用于接口
 * 生成器是一种专门负责创建对象的类，是工厂设计模式的一种应用
 * 无需任何额外信息就能创建新的对象
 * @author xzy
 *
 * @param <T>
 */
public interface Generator<T> {
	T next();
}
