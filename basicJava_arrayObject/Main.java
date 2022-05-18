package basicJava_arrayObject;

public class Main {
	public static void main(String[] args) {

		Garage garage = new Garage();
		
		Car car1 = new Car("Honda");
		Car car2 = new Car("Tesla");
		
		garage.park(car1);
		garage.park(car2);
	}
}
