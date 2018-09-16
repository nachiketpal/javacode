package com.nachiket;
import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray = {1,2,3,4,5,6,7,9,10};
		int [] new_array;
		new_array = getInteger(5);
//		myArray = new int[10];
//		myArray[2] = 50;
		System.out.println(myArray[0]);
		System.out.println(myArray.length);
		printarray(myArray);
	}
	
	public static void printarray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static int[] getInteger(int number) {
		System.out.println("Enter "+number+" values.\r");
		int[] values = new int[number];
		for(int i=0;i<values.length;i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	public static double getAverage(int[] value) {
		int sum = 0;
		for (int i=0;i<value.length;i++) {
			sum+=value[i];
		}
		return (double)sum/value.length;
	}
}
