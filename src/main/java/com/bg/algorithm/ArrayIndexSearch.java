package com.bg.algorithm;

public class ArrayIndexSearch {
	
	/**
	 * This method search the array2 from array1 and if found then return its index
	 * in array1. If not found then return -1 value.
	 * 
	 * @param arr1 set of integer values
	 * @param arr2 set of integer values
	 * @return index of array2 in array1 if found otherwise -1 value
	 */
	public int findArrayIndex(int[] arr1, int[] arr2) {
		final int NOT_FOUND_VALUE = -1;
		
		if(arr1 == null || arr2 == null) {
			return NOT_FOUND_VALUE;
		}
		
		int array1Length = arr1.length;
		int array2Length = arr2.length;
		
		if(array1Length == 0 || array2Length == 0 || array1Length < array2Length) {
			return NOT_FOUND_VALUE;
		}
		
		int secondArraySearchIndex = NOT_FOUND_VALUE;
		boolean found = true;

		for(int i = 0; i < arr1.length; i++) {
			// check length of remaining values in array1 are not less than array2 length
			if((array1Length - i) < array2Length) break;
			found = true;		// reset the found value
			
			// search array2 values in array1 starting from current index of array1 
			for(int j = 0; j < arr2.length; j++) {
				if(arr2[j] != arr1[i + j]) {
					found = false;
					break;
				}
			}
			
			// if found then finish the search process and return the found index value
			if(found) { 
				secondArraySearchIndex = i;
				break;
			}
		} // end of outer loop
		
		return secondArraySearchIndex;
	}
}
