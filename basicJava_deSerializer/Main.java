//must be on the separate default package of the project
package basicJava_deSerializer;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//Step to Deserialize
		// 1.Declare your object (don't instantiate)
		// 2.Your class should implement Serializable interface
		// 3.add import java.io.Serializable;
		// 4.FileInputStream fileIn = new FileInputStream(file path);
		// 5.ObjectInputStream in = new ObjectInputStream(fileIn);
		// 6.objectName = (Class) in.readObject();
		// 7.in.close(); fileIn.CLose();
		
		//Important notes	1.children classes of a parent class that implements Serializable will do so as well
		//					2.static fields are not serialized (they belong to the class, not an individual object)
		//					3.the class's definition ("class file") itself is not recored, cast it as the object type
		//					4.Fields declared as "transient" aren't serialized, they're ignored
		//					5.serialVersionUID is a unique version ID
		
		//serialVersionUID = serialVersionUID is a unique ID that functions like a version #
		//					 verifies that the sender and receiver of a serialized object,
		//					 have loaded classes for that object that match
		//					 Ensures object will be compatible between machines
		//					 Number must match . otherwise this will cause a InvalidClassException
		//					 A SerialVersionUID will be calculated based on class properties, members, etc.
		//					 A serializable class can declare its own serialVersionUID explicitly (recommend)
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("R:\\workspace\\Java-Eclipse\\Bro Code\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		//must cast to date type when readed
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.sayHello();
		
		//work if run on the same package
	}

}
