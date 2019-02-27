package com.pakage.ser;

public class LogicTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(recurtionFactorials(7));
		System.out.println(factorials(7));

	}
	
	public static  int recurtionFactorials(int number) {
		if(number==0) {
			return 1;
		}
		
		return number*recurtionFactorials(number-1);
		
	}
	public static int factorials(int num) {
		if(num==0) {
			return 1;
		}
		
		int factorials=1;
		for(int i=1;i<=num;i++) {
			factorials*=i;
		}
		return factorials;
		
	}
}
