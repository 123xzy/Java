package interfaces_9;
/*
 * 接口中的域都是static final public
 */
public interface Ex_17_Months {
	int 
		JANUARY = 1,FEBRUARY = 2,MARCH =3,
		APRIL = 4, MAY = 5, JUNE = 6,JULY = 7,
		AUGUST = 8, SEPTEMBER = 9 ,OCTOBER = 10,
		MOVEMBER =  11, DECEMBER =12;
	public static void main(String[]args) {
		//Ex_17_Months.APRIL = 5;
		System.out.println(Ex_17_Months.APRIL);
	}
}
