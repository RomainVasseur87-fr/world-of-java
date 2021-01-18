package worldOfJava;

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
		}else {
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

	@Override
	public int LancerAttaque(ICombattant lanceur, ICombattant cible) {
		// Avec un nombre aleatoire random compris entre 0 et 100
		// si random < chanceToucher
		// retourner lanceur.Degats
		// sinon renvoyer 0 et afficher un message d'echec
		return 0;
	}
}
