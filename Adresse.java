
public class Adresse {

	private String rue;
	private String rue2;
	private String codePostal;
	private String ville;
	
	public Adresse(String uneRue, String uneRue2, String unCodePostal, String uneVille)
	{
		rue = uneRue; rue2 = uneRue2; codePostal = unCodePostal; ville = uneVille;
	}
	
	public void afficheAdresse()
	{
		System.out.print(rue+"\n\t"+rue2+"\n\t"+codePostal+"\n\t"+ville);
	}
	
	public String renvoieAdresse()
	{
		return (rue+"\n\t"+rue2+"\n\t"+codePostal+"\n\t"+ville);
	}
}
