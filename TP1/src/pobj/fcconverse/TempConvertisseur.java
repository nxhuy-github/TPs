package pobj.fcconverse;

import java.util.Scanner;

public class TempConvertisseur {
	private int nombreChiffreArrondi;
	
	public TempConvertisseur(){
		nombreChiffreArrondi = -1;
	}
	
	public TempConvertisseur(int chiffre){
		nombreChiffreArrondi = chiffre;
	}
	
	public int getNombreChiffreArrondi(){
		return this.nombreChiffreArrondi;
	}
	
	public void setNombreChiffreArrondi(int chiffre){
		nombreChiffreArrondi = chiffre;
	}
	
	public double CelsiusToFahrenheit(double celsius){
		return(arrondi(9.0 * celsius) / 5 + 32);
	}
	
	public double FahrenheitToCelsius(double fahrenheit){
		return(arrondi((fahrenheit - 32) * 5.0 / 9));
	}
	
	private double arrondi(double donnee){
		double temp = Math.pow(10.0, nombreChiffreArrondi);
		donnee = Math.round(donnee * temp)/ temp;
		return donnee;
	}
	
	public static void main(String[] args){
		int choix;
		char c = 0x00B0;
		String str_choix;
		boolean flag = true;
		double temp;
		double newtemp;
		TempConvertisseur temperature = new TempConvertisseur(2);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
		System.out.println("-------------------------------------------------");
		while(flag){
			System.out.println("Choisissez le mode de conversion :");
			System.out.println("1 - Convertisseur Celsius - Fahrenheit");
			System.out.println("2 - Convertisseur Fahrenheit - Celsius");
			choix = in.nextInt();
			System.out.println("Température à convertir: ");
			temp = in.nextDouble();
			if(choix == 1){
				newtemp = temperature.CelsiusToFahrenheit(temp);
				System.out.println(temp + "C correspond à : " + newtemp + "F");
			}else if(choix == 2){
				newtemp = temperature.FahrenheitToCelsius(temp);
				System.out.println(temp + "F correspond à : " + newtemp + "C");
			}else{
				System.out.println("Erreur: le choix 1 ou 2 attendu");
			}
			System.out.println("Souhaitez-vous convertir une autre température? (O/N) ");
			str_choix = in.next();
			if(str_choix.equals("O") || str_choix.equals("o")){
				flag = true;
			}else{
				flag = false;
				System.out.println("Au revoir");
			}
		}
	}
}
