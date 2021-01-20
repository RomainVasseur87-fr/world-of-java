package entiteWOJ;

import interfaceWOJ.ICombattant;
import worldOfJava.Classe;

public class Personnage extends Combattant {
	// champs
	private Classe classe;

	// constructeurs
	/**
	 * constructeur de personnage sans parrametre.
	 */
	public Personnage() {
	}

	/**
	 * constructeur de personnage avec son nom, sa vie (pointDeVie), ses dégats et
	 * sa classe.
	 * 
	 * @param nom        du personnage
	 * @param pointDeVie du personnage
	 * @param degats     du personnage
	 * @param classe     du personnage
	 */
	public Personnage(String nom, int pointDeVie, int degats, Classe classe) {
		super(nom, degats, pointDeVie);
		this.classe = classe;
	}

	// getteurs et setteurs
	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	// methode
	/**
	 * surcharge de la methode attaque combattant permettant de selectionner
	 * les attaques de classe du personnage et en claculant lancerattaque.
	 */
	@Override
	public void attaquer(ICombattant adversaire) {
		// Appeler la methode Defence de l'adversaire en passant en Params.
		adversaire.defendre(classe.getAttaque().LancerAttaque(this, adversaire));
	    // Afficher un message pour notifier de l'attaque
		System.out.println(this.getNom() + " utilise "+classe.getAttaque().getNom() 
				+ " et inflige inflige :"+this.classe.getAttaque().getDegats() 
				+ " à " + adversaire.getNom());
	}
	
	/**
	 * methode pour afficher les champs de mon personnage.
	 */
	@Override
	public String toString() {
		return this.getNom() + " : [pointDeVie=" + this.getPointDeVie() + ", degats=" + this.getDegats() + "]";
	}

}
