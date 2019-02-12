package com.epam.javatr.jaggedarray.logic.sort;


import com.epam.javatr.jaggedarray.logic.api.ComparingArray;

public class SmallestValueSorting implements ComparingArray {

	@Override
	public int compare(int[] arrayOne, int[] arrayTwo) {
		if(smallestValue(arrayOne) > smallestValue(arrayTwo)) {
			return 1;
		} else if(smallestValue(arrayOne) < smallestValue(arrayTwo)){
			return -1;
		}else {
			return 0;
		}
	}
	
	
	/**
	 * finding the smallest value in an array of integers
	 * @param array
	 * @return
	 */
	public static int smallestValue(int[] array) {
		int smallestValue = array[0];
		for(int i = 0; i < array.length; i++) {
			if(smallestValue > array[i]) {
				smallestValue = array[i];
			}
		}
		return smallestValue;
	}

}
