package String_13;
/**
 * String.format()接受和Formatter.format()一样的参数，返回一个String对象
 * 其实在String.format()也是创建了一个Formatter对象，只是这种方法看上去简洁 
 * @author xzy
 *
 */
public class DatabaseException extends Exception{
	public DatabaseException(int transactionID,int queryID,String message) {
		super(String.format("(t%d,q%d) %s",transactionID,queryID,message));
	}
	public static void main(String[] args) {
		try {
			throw new DatabaseException(3,7,"Write failed");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
