package Inner_classes_10;
/*
 * 任意作用域内嵌入一个内部类
 */
public class Parcel6 {
	
	private void internalTracking(boolean b) {
		//并不是说TrackingSlip创建是有条件的，其实和其他类一起编译，但是在定义TrackingSlip作用域之外不可用
		if(b) {
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id = s;
				}
				String getSlip() {	return id;	}
			}
			TrackingSlip ts = new TrackingSlip("Slip");
			String s = ts.getSlip();
		}
		//TrackingSlip ts = new TrackingSlip("x");
	}
	
	public void track() {	internalTracking(true);	}
	
	public static void main(String[]args) {
		Parcel6 p = new Parcel6();
		p.track();
	}
}
