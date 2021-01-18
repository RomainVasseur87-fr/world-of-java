package worldOfJava;

public class Monstre extends Combattant{

	//constructeur
	public Monstre() {
	}
	public Monstre(String nom, int pointDeVie, int degats) {
		this.nom = nom;
		this.pointDeVie = pointDeVie;
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
