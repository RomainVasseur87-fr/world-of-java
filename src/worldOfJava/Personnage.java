package worldOfJava;

public class Personnage extends Combattant {
	
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
		super(nom, degats, pointDeVie);
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
