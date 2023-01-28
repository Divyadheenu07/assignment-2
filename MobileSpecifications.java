package day2;

public class MobileSpecifications {
	static String mobileBrandName = "oppo F17pro";
	static char mobileLogo = 'O';
	static short noOfMobilePiece = 1000;
	static int modelNumber = 1675;
	static long mobileImeiNumber = 869581051876158L;
	float mobilePrice = 24000f;
	public void isDamaged () {
		boolean isDamaged = false;
		System.out.println("is damaged = "+isDamaged);
	}
	
public static void main(String[] args) {
	MobileSpecifications details = new MobileSpecifications() ;
	details.isDamaged();
	System.out.println("mobile brand name = "+mobileBrandName );
	System.out.println("mobile logo = "+mobileLogo);
	System.out.println("no of mobile piece = "+noOfMobilePiece);
	System.out.println("model number = "+modelNumber);
	System.out.println("mobile imei number = "+mobileImeiNumber);
	System.out.println("mobile price = "+details.mobilePrice);
	
	
			
	
	
}
}

