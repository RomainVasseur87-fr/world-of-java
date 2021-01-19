package entiteWOJ;

import interfaceWOJ.IAttaque;
import interfaceWOJ.ICombattant;
import worldOfJava.BasicAttaque;
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
	 * surcharge de la methode attaque combattant permettant de selectionner les attaques de classe.
	 */
	@Override
	public void attaquer(ICombattant adversaire) {
		IAttaque atk = new BasicAttaque();
		atk = classe.getAttaque();
		//les degat de  cette attaque je doit trouver comment faire ?????
		this.degats = atk.getDegats();
		// Appeler la methode Defence de l'adversaire en passant en Params.
		adversaire.defendre(this.degats);
	    // Afficher un message pour notifier de l'attaque
		System.out.println(this.getNom() + " inflige :"+degats + " à " + adversaire.getNom());
	}
	
	@Override
	public void defendre(int degats) {
    	// Soustraire aux points de vie les degats passé en params
    	this.setPointDeVie( this.getPointDeVie() - degats);
    	
    }
	/**
	 * methode pour afficher les champs de mon personnage.
	 */
	@Override
	public String toString() {
		return nom + " : [pointDeVie=" + pointDeVie + ", degats=" + degats + "]";
	}

}
