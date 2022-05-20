package dataStructureAndAlgorithm_linkedList;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		/*LinkedList	=	stores Nodes in 2 parts (data + address)
		 * 					Nodes are in non-consecutive memory locations
		 * 					Elements are linked using pointers
		 * 	
		 * 							 Singly Linked List	
		 * 				 Node				 Node				 Node
		 * 			[data | address] -> [data | address] -> [data | address]
		 * 
		 * 									 Doubly Linked List
		 *  		   Node				 			 Node				 		   Node
		 * 	[address | data | address] -> [address | data | address] -> [address | data | address]
		 * 
		 * 
		 * 	advantages?
		 * 	1. Dynamic Data Structure (allocates needed memory while running)
		 *  2. Insertion and Deletion of Nodes is easy. less big O(1)
		 *  3. No/Low memory waste
		 *  
		 *  disadvantages?
		 *  1. Greater memory usage (additional pointer)
		 *  2. No random access of elements (no index [i])
		 *  3. Accessing/searching elements is more time consuming. more big O(n)
		 *
		 *	uses?
		 *	1. implement Stacks/Queues
		 *	2. GPS navigation
		 *	3. music playlist
		 */

		LinkedList<String> linkedList = new LinkedList<String>();
		
		/*linkedList as a stack
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop();
		*/
		
		/*linkedList as a queue 
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		linkedList.poll();
		*/
		
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		
		//insert  add(index, object)
		linkedList.add(4, "E");
		//remove ([index, object])
		linkedList.remove(4);
		//search for element, return index
		System.out.println(linkedList.indexOf("F"));
		//peek head
		System.out.println(linkedList.peekFirst());
		//peek tail
		System.out.println(linkedList.peekLast());
		//add head
		linkedList.addFirst("1");
		//add tail
		linkedList.addLast("z");
		//remove and return first
		String first = linkedList.removeFirst();
		//remove last and return last
		String last = linkedList.removeLast();

		System.out.println(linkedList);
	}

}
