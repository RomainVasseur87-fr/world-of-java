package worldOfJava;

import entiteWOJ.Combattant;
import entiteWOJ.Groupe;

public class RunWOJ {

	public static void testCombat() {
		Monde.combat(Monde.personnageFactory(), Monde.monstreFactory() );
	}
	
	public static void testAtkDef() {
		Combattant peon1 = Monde.personnageFactory();
		Combattant mob1 = Monde.monstreFactory();
		
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
		Groupe rencontre1 = Monde.creationGroupeMonstre(3);
		System.out.println(rencontre1);
	}
	public static void testGroupePersonnage() {
		Groupe bande1 = Monde.creationGroupePersonnage(3);
		System.out.println(bande1);
	}
	
	public static void testcombat1v1() {
		Monde.genese();
		Monde.combat1v1();
	}
	
	public static void main(String[] args) {
		System.out.println("hello world");
		testcombat1v1();
		

	}

}
