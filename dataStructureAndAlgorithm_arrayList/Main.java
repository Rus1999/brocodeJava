package dataStructureAndAlgorithm_arrayList;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		/*
		 * advantages:
		 * 1. Random access elements. big O(1)
		 * 2. Good locality of reference and data cache utilization
		 * 3. Easy to insert/delete at the end
		 * 
		 * disadvantages:
		 * 1. Wastes more memory
		 * 2. Shifting elements is time consuming. big O(n)
		 * 3. Expanding/Shrinking the array is time consuming. big O(n)
		 * 
		 */
		
		//ArrayList<String> arrayList = new ArrayList<String>();
	
		//homemade dynamic array
		DynamicArray dynamicArray = new DynamicArray(5);
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		dynamicArray.add("F");
		
		dynamicArray.delete("A");
		dynamicArray.delete("B");
		dynamicArray.delete("C");
		dynamicArray.delete("D");
		
		
		//dynamicArray.insert(0, "X");
		//dynamicArray.delete("A");
		//System.out.println(dynamicArray.search("C"));
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
	
	}
}
