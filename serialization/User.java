//must be on the separate default package of the project
package serialization;

import java.io.Serializable;

public class User implements Serializable{
	
	//set the serialVersionUID to 1
	private static final long serialVersionUID = 1L;
	
	String name;
	//transient = ignored
	transient String password;
	
	public void sayHello() {
		System.out.println("Hello "+name);
	}
}
