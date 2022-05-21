package dataStructureAndAlgorithm_comparisonBetweenLinkedListAndArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		//doubly LinkedList
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		//nano second
		long  startTime;
		long endTime;
		long elapsedTime;
		
		for(int i = 0; i < 1000000; i++) {
			linkedList.add(i);
			arrayList.add(i);
		}
		
		
		
		//*******************LinkedList*************
		//appropriate with many insert or delete data
		
		//return current time from JVM
		startTime = System.nanoTime();
		
		//do something
		//linkedList.get(0);
		//linkedList.get(999999);
		linkedList.remove(500000);
		
		endTime = System.nanoTime();
		
		
		elapsedTime = endTime - startTime;
		
		System.out.println("LinkedList:\t" + elapsedTime + "\tns" );
		
		
		
		//*******************ArrayList**************
		//more flexible than linkedList
		
		//return current time from JVM
		startTime = System.nanoTime();
				
		//do something
		//arrayList.get(0);
		//arrayList.get(999999);
		arrayList.remove(500000);
		 
		endTime = System.nanoTime();
				
				
		elapsedTime = endTime - startTime;
				
		System.out.println("ArrayList:\t" + elapsedTime + "\tns" );
	}

}
