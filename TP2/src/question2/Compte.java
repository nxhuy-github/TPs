package question2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import question1.Operation;

public class Compte {
	private int numero;
	private String proprietaire;
	protected float solde;
	private Date dateOuverture;
	private List<Operation> listeOperations;
	
	public int getNumero() {
		return numero;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public float getSolde() {
		return solde;
	}
	public Date getDateOuverture() {
		return dateOuverture;
	}
	public List<Operation> getListeOperations() {
		return listeOperations;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Numero : ");
		str.append(this.numero);
		str.append(" | Proprietaire : ");
		str.append(this.proprietaire);
		str.append(" | Solde : ");
		str.append(this.solde);
		str.append(" | Date ouverture : ");
		str.append(this.dateOuverture);
		str.append(" | Liste d'operation : ");
		for(int i = 0; i < this.listeOperations.size(); i++){
			str.append(this.listeOperations.get(i).toString());
		}
		return str.toString();
	}
	
	public Compte(int numero, String proprietaire, float solde, Date dateOuverture){
		this.numero = numero;
		this.proprietaire = proprietaire;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.listeOperations = new ArrayList<Operation>();
	}
	
	public void verser(float montant, String libelle){
		Date date = new Date();
		date = Calendar.getInstance().getTime();
		Operation opera = new Operation(montant, date, libelle);
		this.solde += montant;
		this.listeOperations.add(opera);
	}
	
	public void retirer(float montant, String libelle) throws EMontantMinException{
		Date date = new Date();
		date = Calendar.getInstance().getTime();
		Operation opera = new Operation(-montant, date, libelle);
		if(this.solde < montant) throw new EMontantMinException("Pas assez d'argent sur le compte");
		else{
			this.solde -= montant;
		}
		this.listeOperations.add(opera);
	}
	
	public String Historique(int nombreOperations){
		String resultat="";
		Iterator<Operation> i = this.listeOperations.iterator();
		int index = 0;
		while(index < nombreOperations && i.hasNext()){
			resultat = resultat + i.next().toString() + "\n";
			index++;
		}
		return resultat;
	}
}
