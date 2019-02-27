package com.pakage.ser;

public class Testingg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=353;
int x = num;
int y=0;
int sum = 0;

while(x>0)
{
    y = x%10;
    sum = sum + y;
    x = x/10;
}
 
if(num%sum == 0)
    System.out.println(num+" is a Harshad Number.");
else
    System.out.println(num+" is not a Harshad Number.");      
}
	}


