package basicJava_dynamicpolymorphism;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//to take many shapes/forms after program is running
		Scanner scanner = new Scanner(System.in);
		
		//declare type first but we don't know that user will want what type of animal(instance of a class) to create 
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.println("1=dog OR 2=cat");
		int userInput = scanner.nextInt();
		
		if(userInput==1) {
			//animal object will created with Dog structure class
			animal = new Dog();
			animal.speak();
		}
		else if(userInput==2) {
			//animal object will create with Cat structure class
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("Your choice is invalid");
			animal.speak();
		}
	}
}
