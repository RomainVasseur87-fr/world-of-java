package interfaceWOJ;

public interface ICombattant {
	
	    public void attaquer(ICombattant adversaire);
	    public void defendre(int degats);

	    // Getters et Setters
	    public String getNom();
	    public int getDegats();
	    public int getPointDeVie();
	    public void setNom(String nom);
	    public void setDegats(int degats);
	    public void setPointDeVie(int pointDeVie);
	
	
}
