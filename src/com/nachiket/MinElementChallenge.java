package com.nachiket;

import java.util.Scanner;
public class MinElementChallenge {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input_array = readIntegers();
		int min_element = find_min(input_array);
		System.out.println("The minimum element is "+min_element);
	}
	
	public static int[] readIntegers() {
		System.out.println("How many numbers would you likt to enter?\n");
		int num = scanner.nextInt();
		int[] array = new int[num];
		System.out.println("Enter the "+num+" numbers");
		for(int i=0;i<num;i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	
	public static int find_min(int[] array) {
		int min = array[0];
		for(int i=1; i < array.length;i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
