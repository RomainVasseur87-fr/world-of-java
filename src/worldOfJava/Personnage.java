package worldOfJava;

public class Personnage extends Combattant {
	//champs
	private String nom;
	private int pointDeVie;
	private int degats;
	
	//constructeurs
	/**
	 * constructeur de personnage sans parrametre.
	 */
	public Personnage() {
	}
	/**
	 * constructeur de personnage avec son nom, sa vie (pointDeVie) et ses dégats.
	 * @param nom du personnage
	 * @param pointDeVie du personnage
	 * @param degats infligés par le parsonnage
	 */
	public Personnage(String nom, int pointDeVie, int degats) {
		this.nom = nom;
		this.pointDeVie = pointDeVie;
		this.degats = degats;
	}
	//getteur et setteurs
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
	 * methode pour afficher les champs de mon personnage.
	 */
	@Override
	public String toString() {
		return nom + " : [pointDeVie=" + pointDeVie + ", degats=" + degats + "]";
	}
	
	

}
