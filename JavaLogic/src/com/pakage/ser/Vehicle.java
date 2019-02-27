package com.pakage.ser;

public class Vehicle {
	public void run() {
		System.out.println("Vehicle.run()");
	}
	
	public static int m1(int a,int b) {
		System.out.println("Vehicle.m1()1111111111");
		return a+b;
		
	}
public static double m1(double a,int b) {
		System.out.println("Vehicle.m1(22222222222222)");
		return (double) (a+b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(2.0, 1);

	}

}

