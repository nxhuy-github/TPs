package question2;

import java.util.Date;

public class CompteEpargne extends Compte{
	public CompteEpargne(int numero, String proprietaire, float solde,
			Date dateOuverture, float taux) {
		super(numero, proprietaire, solde, dateOuverture);
		this.taux = taux;
	}

	private float taux;
	
	public float getTaux(){
		return taux;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append(" | Taux : ");
		str.append(this.taux);
		return str.toString();
	}
	
	public float CalculInterets(){
		this.solde = this.solde + this.solde*this.taux;
		return super.getSolde();
	}
}
