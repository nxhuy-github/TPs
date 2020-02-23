package question1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class GenerateurFic {
	public void  stockerNombres(String filename, int[] arr){
		try {
			FileOutputStream fileOs = new FileOutputStream(filename);
			DataOutputStream os = new DataOutputStream(fileOs);
			for(int i = 0; i < arr.length; i++){
				os.writeInt(arr[i]);
			}
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void stockerCar(String filename, char[] arr){
		try {
			DataOutputStream os = new DataOutputStream(new FileOutputStream(filename));
			for(int i = 0; i < arr.length; i++){
				os.writeChar(arr[i]);
			}
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
