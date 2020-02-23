package question2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws EMontantMinException {
		int choix = 0;
		int vor = 0; // verser ou retirer
		int argent = 0;
		int nbO = 0;
		
		float solde = 0;
		String nom;
		Date date = new Date();
		date = Calendar.getInstance().getTime();
		
		//System.out.println(date);
		
		Scanner in = new Scanner(System.in);

		
		System.out.println("Creer un compte : ");
		System.out.println("1> Compte Epargne\n2> Compte Courant");
		choix = in.nextInt();
		System.out.println("Votre nom : ");
		nom = in.next();
		
		if(choix == 1){
			CompteEpargne cptE = new CompteEpargne(1, nom, solde, date, 0.1F);
			while(true){
				System.out.println("-----1> Verser ou 2> retirer ou 3> historique d'operation ou 4> calcul interets ou 5> quitter : ");
				vor = in.nextInt();
				if(vor == 1){
					System.out.println("Argent : ");
					argent = in.nextInt();
					cptE.verser(argent, "123456");
				}else if(vor == 2){
					System.out.println("Argent : ");
					argent = in.nextInt();
					cptE.retirer(argent, "123456");
				}else if(vor == 3){
					System.out.println(cptE.Historique(nbO));
				}else if(vor == 4){
					System.out.println("Interet : " + cptE.CalculInterets());
				}else if(vor == 5){
					break;
				}else{
					System.out.println("Attend 1 ou 2 ou 3...");
				}
				nbO++;
			}
			
		}else if(choix == 2){
			CompteCourant cptC = new CompteCourant(1, nom, solde, date, 100);
			while(true){
				System.out.println("-----1> Verser ou 2> retirer ou 3> historique d'operation ou 4> quitter : ");
				vor = in.nextInt();
				if(vor == 1){
					System.out.println("Argent : ");
					argent = in.nextInt();
					cptC.verser(argent, "123456");
				}else if(vor == 2){
					System.out.println("Argent : ");
					argent = in.nextInt();
					cptC.retirer(argent, "123456");
				}else if(vor == 3){
					System.out.println(cptC.Historique(nbO));
				}else if(vor == 4){
					break;
				}else{
					System.out.println("Attend 1 ou 2 ou 3...");
				}
				nbO++;
			}

		}else{
			System.out.println("Attend 1 ou 2...");
		}
	
	}

}
