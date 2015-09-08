package com.bg.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayIndexSearchTest {
	
	private static final int NOT_FOUND_VALUE = -1;
	private static ArrayIndexSearch arrayIndexSearch;
	
	@BeforeClass
	public static void setup() {
		arrayIndexSearch = new ArrayIndexSearch();
	}
	
	@AfterClass
	public static void teardown() {
		arrayIndexSearch = null;
	}
	
	@Test
	public void shouldReturnIndexValueIfArray2FoundInArray1() {
		// Given
		int[] arr1 = {2,3,4,5};
		int[] arr2 = {4,5};

		// When
		int searchIndexValue = arrayIndexSearch.findArrayIndex(arr1, arr2);
		
		// Then
		assertEquals(2, searchIndexValue);
	}
	
	@Test
	public void shouldReturnNotFoundValueIfArray2NotFoundInArray1() {
		// Given
		int[] arr1 = {2,3,4,6,5};
		int[] arr2 = {4,5};

		// When
		int searchIndexValue = arrayIndexSearch.findArrayIndex(arr1, arr2);
		
		// Then
		assertEquals(NOT_FOUND_VALUE, searchIndexValue);
	}

	@Test
	public void shouldReturnNotFoundValueIfArray1LengthIsLessThanArray2() {
		// Given
		int[] arr1 = {4};
		int[] arr2 = {4,5};

		// When
		int searchIndexValue = arrayIndexSearch.findArrayIndex(arr1, arr2);
		
		// Then
		assertEquals(NOT_FOUND_VALUE, searchIndexValue);
	}

	@Test
	public void shouldReturnNotFoundValueIfArray1HasNoValues() {
		// Given
		int[] arr1 = {};
		int[] arr2 = {4,5};

		// When
		int searchIndexValue = arrayIndexSearch.findArrayIndex(arr1, arr2);
		
		// Then
		assertEquals(NOT_FOUND_VALUE, searchIndexValue);
	}

	@Test
	public void shouldReturnNotFoundValueIfArray1IsNull() {
		// Given
		int[] arr1 = null;
		int[] arr2 = {4,5};

		// When
		int searchIndexValue = arrayIndexSearch.findArrayIndex(arr1, arr2);
		
		// Then
		assertEquals(NOT_FOUND_VALUE, searchIndexValue);
	}

	@Test
	public void shouldReturnNotFoundValueIfArray2HasNoValues() {
		// Given
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {};

		// When
		int searchIndexValue = arrayIndexSearch.findArrayIndex(arr1, arr2);
		
		// Then
		assertEquals(NOT_FOUND_VALUE, searchIndexValue);
	}

	@Test
	public void shouldReturnNotFoundValueIfArray2IsNull() {
		// Given
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = null;

		// When
		int searchIndexValue = arrayIndexSearch.findArrayIndex(arr1, arr2);
		
		// Then
		assertEquals(NOT_FOUND_VALUE, searchIndexValue);
	}
}
