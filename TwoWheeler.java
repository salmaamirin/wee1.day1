package week1.day1;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=1;
	long chassisNumber=1234567891234L;
	boolean isPunctured=false;
	String bikeName="Royal Enfield Classic";
	double runningKM=123.2345678921987645399;

	public static void main(String[] args) {
		TwoWheeler mybike=new TwoWheeler();
		System.out.println("No of Wheels = " + mybike.noOfWheels);
		System.out.println("No of Wheels = " + mybike.noOfMirrors);
		System.out.println("No of Wheels = " + mybike.chassisNumber);
		System.out.println("No of Wheels = " + mybike.isPunctured);
		System.out.println("No of Wheels = " + mybike.bikeName);
		System.out.println("No of Wheels = " + mybike.runningKM);
		
		// TODO Auto-generated method stub

	}

}
