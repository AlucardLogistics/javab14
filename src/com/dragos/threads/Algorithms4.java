package com.dragos.algorithms;

import java.util.Arrays;

public class Algorithms4 {

	public static void main(String[] args) {
		String[] test = {"cad","abc","a","c","191","1","90"};
		System.out.println("Sorting array of strings: ");
		sortString(test);
		System.out.println("Sorting array of strings LONG: ");
		sortStringsLong(test);
		System.out.println("Move ZEROS to the end:");
		int[] arr = {0,2,0,1,0,2,1,2,1,0};
		sortZero(arr);

	}
	
	
	/**
	 * Sort an array of strings {"cad","abc","a","c","191","1","90"}--->{"1","90","191","a","abc","c","cad"}
	 * @param arr
	 */
	private static void sortString(String[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Sort an array of strings {"cad","abc","a","c","191","1","90"}--->{"1","90","191","a","abc","c","cad"}
	 * @param sort
	 */
	private static void sortStringsLong(String[] arr) {
		int n = arr.length;
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareTo( arr[j] ) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Given an array {0,2,0,1,0,2,1,2,1,0} move all zeros to right {2,1,2,1,2,1,0,0,0,0}
	 * @param arr
	 */
	private static void sortZero(int[] arr) {
		int n = arr.length;
		int count = 0; //count non-zero elements
		for(int i = 0; i < n; i++) {
			if(arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		while(count < n) {
			arr[count] = 0;
			count++;
		}
			
			System.out.println(Arrays.toString(arr));	
	}

}
