package entiteWOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import interfaceWOJ.ICombattant;

public class Groupe extends Combattant {

	// champs
	private List<ICombattant> groupe = new ArrayList<>();

	// constructeurs
	public Groupe() {
	}

	public Groupe(List<ICombattant> groupe) {
		this.groupe = groupe;
	}

	// getteurs et setteurs
	public List<ICombattant> getGroupe() {
		return groupe;
	}

	public void setGroupe(List<ICombattant> groupe) {
		this.groupe = groupe;
	}

	// methodes

	/**
	 * methode qui choisi un combattant vivant du groupe aleatoirement pour attaquer
	 * un adverse aleatoirement du groupes adverses.
	 */
	public void attaquer(Groupe adversaires) {
		ICombattant attaquant = getAliveCombattant().get(new Random().nextInt(getAliveCombattant().size()));
		ICombattant defandant = adversaires.getAliveCombattant().get(new Random().nextInt(adversaires.getAliveCombattant().size()));
		if (attaquant instanceof Personnage) {
			Personnage personnage = (Personnage) attaquant;
			personnage.attaquer(defandant);
		} else {
			attaquant.attaquer(defandant);
		}
	}


	/**
	 * fonction pour ajouter un combattant au groupe de combattant
	 * 
	 * @param combattant à ajouter.
	 */
	public void AddCombattant(ICombattant combattant) {
		this.groupe.add(combattant);
	}

	/**
	 * fonction qui renvoie vrai si tous les combattant d'un groupe sont morts.
	 * sinon renvoie false s'il y a au moins 1 survivant.
	 * 
	 * @return
	 */
	@Override
	public boolean estMort() {
		boolean mort = false;
		for (ICombattant combattant : groupe) {
			if (combattant.getPointDeVie() <= 0) {
				mort = true;
				break;
			} else {
				mort = false;
			}
		}
		return mort;
	}
	
	/**
	 * fonction pour selectionner les combattants encore en vie du groupe
	 * @return
	 */
	public List<ICombattant> getAliveCombattant(){
		List<ICombattant> aliveCombattant = new ArrayList<>();
		for (ICombattant combattant : this.groupe) {
			if (!combattant.estMort()) {
				aliveCombattant.add(combattant);
			}
		}
		return aliveCombattant;
		
	}

	@Override
	public String toString() {
		return "Groupe [groupe=" + groupe + "]";
	}

}
