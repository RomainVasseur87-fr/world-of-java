package worldOfJava;

import entiteWOJ.Combattant;

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
		Monde.combat2(Monde.personnageFactory(), Monde.monstreFactory() );
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello world");
		testCombat2();
		

	}

}
