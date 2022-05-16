package genericClass;

//limit the T for only the Number class
public class MyGenericClass <T extends Number, V>{
	
	T x;
	V y;
	
	MyGenericClass(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public V getValue() {
		return y;
	}
}
