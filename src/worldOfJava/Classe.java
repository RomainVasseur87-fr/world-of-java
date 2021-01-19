package worldOfJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import interfaceWOJ.IAttaque;

public class Classe {
	// champs
	private String nom;
	private List<IAttaque> attaques = new ArrayList<>();

	// constructeurs
	/**
	 * constructeur vide de Classe.
	 */
	public Classe() {
	}

	/**
	 * constructeur de classe avec le nom de la classe et la liste de ses attaques.
	 * 
	 * @param nom      de la classe.
	 * @param attaques est la liste des attaques de la classe.
	 */
	public Classe(String nom, List<IAttaque> attaques) {
		this.nom = nom;
		this.attaques = attaques;
	}

	// getteurs et setteurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<IAttaque> getAttaques() {
		return attaques;
	}

	public void setAttaques(List<IAttaque> attaques) {
		this.attaques = attaques;
	}

	// methodes
	/**
	 * fonction qui permet de selectionner une attaque aleatoirement parmis la liste
	 * d'attaque de la classe.
	 * 
	 * @return l'attaque selectionnée.
	 */
	public IAttaque getAttaque() {
		// recuperer une attaque parmis les attaques de la classe
		IAttaque atkRandom = attaques.get(new Random().nextInt(attaques.size()));
		return atkRandom;
	}

	@Override
	public String toString() {
		return "Classe [nom=" + nom + ", attaques=" + attaques + "]";
	}

}
