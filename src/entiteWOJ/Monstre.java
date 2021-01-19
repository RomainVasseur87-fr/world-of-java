package entiteWOJ;

public class Monstre extends Combattant{

	//constructeur
	public Monstre() {
	}
	public Monstre(String nom, int pointDeVie, int degats) {
		super(nom, degats, pointDeVie);
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
