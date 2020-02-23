package question2;

import java.util.Calendar;
import java.util.Date;

import question1.Operation;

public class CompteCourant extends Compte{
	
	public CompteCourant(int numero, String proprietaire, float solde,
			Date dateOuverture, float montantDecouvertAutorise) {
		super(numero, proprietaire, solde, dateOuverture);
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

	private float montantDecouvertAutorise;
	
	public float getMontantDecouvertAutorise(){
		return montantDecouvertAutorise;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append(super.toString());
		str.append(" | Montant decouvert autorise : ");
		str.append(this.montantDecouvertAutorise);
		return str.toString();
	}
	
	@Override
	public void retirer(float montant, String libelle) throws EMontantMinException{
		Date date = new Date();
		date = Calendar.getInstance().getTime();
		Operation opera = new Operation(-montant, date, libelle);
		if(this.solde + this.montantDecouvertAutorise < montant) throw new EMontantMinException("Pas assez d'argent sur le compte");
		else{
			this.solde -= montant;
		}
		super.getListeOperations().add(opera);
	}
}
