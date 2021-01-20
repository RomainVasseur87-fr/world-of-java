package interfaceWOJ;

public interface ICombattant {

	/**
	 * methode qui appelle la methode defendre de l'adversaire et affiche votre
	 * nombdre de degats.
	 */
	public void attaquer(ICombattant adversaire);

	/**
	 * methode qui soustraire aux points de vie du combattants les degats entrés en
	 * parramteres
	 */
	public void defendre(int degats);
	
	/**
	 * methode qui return true si le combattant est mort, sinon return false
	 * @return
	 */
	public boolean estMort();
	
	// Getters et Setters
	public String getNom();

	public int getDegats();

	public int getPointDeVie();

	public void setNom(String nom);

	public void setDegats(int degats);

	public void setPointDeVie(int pointDeVie);

}
