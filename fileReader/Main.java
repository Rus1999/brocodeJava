package fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		//FileReader = read the contents of a file as a stream of characters. One by one
		//			   read() returns an int value which contains the byte value
		//			   when read() returns -1, there is no more data to be read
		
		try {
			FileReader reader = new FileReader("art.txt");
			//read the characters in file and return in int
			int data = reader.read(); 
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
