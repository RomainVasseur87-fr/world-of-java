package worldOfJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import entiteWOJ.Combattant;
import entiteWOJ.Groupe;
import entiteWOJ.Monstre;
import entiteWOJ.Personnage;
import interfaceWOJ.IAttaque;
import interfaceWOJ.ICombattant;

// tout mettre en static pour ne pas qu'elle soit instancier.
public class Monde {

	private static Map<String, Classe> classes = new HashMap<>();
	private static List<Monstre> meute = new ArrayList<>();
	
	
	public static void genese() {
		System.out.println("---***--- Bonjour ---***---");
		System.out.println("Choisir une option:");
		System.out.println("1: Lancer un combat 1v1");
		System.out.println("2: Lancer un combat de groupe");
		System.out.println("3: One vs World Hardcore Edition");
		System.out.println("4: Informations");
		System.out.println("---------------------------");
		System.out.println(">>>");
	}

	
	
	/**
	 * fonction qui creer un groupe de "nombreMonstre" monstres choisie aleatoirement. 
	 * @param nombreMonstre correspond au nombre de monstre dans le groupe à creer
	 * @return le groupe creer.
	 */
	public static Groupe creationGroupeMonstre (int nombreMonstre) {
		Groupe groupe = new Groupe();
		for (int j = 0; j < nombreMonstre; j++) {
			ICombattant m = monstreFactory();
			groupe.AddCombattant(m);
		}
		
		return groupe;
	}
	
	/**
	 * fonction pour creer un groupe de personnage 
	 * @param nombrePersonnage
	 * @return
	 */
	public static Groupe creationGroupePersonnage (int nombrePersonnage) {
		Groupe groupe = new Groupe();
		for (int j = 0; j < nombrePersonnage; j++) {
			ICombattant perso = personnageFactory();
			groupe.AddCombattant(perso);
		}
		
		return groupe;
	}
	/**
	 * fonction pour recuperer une classe dans la liste des classes de la Map classes.
	 * @param nom de la classe recherché
	 * @return la Classe dont le nom a été rcherché.
	 */
	public static Classe GetClasse(String nom) {
		// La classe avec le nom : "nom"
		Classe C1 = classes.get(nom);
		return C1;
	}
	
	/**
	 * fonction pour creer un collection de classes dans une Map qui les references par le nom.
	 * le nom de chaque classe est rentrer par un scanner.
	 */
	public static void ClassesCollectionFactory() {
		for (int i =0; i < 5 ; i++) {
			System.out.println("ceation d'une classe----");
			System.out.println("entrer le nom d'une classe : ");
			String nom = scanner.next();
			if (nom.equals("") ) {
				nom = scanner.nextLine();
			}
			classes.put( nom , classeFactory(nom) );
		}
	}
	
	public static Scanner scanner = new Scanner(System.in);

	/**
	 * Créer un personnage avec tous ses attributs. Demande a l'utilisateur d'entrer
	 * le nom du personnage. retour: une instance de la classe Personnage
	 * correctement instancié.
	 **/
	public static Combattant personnageFactory() {
		System.out.println("entrer le nom de votre classe :");
		String nomclasse= scanner.next();
		// Creer un nouveau personnage en utilisant le constructeur avec tous ses params
		// (dont le nom qui vient d'être choisi par l'utilisateur)
		Combattant peon1 = new Personnage("nom", 100, 15, GetClasse(nomclasse));
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
	 * retour: une instance de la classe monstre correctement
	 * instancié.
	 * @param Combattant correspondant au monstre creer.
	 **/
	public static Combattant monstreFactory() {
		// Creer un nouveau monstre aleatoirement
		Combattant mob1 = new Monstre();
		mob1.setNom(nomComplet());
		mob1.setPointDeVie(new Random().nextInt(100) );
		mob1.setDegats(new Random().nextInt(30) );
		// Retourner l'instance du personnage
		System.out.println(mob1);
		return mob1;
	}

	/**
	 * methode pour creer une attaque basique.
	 * 
	 * @return une attaque basique.
	 */
	public static BasicAttaque BasicAttaqueFactory() {
		System.out.println("creation d'une attaque basique ------");
		BasicAttaque a = new BasicAttaque("nom", 10, 50, "ceci est une attaque basique");
		System.out.println("entrer le nom de l'attaque est ");
		a.setNom(scanner.next());
		if (a.getNom().equals("") ) {
			a.setNom( scanner.nextLine() );
		}
		return a;
	}

	/**
	 * fabrication d'une classe avec 2 attaques
	 * 
	 * @return la classe fabriqué
	 */
	public static Classe classeFactory(String nom) {
		Classe c = new Classe();
		c.setNom(nom);

		List<IAttaque> attaques = new ArrayList<>();
		attaques.add(BasicAttaqueFactory());
		attaques.add(BasicAttaqueFactory());
		c.setAttaques(attaques);

		return c;
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
		int tour = 1;
		// definir un boolean turn
		boolean turn = true;
		/* verifier si les deux adversaires ont encore de la vie */
		while (personnage.getPointDeVie() > 0 && monstre.getPointDeVie() > 0) {
			System.out.println("----- Tour :" + tour + " ------");
			if (turn) {
				System.out.println("vous infligez " + personnage.getDegats() + "!");
				monstre.setPointDeVie(monstre.getPointDeVie() - personnage.getDegats());
				System.out.println("il reste " + monstre.getPointDeVie() + " PV au monstre");
			} else {
				System.out.println("le monstre vous inflige " + monstre.getDegats() + "!");
				personnage.setPointDeVie(personnage.getPointDeVie() - personnage.getDegats());
				System.out.println("il vous reste " + personnage.getPointDeVie() + " PV");
			}
			turn = !turn;
			tour++;
			scanner.nextLine();
		}

		afficherMort(personnage, monstre);
	}

	/**
	 * fonction pour faire combatre à tour de role deux combattants jusqu'à ce que
	 * l'un des deux a ces point de vie qui passe en dessous de zero. utilise les
	 * methodes attaquer et defendre des combattants.
	 * 
	 * @param combattant1 qui attaque.
	 * @param combattant2 qui riposte.
	 */
	public static void combat2(Combattant combattant1, Combattant combattant2) {
		int tour = 1;
		boolean turn = true;
		while (combattant1.getPointDeVie() > 0 && combattant2.getPointDeVie() > 0) {
			System.out.println("----- Tour :" + tour + " ------");
			if (turn) {
				combattant1.attaquer(combattant2);
				System.out.println("il reste " + combattant2.getPointDeVie() + " PV à votre adversaire");
			} else {
				System.out.println("votre adversaire vous inflige " + combattant2.getDegats() + "!");
				combattant2.attaquer(combattant1);
				System.out.println("il vous reste " + combattant1.getPointDeVie());
			}
			turn = !turn;
			tour++;
			scanner.nextLine();
		}

		afficherMort(combattant1, combattant2);
	}


	public static List<Monstre> getMeute() {
		return meute;
	}

	public static void setMeute(List<Monstre> meute) {
		Monde.meute = meute;
	}

}
