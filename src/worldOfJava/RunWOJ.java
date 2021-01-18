package worldOfJava;

public class RunWOJ {

	public static void testCombat() {
		Monde.combat(Monde.personnageFactory(), Monde.monstreFactory() );
	}
	
	public static void main(String[] args) {
		System.out.println("hello world");
		testCombat();
		

	}

}
