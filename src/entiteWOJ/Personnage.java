package entiteWOJ;

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
	 * methode pour afficher les champs de mon personnage.
	 */
	@Override
	public String toString() {
		return nom + " : [pointDeVie=" + pointDeVie + ", degats=" + degats + "]";
	}

}
