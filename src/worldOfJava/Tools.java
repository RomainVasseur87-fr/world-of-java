package worldOfJava;

import java.util.Scanner;

public class Tools {
	
	/*
	* Demande a l'utilisateur d'entrer une nouvelle ligne dans la console.
	* @param message: de demande.
	* @return la ligne entré par l'utilisateur.
	*/
	public static String inputString(String message) {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
		}
	/*
	* Demande a l'utilisateur d'entré un entier.
	* @param message: de demande.
	* @return un entier.
	*/
	public static int inputInt(String message) {
			String result = inputString(message);
			return Integer.parseInt(result);
			
		}
}
