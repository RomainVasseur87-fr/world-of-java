package worldOfJava;

public class Monstre extends Combattant{

	// champs
	private String nom; 
	private int pointDeVie;
	private int degats;
	
	//constructeur
	public Monstre() {
	}
	public Monstre(String nom, int pointDeVie, int degats) {
		this.nom = nom;
		this.pointDeVie = pointDeVie;
		this.degats = degats;
	}
	//getteurs et setteurs
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPointDeVie() {
		return pointDeVie;
	}
	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}
	public int getDegats() {
		return degats;
	}
	public void setDegats(int degats) {
		this.degats = degats;
	}
	//methode
	/**
	 * methode to string pour afficher les informations du monstre.
	 */
	@Override
	public String toString() {
		return nom + ": [pointDeVie=" + pointDeVie + ", degats=" + degats + "]";
	}


}
