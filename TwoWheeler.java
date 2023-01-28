package day2;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 3503736544654L;
	boolean isPunctured = false;
	String bikeName = "dio";
	double runningKM = 300;
public static void main(String[]args) {
	TwoWheeler bike = new TwoWheeler ();
	System.out.println("no of wheels = "+bike.noOfWheels);
	System.out.println("no of mirrors = "+bike.noOfMirrors);
	System.out.println("chassis number = "+bike.chassisNumber);
	System.out.println("is pumtured = "+bike.isPunctured);
	System.out.println("bike name = "+bike.bikeName);
	System.out.println("running kilometer = "+bike.runningKM);
}
}
