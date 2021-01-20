package worldOfJava;

import entiteWOJ.Groupe;
import interfaceWOJ.ICombattant;

public class RunWOJ {

	public static void testCombat() {
		Monde.combat(Monde.personnageFactory(), Monde.monstreFactory() );
	}
	
	public static void testAtkDef() {
		ICombattant peon1 = Monde.personnageFactory();
		ICombattant mob1 = Monde.monstreFactory();
		
		peon1.attaquer(mob1);
		peon1.attaquer(mob1);
		peon1.attaquer(mob1);
		System.out.println(mob1);
		
	}
	public static void testCombat2() {
		Monde.combat(Monde.personnageFactory(), Monde.monstreFactory() );
	}
	
	public static void testclasse() {
		Monde.ClassesCollectionFactory();
		Monde.combat(Monde.personnageFactory(), Monde.monstreFactory() );
	}
	
	public static void testGroupeMonstre() {
		Groupe rencontre1 = Monde.groupeMonstreFactory(4);
		System.out.println(rencontre1);
	}
	public static void testGroupePersonnage() {
		Groupe bande1 = Monde.groupePersonnageFactory(3);
		System.out.println(bande1);
	}
	
	public static void testcombat1v1() {
		Monde.genese();
		ICombattant C1 = Monde.personnageFactory2();
		ICombattant C2 = Monde.monstreFactory();
		Monde.combat1v1(C1, C2);
	}
	
	public static void testMonde() {
		System.out.println( Monde.getClasse("mage") );
	}
	
	public static void testCombatgroupe() {
		Groupe bande1 = Monde.groupePersonnageFactory(1);
		Groupe rencontre1 = Monde.groupeMonstreFactory(4);
		Monde.combatGvG(bande1, rencontre1);
	}
	
	public static void main(String[] args) {
		System.out.println("hello world");
		testCombatgroupe();
		

	}

}
