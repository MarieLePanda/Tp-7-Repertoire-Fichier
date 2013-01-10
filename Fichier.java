import java.io.*;
import java.util.*;


public class Fichier {
	
	public static ArrayList<Personne> lecture(){
		
		
		FileReader fichierLecture;
		ArrayList <Personne>  listePersonne = new ArrayList();
		try {
		fichierLecture = new FileReader("repertoire.txt");
		 
		
				
		BufferedReader fichier = new BufferedReader(fichierLecture);
		
		
		String ligne;
		
		
		
			while ((ligne = fichier.readLine()) != null){
				
				listePersonne.add(new Personne(ligne.split(";")));
				
			}
			fichierLecture.close();
		} 
		
		catch (FileNotFoundException e1) {
			e1.getMessage();
		}
		
		catch (IOException e) {
			e.getMessage();
		}
		
		return listePersonne;
	}


	public static void ecriture(ArrayList<Personne> liste){
		
		try{
			System.out.println("Fichier Créer");
			FileWriter ficherEcriture = new FileWriter("repertoire.txt");
			BufferedWriter fichier = new BufferedWriter(ficherEcriture);
			
			for (Personne pers : liste)
			{
				
				fichier.write(pers.toString());
				fichier.newLine();
			}
			fichier.close();
		}
		catch(IOException err){
			err.getMessage();;
		}
	}

}
