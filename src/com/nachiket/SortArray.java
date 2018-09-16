package com.nachiket;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 values.");
		int[] myArray = getIntegers(5);
		myArray = sortArray(myArray);
		System.out.println(Arrays.toString(myArray));
	}
	
	public static int[] getIntegers(int number) {
		int[] values = new int[number];
		for(int i=0;i<values.length;i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static int[] sortArray(int[] array) {
		int count = 0;
		int temp =0;
		for(int i=1;i<array.length;i++) {
			for(int j=0;j<=array.length-(i)-1;j++) {
				count++;
				if(array[j]<array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}
		System.out.println("The count is "+count);
		return array;
	}
}
