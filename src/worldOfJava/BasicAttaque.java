package worldOfJava;

import java.util.Random;

import interfaceWOJ.IAttaque;
import interfaceWOJ.ICombattant;

public class BasicAttaque implements IAttaque {
	// champs
	private String nom;
	private int degats;
	private double chanceToucher;
	private String description;

	// constructeurs
	public BasicAttaque() {
	}

	public BasicAttaque(int degats, double chanceToucher) {
		this.degats = degats;
		this.chanceToucher = chanceToucher;
	}

	// getteurs et setteurs

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDegats() {
		return degats;
	}

	public void setDegats(int degats) {
		this.degats = degats;
	}

	@Override
	public void setChanceToucher(double chanceToucher) {
		if (chanceToucher >= 0 && chanceToucher <= 100) {
			this.chanceToucher = chanceToucher;
		} else {
			throw new RuntimeException("la chance de toucher doit etre en zero et 100");
		}

	}

	@Override
	public double getChanceToucher() {
		return chanceToucher;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;

	}

	// methodes

	/**
	 * fonction pour generer un nombre aleatoire ente o et 100. si ce nombre est > à
	 * la chance de toucher du lanceur l'attaque renvoie les degats du lanceur.
	 * sinon l'attaque est null.
	 */
	@Override
	public int LancerAttaque(ICombattant lanceur, ICombattant cible) {
		// Avec un nombre aleatoire random compris entre 0 et 100
		int hazar = new Random().nextInt(101);
		// si random < chanceToucher
		if (hazar < this.chanceToucher) {
			// retourner lanceur.Degats
			setDegats(lanceur.getDegats());
			System.out.println(
					"l'attaque " + getNom() + " a inflgé " + getDegats() + " pts de dégats à " + cible.getNom());
		} else {
			// sinon renvoyer 0 et afficher un message d'echec
			setDegats(0);
			System.out.println("l'attaque " + getNom() + " a échoué!");
		}

		return degats;
	}
}
