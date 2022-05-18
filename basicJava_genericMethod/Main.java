package basicJava_genericMethod;

public class Main {
	public static void main(String[] args) {
		//generics = enable types (classes and interfaces) to be parameters when defining:
		//			 classes, interfaces and methods
		//			 a benefit is to eliminate the need to create multiple versions
		//			 of methods or classes for various data types.
		//			 Use 1 version for all reference data types
	
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		String[] stringArray = {"B", "Y", "E"};
	
		//displayArray(intArray);
		//displayArray(doubleArray);
		//displayArray(charArray);
		//displayArray(stringArray);
		
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));
	}
	
	//<T> is generic method
	public static <T> void displayArray(T[] array) {
		for(T x : array) {
			System.out.print(x+" ");;
		}
		System.out.println();
	}
	
	//return the T
	public static <T> T getFirst(T[] array) {
		return array[0];
	}
	
	/* use above instead of below

	public static void displayArray(Double[] array) {
		for(Double x : array) {
			System.out.println(x+" ");;
		}
		System.out.println();
	}
	
	public static void displayArray(Character[] array) {
		for(Character x : array) {
			System.out.println(x+" ");;
		}
		System.out.println();
	}
	
	public static void displayArray(String[] array) {
		for(String x : array) {
			System.out.println(x+" ");;
		}
		System.out.println();
	}
	
	*/
}
