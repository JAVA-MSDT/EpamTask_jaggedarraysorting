package com.epam.javatr.jaggedarray.logic.sort;


import com.epam.javatr.jaggedarray.logic.api.ComparingArray;

public class SumSorting implements ComparingArray {

	@Override
	public int compare(int[] arrayOne, int[] arrayTwo) {
		
		if(arraySum(arrayOne) > arraySum(arrayTwo)) {
			return 1;
		} else if(arraySum(arrayOne) < arraySum(arrayTwo)){
			return -1;
		}else {
			return 0;
		}
		

	}

	/**
	 * Summing the array elements
	 * @param array
	 * @return
	 */
	public int arraySum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}
