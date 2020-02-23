package question3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import  question1.GenerateurFic;

public class Main {
	public static void main(String[] args){
		char[] char1 = {'A', 'B', 'C', 'D', 'E'};
		GenerateurFic gF = new GenerateurFic();
		String file = "question3_entree.dat";
		gF.stockerCar(file, char1);
		
		OutputStream os;
		InputStream is;
		int v;
		try {
			is = new FileInputStream("question3_entree.dat");
			os = new FileOutputStream("question3_sortie.dat");
			
			XorFilterInputStream xfis = new XorFilterInputStream(is, 3);
			XorFilterOutputStream xfos = new XorFilterOutputStream(os, 3);
			System.out.println("Encoder le message du fichier question3_entree.dat: ");
			while(xfis.available() > 0){
				v = xfis.read();
				System.out.print((char)v);
				xfos.write(v);
			}
			
			xfis.close();
			xfos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
