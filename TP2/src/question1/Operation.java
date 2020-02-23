package question1;

import java.util.Date;

public class Operation {
	private Date date;
	private float montant;
	private String libelle;
	
	public Operation(float montant, Date date, String libelle){
		this.date = date;
		this.montant = montant;
		this.libelle = libelle;
	}
	
	@Override
	public String toString(){
		return this.date + "| cheque nº " + this.libelle + " | " + this.montant + "€";
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
