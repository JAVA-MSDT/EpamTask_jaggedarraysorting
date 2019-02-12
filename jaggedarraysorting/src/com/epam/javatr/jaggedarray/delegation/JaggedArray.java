package com.epam.javatr.jaggedarray.delegation;


import com.epam.javatr.jaggedarray.logic.api.ComparingArray;

/**
 * Delegation Class to create an object in order to sort a jagged array depending on the ComparingArray class
 * @author Ahmed Samy
 */
public class JaggedArray {

    private int[][] jaggedArray;
    private ComparingArray comparingArray;

    public JaggedArray(int[][] jaggedArray, ComparingArray comparingArray){
        this.jaggedArray = jaggedArray;
        this.comparingArray = comparingArray;
    }

    /**
     * Sorting array in ascending order depends on the criteria of the comparing array interface
     *
     *  jaggedArray Array to be sorted
     *  comparingArray     is an interface reference to one of its subclass of the specified sorting method
     */
    public void sortingAscending() {
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int nextRow = 0; nextRow < jaggedArray.length; nextRow++) {
                if (comparingArray.compare(jaggedArray[row], jaggedArray[nextRow]) < 0) {
                    JaggedRowSwapper(jaggedArray, row, nextRow);

                }

            }
        }
    }


    /**
     * Sorting array in descending order depends on the criteria of the comparing array interface
     *
     *  jaggedArray Array to be sorted
     *  comparingArray     is an interface reference to one of its subclass of the specified sorting method
     */
    public void sortingDescending() {
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int nextRow = 0; nextRow < jaggedArray.length; nextRow++) {
                if (comparingArray.compare(jaggedArray[row], jaggedArray[nextRow]) > 0) {
                    JaggedRowSwapper(jaggedArray, row, nextRow);

                }

            }
        }
    }

    /**
     * it is a helper method
     *
     * @param jagged        array to swap it is internal array reference.
     * @param rowLength
     * @param nextRowLength
     */
    public static void JaggedRowSwapper(int[][] jagged, int rowLength, int nextRowLength) {
        int[] jaggedArrayRowSwap = new int[jagged[rowLength].length];

        jaggedArrayRowSwap = jagged[nextRowLength];
        jagged[nextRowLength] = jagged[rowLength];
        jagged[rowLength] = jaggedArrayRowSwap;

    }
}
