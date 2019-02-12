package com.epam.javatr.jaggedarray.main;

import com.epam.javatr.jaggedarray.delegation.JaggedArray;
import com.epam.javatr.jaggedarray.display.ArrayDisplay;
import com.epam.javatr.jaggedarray.logic.sort.LargestValueSorting;
import com.epam.javatr.jaggedarray.logic.sort.SmallestValueSorting;
import com.epam.javatr.jaggedarray.logic.sort.SumSorting;

public class Main {
    public static void main(String[] args) {

        int[][] jagged = {
                {5,10,2},
                {4,8,12,25},
                {3,2,1,4},
                {100,2,0}
        };


        System.out.println("=======================( Just Array )========================================= ");
        ArrayDisplay.printTwoDimensionalArray(jagged);

        System.out.println("======================= Sorting the jagged Array in Ascending order =======================");
        System.out.println();

        JaggedArray sumSorting = new JaggedArray(jagged, new SumSorting());
        sumSorting.sortingAscending();
        System.out.println("=======================( RowSumSorting Ascending )========================================= ");
        ArrayDisplay.printTwoDimensionalArray(jagged);

        System.out.println("=======================( LargestValueSorting Ascending)========================================= ");
        JaggedArray largestValueSorting = new JaggedArray(jagged, new LargestValueSorting());
        largestValueSorting.sortingAscending();
        ArrayDisplay.printTwoDimensionalArray(jagged);
        System.out.println("=======================( SmallestValueSorting Ascending)========================================= ");
        JaggedArray smallestValueSorting = new JaggedArray(jagged, new SmallestValueSorting());
        smallestValueSorting.sortingAscending();
        ArrayDisplay.printTwoDimensionalArray(jagged);

        System.out.println("======================= Sorting the jagged Array in Descending order =======================");
        System.out.println();

        sumSorting.sortingDescending();
        System.out.println("=======================( RowSumSorting Descending)========================================= ");
        ArrayDisplay.printTwoDimensionalArray(jagged);

        System.out.println("=======================( LargestValueSorting Descending)========================================= ");
        largestValueSorting.sortingDescending();
        ArrayDisplay.printTwoDimensionalArray(jagged);
        System.out.println("=======================( SmallestValueSorting Descending)========================================= ");
        smallestValueSorting.sortingDescending();
        ArrayDisplay.printTwoDimensionalArray(jagged);
    }
}
