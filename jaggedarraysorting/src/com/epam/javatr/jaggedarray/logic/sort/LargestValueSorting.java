package com.epam.javatr.jaggedarray.logic.sort;


import com.epam.javatr.jaggedarray.logic.api.ComparingArray;

public class LargestValueSorting implements ComparingArray {

	@Override
	public int compare(int[] arrayOne, int[] arrayTwo) {
		if(largestValue(arrayOne) > largestValue(arrayTwo)) {
			return 1;
		} else if(largestValue(arrayOne) < largestValue(arrayTwo)){
			return -1;
		}else {
			return 0;
		}
	}
	
	/**
	 * finding the largest value in an array of integers
	 * @param array
	 * @return
	 */
public static int largestValue(int[] array) {
	int largestValue = array[0];
	for(int i = 0; i < array.length; i++) {
		if(largestValue < array[i]) {
			largestValue = array[i];
		}
	}
	return largestValue;
}

}
