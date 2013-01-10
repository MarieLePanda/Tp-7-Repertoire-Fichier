import java.util.ArrayList;


public class Repertoire {

	private ArrayList <Personne>  liste;
	
	//Constructeur
	public Repertoire()
	{
		liste = Fichier.lecture();
	}
	
	//Fonction
	
	public int tailleListe()
	{
		return liste.size();
	}
	
	public void afficheRepertoire()
	{
		for (Personne pers : liste)
			System.out.print(pers.toString());
	}
	
	public String renvoieRepertoire()
	{
		String description ="";
			for(Personne pers : liste)
			{
				description += pers.toString();
			}
		return description;
	}
	
	public Personne recherchePersonne(int unIndice)
	{
		Personne resultat = null;
		resultat = liste.get(unIndice);

		return resultat;
	}
	
	public void ajouterPersonne(String unNom, String unPrenom, String uneAdresse, String unTelephone)
	{
		liste.add(new Personne(unNom, unPrenom, uneAdresse, unTelephone));
		
	}
	
	public void sauvegarde(){
		Fichier.ecriture(liste);
	}
	
	public void supprPersonne(Personne unePersonne)
	{
		liste.remove(unePersonne);
	}
	
	public Personne recherche(String unNom, String unPrenom)
	{
		Personne resultat = null;
		for (Personne pers : liste)
		{
			if(unNom == pers.getNom() && unPrenom == pers.getPrenom())
			{
				resultat = pers;
			}
			
		}
		return resultat;
	}
}
