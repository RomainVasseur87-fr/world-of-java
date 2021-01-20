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
	public Personnage(String nom, int degats, int pointDeVie, Classe classe) {
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
		System.out.println(this.getNom() + " attaque"+ adversaire.getNom());
		adversaire.defendre(this.classe.getAttaque().LancerAttaque(this, adversaire));
	    // Afficher un message pour notifier de l'attaque
		if (adversaire.estMort()) {
			System.out.println(adversaire.getNom()+ " est mort!");
		} else {
			System.out.println("il reste à "+adversaire.getNom() + " : "+adversaire.getPointDeVie()+" PV");
		}
	}
	
	
	@Override
	public boolean estMort() {
		boolean mort = false;
		if (this.getPointDeVie() <=0) {
			mort = true;
		}
		return mort;
	}

	
	/**
	 * methode pour afficher les champs de mon personnage.
	 */
	@Override
	public String toString() {
		return this.getNom() + " : [pointDeVie=" + this.getPointDeVie() + ", degats=" + this.getDegats() + "]";
	}

}
