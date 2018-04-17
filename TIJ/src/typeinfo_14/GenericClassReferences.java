package typeinfo_14;
/**
 * 泛化的Class引用
 * Class引用表示的就是它所指的对象的确切类型
 * @author xzy
 *
 */
public class GenericClassReferences {
	public static void main(String[] args){
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;
		intClass = double.class;
		//genericIntClass = double.class;
	}
}
