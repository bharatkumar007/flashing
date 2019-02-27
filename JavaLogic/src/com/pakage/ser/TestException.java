package com.pakage.ser;

public class TestException {
	int a=23;
	int b=45;
	public static void method(int a,int b) throws MyException {
		if(b>a) {
			throw new MyException("This is the custome exception");
		}
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			method(23, 44);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
