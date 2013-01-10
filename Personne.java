import java.util.ArrayList;


public class Personne {

	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private ArrayList <String>  listeAttribut;
	
	// Get & Set
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public static int getNbPersonne() {
		return nbPersonne;
	}

	public static void setNbPersonne(int nbPersonne) {
		Personne.nbPersonne = nbPersonne;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	private static int nbPersonne;
	
	//Constructeur 
	public Personne()
	{
		
		nbPersonne++;
	}
	
	public Personne(String unNom, String unPrenom, String uneAdresse, String unTelephone)
	{
		nom = unNom ; prenom = unPrenom ; adresse = uneAdresse ; telephone = unTelephone; 
		nbPersonne++;
	}
	
	public Personne(String[] uneListe)
	{
		nom = uneListe[0];
		prenom = uneListe[1];
		adresse = uneListe[2];
		telephone = uneListe[3];
		nbPersonne++;
	}
	
	
	
	//Fonction
	public void AfficheCoordonnees()
	{
		System.out.print("Nom : "+nom+"\nPrénom : "+prenom+"\nAdresse : "+adresse+"\nTéléphone : "+telephone+"\n------------------------------------------------\n");
	}
	
	public String toString()
	{
		return (nom+";"+prenom+";"+adresse+";"+telephone);
	}
	

}
