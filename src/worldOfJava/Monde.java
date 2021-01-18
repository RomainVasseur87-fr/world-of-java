package worldOfJava;

import java.util.Random;

public class Monde {

	// tout mettre en static pour ne pas qu'elle soit instancier.

	/**
	 * Créer un personnage avec tous ses attributs. Demande a l'utilisateur d'entrer
	 * le nom du personnage. retour: une instance de la classe Personnage
	 * correctement instancié.
	 **/
	public static Combattant personnageFactory() {
		// Creer un nouveau personnage en utilisant le constructeur avec tous ses params
		// (dont le nom qui vient d'être choisi par l'utilisateur)
		Combattant peon1 = new Personnage("pnj1", 20, 1);
		// Demander a l'utilisateur un nom de personnage
		String nom = Tools.inputString("nommer votre personnage :");
		peon1.setNom(nom);
		int vie = Tools.inputInt("entrer votre nombre de point de vie :");
		peon1.setPointDeVie(vie);
		int force = Tools.inputInt("entrer votre force:");
		peon1.setDegats(force);
		// Retourner l'instance du personnage
		System.out.println(peon1);
		return peon1;
	}

	/**
	* Créer un monstre avec tous ses attributs. 
	* Demande a l'utilisateur d'entrer le nom du monstre.
	* retour: une instance de la classe monstre correctement instancié.
	**/
	public static Combattant monstreFactory(){
	    // Creer un nouveau monstre en utilisant le constructeur avec tous ses params 
		//(dont le nom choisi aleatoirement)
		Combattant mob1 = new Monstre("mob1",3,1);
		// Demander a l'utilisateur un nom de personnage
		String nom = nomComplet();
		mob1.setNom(nom);
		int vie = Tools.inputInt("entrer le nombre de point de vie du monstre:");
		mob1.setPointDeVie(vie);
		int force = Tools.inputInt("entrer la force du monstre:");
		mob1.setDegats(force);
	    // Retourner l'instance du personnage
		System.out.println(mob1);
		return mob1;
	}

	/**
	 * methode qui permet d'afficher les informations du monde.
	 */
	public static void afficherInformations() {
		System.out.println();

	}

	public static String[] debutNom = new String[] { 
			"chat", "chien", "raton", "chauve-souris", "corbeau", };

	public static String[] finNom = new String[] { 
			" mechant", " de feu", " de la mort", "de lumiere", "de glace", };

	public static String nomComplet(){
		String nomComplet = debutNom[new Random().nextInt(debutNom.length)] 
				+ finNom[new Random().nextInt(finNom.length)];
						return nomComplet;

	}

}
