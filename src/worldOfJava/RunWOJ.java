package worldOfJava;

public class RunWOJ {

	/**
	* Créer un personnage avec touss ses attributs. 
	* Demande a l'utilisateur d'entrer le nom du personnage.
	* retour: une instance de la classe Personnage correctement instancié.
	**/
	public static void personnageFactory(){
	    // Creer un nouveau personnage en utilisant le constructeur avec tous ses params 
		//(dont le nom qui vient d'être choisi par l'utilisateur)
		Personnage peon1 = new Personnage("pnj1",20,1);
		// Demander a l'utilisateur un nom de personnage
		String nom = Tools.inputString("nommer votre personnage :");
		peon1.setNom(nom);
	    // Retourner l'instance du personnage
		System.out.println(peon1);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("hello world");
		personnageFactory();

	}

}
