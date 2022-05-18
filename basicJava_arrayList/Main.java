package basicJava_arrayList;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		/*
		
		//Basic
		
		//ArrayList = a resizable array.
		//			  ELements can be added and removed after compilation phase
		//			  store reference data types
		
		
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi");
		//remove specific index
		food.remove(2);
		//clear the ArrayList
		food.clear();
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		*/
		
		
		//--------------------------------------------
		
		//2D ArrayList = a dynamic list of lists
		//You can change the size of these lists during runtime 
		
		//2d ArryaList
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zuchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		//to get first element of the first list
		//System.out.println(groceryList.get(0).get(0));
		
		System.out.println(groceryList.get(2).get(0));
		
	}
}
