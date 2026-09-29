package operators;

import java.util.Scanner;

public class CabBookingSystem {

	String customerName;
	String cabType;
	double distance;
	double fare;
	String paymentMode;

	CabBookingSystem() {

		 this("unknown", "unknown");

		System.out.println("no arg constructor called!");
	}

	CabBookingSystem(String customerName, String cabType) {
		
		this( customerName,  cabType, 50);
	//	this.customerName = customerName;
		//this.cabType = cabType;
		// System.out.println("CustomerName: " + customerName);
		// System.out.println("cabType: " + cabType);

	}

	CabBookingSystem(String customerName, String cabType, double distance) {
		this(customerName, cabType, distance,100);
					
//		this.customerName = customerName;
//		this.cabType = cabType;
//		this.distance = distance;

	}

	CabBookingSystem(String customerName, String cabType, double distance, double fare) {
		this(customerName, cabType, distance,fare,"upi");
//		this.customerName = customerName;
//		this.cabType = cabType;
//		this.distance = distance;
//		this.fare = fare;
	}

	CabBookingSystem(String customerName, String cabType, double distance, double fare, String paymentMode) {
		this.customerName = customerName;
		this.cabType = cabType;
		this.distance = distance;
		this.fare = fare;
		this.paymentMode = paymentMode;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter CustomerName: ");
		String name = sc.next();

		System.out.println("Enter cabType: ");
		String cabType = sc.next();
		
		System.out.println("Enter Distance: ");
		double Distance = sc.nextDouble();
		
		int rate = 20;	
		double Fare = Distance * rate;
		
		
		
//		
//		System.out.println("Enter Fare: ");
//		double Fare = sc.nextDouble();
		
		
		
		System.out.println("Enter Payment Mode: ");
		String Mode = sc.next();
		
		
		


		
		
	CabBookingSystem B1 = new CabBookingSystem();

		//CabBookingSystem B2 = new CabBookingSystem();
		B1.CabBookingSystemInfo();

	}

	void CabBookingSystemInfo() {
		
		System.out.println("----- CAB BOOKING DETAILS -----");
		System.out.println("CustomerName: " + customerName);
		System.out.println("CabType: " + cabType);
		System.out.println("Distance : " + distance );
		System.out.println("Fare : " + fare );
		System.out.println("PaymentMode : " + paymentMode );
	}

}
