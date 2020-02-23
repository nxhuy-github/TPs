package question1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CalculFic {
	public void fic(String str){
		try {
			FileInputStream fileIs = new FileInputStream(str);
			DataInputStream is = new DataInputStream(fileIs);
			
			while(is.available() > 0){
				System.out.println(is.readInt());
			}
			
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void calculFic(String str1, String str2, String str3 ){
		try {
			FileInputStream fileIs1 = new FileInputStream(str1);
			FileInputStream fileIs2 = new FileInputStream(str2);
			FileInputStream fileIs3 = new FileInputStream(str3);
			
			DataInputStream is1 = new DataInputStream(fileIs1);
			DataInputStream is2 = new DataInputStream(fileIs2);
			DataInputStream is3 = new DataInputStream(fileIs3);
			
			//byte[] arr1 = new byte[1000];
			int x, y, result;
			char car;
			
			while(is1.available() > 0){
				x = is1.readInt();
				y = is2.readInt();
				car = is3.readChar();
				
				switch(car){
				case '+':
					result = x + y;
					System.out.println(x + " + " + y + " = " + result);
					break;
				case '-':
					result = x - y;
					System.out.println(x + " - " + y + " = " + result);
					break;
				case '*':
					result = x * y;
					System.out.println(x + " * " + y + " = " + result);
					break;
				case '/':
					result = x / y;
					System.out.println(x + " / " + y + " = " + result);
					break;
				}
				
				//System.out.println(x);
			}
			
			is1.close();
			is2.close();
			is3.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
