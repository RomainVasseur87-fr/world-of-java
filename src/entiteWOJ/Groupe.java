package entiteWOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import interfaceWOJ.ICombattant;

public class Groupe implements ICombattant {
	
	//champs
	private List<ICombattant> groupe = new ArrayList<>();
	
	//constructeurs
	public Groupe() {
	}

	public Groupe(List<ICombattant> groupe) {
		this.groupe = groupe;
	}

	//getteurs et setteurs
	public List<ICombattant> getGroupe() {
		return groupe;
	}

	public void setGroupe(List<ICombattant> groupe) {
		this.groupe = groupe;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDegats() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPointDeVie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDegats(int degats) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPointDeVie(int pointDeVie) {
		// TODO Auto-generated method stub
		
	}
	//methodes
	
	/**
	 * foncion qui choisie un Combattant aleatoire et attaque avec le Combattant enemie
	 */
	@Override
	public void attaquer(ICombattant adversaire) {
		ICombattant attaquant = groupe.get(new Random().nextInt(groupe.size() ));
		attaquant.attaquer(adversaire);
	}

	/**
	 * fonction qui defend avec un Combattant aleatoire.
	 */
	@Override
	public void defendre(int degats) {
		ICombattant defandant = groupe.get(new Random().nextInt(groupe.size() ));
		defandant.setPointDeVie( defandant.getPointDeVie() - degats);
	}
	
	/**
	 * fonction pour ajouter un combattant au groupe de combattant
	 * @param combattant à ajouter.
	 */
	public void AddCombattant(ICombattant combattant) {
		this.groupe.add(combattant);
	}
	
	/**
	 * fonction qui renvoie vrai si tous les combattant d'un groupe sont morts.
	 * sinon renvoie vrai s'il y a au moins 1 survivant.
	 * @return 
	 */
	public boolean EstMort() {
		boolean mort = false;
		//qui renvoie vrai si tout les Combattant de l'equipe sont mort
		for (ICombattant combattant : groupe) {
			if (combattant.getPointDeVie() <=0 ) {
				mort = true;
			}else {
				mort = false;
			}
		}
		return mort;
	}

	@Override
	public String toString() {
		return "Groupe [groupe=" + groupe + "]";
	}
	
	
}	
