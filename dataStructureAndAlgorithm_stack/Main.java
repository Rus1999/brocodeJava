package dataStructureAndAlgorithm_stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		/* stack = LIFO data structure. Last-In-First-Out
		 *		    stores objects into a sort of "vertical tower"
		 *		    push() to add to the top
		 *		    pop() to remove from the top	
		 */
		
		/* uses of stack
		 * 1. undo/redo features in text editors
		 * 2. moving back/forward through browser history
		 * 3. backtracking algorithms (maze, file directories)
		 * 4. calling functions (call stack)
		 */
		
		
		Stack<String> stack = new Stack<String>();
		
		
		
		stack.push("Minecraft");
		stack.push("Day Z");
		stack.push("Fallout: New Vegas");
		stack.push("Project zomboy");
		stack.push("Devil May Cry 3");
		
		//System.out.println(stack.empty());

		//remove the last stack and assign to variable
		//String myFavGame = stack.pop();
		
		//look at the top stack
		//System.out.println(stack.peek());
		
		//return position of stack top-bottom (1-n) || return -1 if can't find
		//System.out.println(stack.search("Devil May Cry 3"));
	
		
	}

}
