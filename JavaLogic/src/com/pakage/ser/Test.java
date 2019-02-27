package com.pakage.ser;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	List<Integer> list= new ArrayList();
	list.add(723);
	list.add(11);
	list.add(555);
	list.add(765);
	list.add(444);
	list.add(223);
	 int mzx=list.stream().min((s1,s2)->s2>s1?-1:s1>s2?1:0).get();*/
		//System.out.println("Test.main()"+mzx);
		
	 Integer [] array= {1,20,50,2289,0,55};
	 for(int dumy=array.length/2;dumy>0;dumy/=2) {
		 for(int i=dumy;i<array.length;i++) {
			 int length= array[i];
			 
			 int j=i;
			 while(j>=dumy && array[j-dumy]>length) {
				 array[j]=array[j-dumy];
			      
				 j-=dumy;
				 
			 }
			 array[j]=length;
		 }
		 for(int i=0;i<array.length;i++) {
			 System.out.println(array[i]);
		 }
		 
	 }
	}

}
