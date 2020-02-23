package question2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicTableau {
	private float taille;
	private String fichier;
	
	public FicTableau(String fichier, float taille){
		this.taille = taille;
		this.fichier = fichier;
	}
	
	public void verifierIndice(int indice){
		if(indice < 0 || indice > this.taille){
			throw new ArrayIndexOutOfBoundsException(indice);
		}
	}
	
	public void ecrire(int indice, int valeur){
		verifierIndice(indice);
			try {
				RandomAccessFile raf = new RandomAccessFile(this.fichier, "rw");
				try {
					raf.seek(indice * 4);
					raf.write(valeur);
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					try {
						raf.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
	}
	
	public int lire(int indice) {
		verifierIndice(indice);
		try {
			RandomAccessFile raf = new RandomAccessFile(this.fichier, "r");
			try{
				raf.seek(indice * 4);
				return raf.readInt();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					raf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] arg){
		FicTableau ft = new FicTableau("question2.dat", 50);
		for(int i = 0; i < 50; i++){
			ft.ecrire(i, i*2);
		}
		for(int i = 0; i < 50; i++){
			System.out.print(ft.lire(i) + " ");
		}
	}
}












