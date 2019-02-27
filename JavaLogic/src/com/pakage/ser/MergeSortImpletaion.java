package com.pakage.ser;

import java.util.Arrays;

public class MergeSortImpletaion {

	public static void main(String[] args) {
		  int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
System.out.println("MergeSortImpletaion.main()");
mergeSort(intArray, 0, intArray.length);
for (int i = 0; i < intArray.length; i++) {
    System.out.println(intArray[i]);
}

	}
	public static void mergeSort(int [] input,int start,int end) {
		 if (end - start < 2) {
	            return;
	        }
		int mid=(start+end)/2;
		
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, mid,start, end);
	}
	private static void merge(int[] input, int mid, int start, int end) {
		// TODO Auto-generated method stub
		
		if (input[mid - 1] <= input[mid]) {
            return;
        }
		int i= start;
		int j= mid;
		 int length=0;
		 int temp [] = new int[end-start];
		 while(i<mid && j<end) {
			 temp[length++]= input[i] <= input[j] ? input[i++] : input[j++];
			 
		 }
		  System.arraycopy(input, i, input,start+length , mid - i);
	        System.arraycopy(temp, 0, input, start, length);
	        //System.arra
	}

}
