package com.nachiket;

import java.util.Arrays;

public class ReverseArrayChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {7,3,4,5,2};
		reversearray(array);
	}
	public static void reversearray(int[] array) {
		System.out.println("The input array is "+Arrays.toString(array));
		System.out.println();
		int[] reverse = new int[array.length];
		for(int i=array.length-1;i>=0;i--) {
			reverse[array.length-1-i] = array[i];
		}
		System.out.println("The reversed array is "+Arrays.toString(reverse));
		System.out.println();
	}
}
