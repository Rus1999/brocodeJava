//must be on the separate default package of the project
package deSerializer;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String name;
	transient String password;
	
	public void sayHello() {
		System.out.println("Hello "+name);
	}
}
