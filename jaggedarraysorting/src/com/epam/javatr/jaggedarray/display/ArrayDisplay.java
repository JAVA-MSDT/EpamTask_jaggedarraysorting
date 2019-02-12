package com.epam.javatr.jaggedarray.display;


public class ArrayDisplay {
	
	/**
	 * To print an int array on the same line
	 * @param array to display it.
	 */
	public static void printArrayHorizontally(int[] array) {
		if(array == null) {
			throw new IllegalArgumentException("Array is null");
		}
		for(Integer i : array) {
			System.out.printf("%d%c", i, '\t');
		}
		System.out.println();
	}
	
	/**
	 * To print 2 dimensions array
	 * @param array to display it
	 */
	public static void printTwoDimensionalArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int x = 0; x < array[i].length; x++) {
				System.out.printf("%d%c", array[i][x], '\t');
			}
			System.out.println();
		}
	}
}
