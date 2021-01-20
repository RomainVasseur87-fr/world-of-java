package entiteWOJ;

import interfaceWOJ.ICombattant;

public abstract class Combattant implements ICombattant {
	//champs
	 private String nom;
     private int pointDeVie;
     private int degats;
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
	public void attaquer(ICombattant adversaire) {
		// Appeler la methode Defence de l'adversaire en passant en Params.
		adversaire.defendre(this.degats);
	    // Afficher un message pour notifier de l'attaque
		System.out.println(this.getNom() + " inflige :"+degats + " à " + adversaire.getNom());
	}
	
    public void defendre(int degats) {
    	// Soustraire aux points de vie les degats passé en params
    	this.setPointDeVie( this.getPointDeVie() - degats);
    	
    }
    
    @Override
    public boolean estMort() {
    	return this.getPointDeVie()>0 ? false : true;
    }
    
	/**
	 * methode toString pour afficher les information du combattant.
	 */
	@Override
	public String toString() {
		return nom + ": [pointDeVie=" + pointDeVie + ", degats=" + degats + "]";
	}

}
