package dataStructureAndAlogrithm_binarySearch;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//search algorithm that finds the position of a target value within a sorted array.
		//Half of the array is eliminated during each "step"
		
		//runtime complexity is O(log n)
		//useful for large number of data 
		
		int array[] = new int[100];
		int target  = 42;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		// use binary search for array at target [array, target]
		//int index = Arrays.binarySearch(array, target);
	
		int index = binarySearch(array, target);
		
		if(index == -1) {
			System.out.println(target+" not found");
		}
		else {
			System.out.println("Element found at: "+index);
		}
	}

	private static int binarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			
			//calculate middle index
			int middle = low + (high - low) / 2;
			//assigned array[middle] to value
			int value = array[middle];
			
			//print middle value
			System.out.println("middle: "+middle);
			
			if(value < target) {
				low = middle + 1;
			}
			else if(value > target) {
				high = middle - 1;
			}
			else {
				return middle;
			}
		}
		
		return -1;
	}

}
