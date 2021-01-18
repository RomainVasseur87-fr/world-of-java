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
	 * Créer un monstre avec tous ses attributs. Demande a l'utilisateur d'entrer le
	 * nom du monstre. retour: une instance de la classe monstre correctement
	 * instancié.
	 **/
	public static Combattant monstreFactory() {
		// Creer un nouveau monstre en utilisant le constructeur avec tous ses params
		// (dont le nom choisi aleatoirement)
		Combattant mob1 = new Monstre("mob1", 3, 1);
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

	/**
	 * liste du debut de nom possible pour les monstres.
	 */
	public static String[] debutNom = new String[] { "chat", "chien", "raton", "chauve-souris", "corbeau", };
	/**
	 * liste de fin de nom possible pour les monstres.
	 */
	public static String[] finNom = new String[] { " mechant", " de feu", " de la mort", " de lumiere", " de glace", };

	/**
	 * fonction qui permet de creer aleatoirement un nom de monstre en assamblant un
	 * mot de la liste debutNom et un mot de la liste finNom.
	 * 
	 * @return le nom du monstre creée.
	 */
	public static String nomComplet() {
		String nomComplet = debutNom[new Random().nextInt(debutNom.length)]
				+ finNom[new Random().nextInt(finNom.length)];
		return nomComplet;

	}

	/**
	 * fonction pour afficher le vainqueur du combat quand les points de vie de son
	 * adversaire tombe en dessous de zero.
	 * 
	 * @param personnage qui combat
	 * @param monstre    qui combat
	 * @return le vainqueur du combat
	 */
	public static Combattant afficherMort(Combattant personnage, Combattant monstre) {
		Combattant vaincu;
		if (personnage.getPointDeVie() <= 0 && monstre.getPointDeVie() <= 0) {
			vaincu = null;
			System.out.println("vous vous etes entretuer et vous etes mort avec le monstre.");
		} else if (personnage.getPointDeVie() <= 0) {
			vaincu = personnage;
			System.out.println("vous etes mort! ");
		} else {
			vaincu = monstre;
			System.out.println("bravo vous avez battu " + monstre.getNom() + "!");
		}
		return vaincu;

	}

	/**
	 * fonction pour faire combatre à tour de role un personnage et un monstre
	 * jusqu'à ce que l'un des deux à ces point de vie qui passe en dessous de zero.
	 * 
	 * @param personnage qui attaque.
	 * @param monstre    qui riposte.
	 */
	public static void combat(Combattant personnage, Combattant monstre) {
		// definir un boolean turn
		boolean turn = true;
		/* verifier si les deux adversaires ont encore de la vie */
		while (personnage.getPointDeVie() > 0 && monstre.getPointDeVie() > 0) {
			if (turn) {
				System.out.println("vous infligez "+personnage.getDegats()+"!");
				monstre.setPointDeVie(monstre.getPointDeVie() - personnage.getDegats());
				System.out.println("il reste "+monstre.getPointDeVie()+" PV au monstre");
			} else {
				System.out.println("le monstre vous inflige "+monstre.getDegats()+"!");
				personnage.setPointDeVie(personnage.getPointDeVie() - personnage.getDegats());
				System.out.println("il vous reste "+personnage.getPointDeVie());
			}
			turn = !turn;
			
		}
		
		afficherMort(personnage, monstre);
	}
}
