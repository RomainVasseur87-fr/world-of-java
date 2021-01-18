package interfaceWOJ;

public interface IAttaque {

	public int LancerAttaque(ICombattant lanceur, ICombattant cible);

	// Getters et Setters
	public String getNom();

	public String getDescription();

	public double getChanceToucher();

	public void setNom(String nom);

	public void setDescription(String description);

	public void setChanceToucher(double chanceToucher);
	// Chance de toucher doit être compris entre 0 et 100 obligatoirement

}
