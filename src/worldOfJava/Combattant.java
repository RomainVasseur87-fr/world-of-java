package worldOfJava;

public abstract class Combattant {
	//champs
	 public String nom;
     public int pointDeVie;
     public int degats;
     //constructeurs
     /**
      * constructeur vide de combattant
      */
	public Combattant() {
	}
	/**
	 * constructeur de combattant avec son nom, sa vie et ses degats.
	 * @param nom du combattant
	 * @param pointDeVie du combattant
	 * @param degats du combattant
	 */
	public Combattant(String nom, int pointDeVie, int degats) {
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
	//methodes
	/**
	 * methode toString pour afficher les information du combattant.
	 */
	@Override
	public String toString() {
		return nom + ": [pointDeVie=" + pointDeVie + ", degats=" + degats + "]";
	}

}
