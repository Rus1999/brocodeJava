package dataStructureAndAlgorithm_arrayList;

public class DynamicArray {
	
	int size;
	int capacity = 10;
	Object[] array;
	
	public DynamicArray() {
		this.array = new Object[capacity];
	}
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	
	public void add(Object data) {
		
		if(size >= capacity) {
			grow();
		}
		//add data to [size] when call then size++
		array[size] = data;
		size++;
	}
	
	public void insert(int index, Object data) {
		
		if(size >= capacity) {
			grow();
		}
		for(int i = size; i > index; i--) {
			//move data to the right
			array[i] = array[i - 1];
		}
		//assign the data to [index]
		array[index] = data;
		//increment size after inserted
		size++;
	}
	
	public void delete(Object data) {
		
		for(int i = 0; i < size; i++) {
			//search for match exactly
			if(array[i] == data) {
				for(int j = 0; j < (size - i - 1); j++) {
					//move data to the left
					array[i + j] = array[i + j +1];
				}
				//remove the last stored element
				array[size -1] = null;
				//decreased the size by 1
				size--;
				if(size <= (int)(capacity/3)) {
					shrink();
				}
				break;
			}
		}
	}
	
	public int search(Object data) {
		
		for(int i = 0; i < size; i++) {
			//search for match exactly then return index
			if(array[i] == data) {
				return i;
			}
		}
		//can't find
		return -1;
	}
	
	public void grow() {
		
		int newCapacity = (int)(capacity * 2);
		//create new array that has size of [newCapacity]
		Object[] newArray = new Object[newCapacity];
		
		
		for(int i = 0; i < size; i++) {
			//copy data from array[i] to newArray[i]
			newArray[i] = array[i];
		}
		//assign new capacity
		capacity = newCapacity;
		array = newArray;
	}
	
	public void shrink() {
		int newCapacity = (int)(capacity / 2);
		//create new array that has size of [newCapacity]
		Object[] newArray = new Object[newCapacity];
		
		
		for(int i = 0; i < size; i++) {
			//copy data from array[i] to newArray[i]
			newArray[i] = array[i];
		}
		//assign new capacity
		capacity = newCapacity;
		array = newArray;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		
		String string = "";
		
		for(int i=0; i<capacity; i++) {
			//store array[i] to string and add ", " to the end
			string += array[i] + ", ";
		}
		if(string != "") {
			//remove ", " at the end of the line
			string = "[" + string.substring(0, string.length() - 2) + "]";
		}
		else {
			string = "[]";
		}
		return string;
	}
}
