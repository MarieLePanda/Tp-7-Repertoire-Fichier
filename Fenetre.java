import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;



public class Fenetre extends JFrame implements ActionListener{

	
	//Déclaration des variables
	 private JTextField nom;
	 private JTextField prenom;
	 private JTextField adresse;
	 private JTextField tel;
	 
	 private JButton b_ajout;
	 private JButton b_modif;
	 private JButton b_suppr;
	 private JButton b_affprec;
	 private JButton b_affsuiv;
	 private JButton b_quit;
	 
	 private Repertoire g;
	 
	 private int num_cour = -1;
	
	 //Constructeur
	 public Fenetre(String unTitre)
		{
			super(unTitre);
			
			g = new Repertoire();;
			
			//Créatinon du container
			Container cont = this.getContentPane(); 
			cont.setLayout(new GridLayout(5,1));
			
			//Création des label et JTxtField
			JLabel libNom = new JLabel("NOM");
			nom = new JTextField(15);
			JLabel libPrenom = new JLabel("PRENOM");
			prenom = new JTextField(15);
			JLabel libAdresse = new JLabel("ADRESSE");
			adresse = new JTextField(30);
			JLabel libTel = new JLabel("TEL");
			tel = new JTextField(10);
			
			//Création des boutons
			b_ajout = new JButton("AJOUT");
			b_ajout.addActionListener(this);
			
			b_modif = new JButton("MODIFIER");
			b_modif.addActionListener(this);
			
			b_suppr = new JButton("SUPPRIMER");
			b_suppr.addActionListener(this);
			
			b_affprec = new JButton("PRECEDENT");
			b_affprec.addActionListener(this);
			
			b_affsuiv = new JButton("SUIVANT");
			b_affsuiv.addActionListener(this);
			
			b_quit = new JButton("QUITTER");
			b_quit.addActionListener(this);
			
			this.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e) {
		        quitter();
		        
				}
			});
			
			//Création des panel
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel();
			JPanel panel5 = new JPanel();
			
			//Ajout des éléments à leur panel
			panel1.add(libNom);
			panel1.add(nom);
			
			panel2.add(libPrenom);
			panel2.add(prenom);
			
			panel3.add(libAdresse);
			panel3.add(adresse);
			
			panel4.add(libTel);
			panel4.add(tel);
			
			panel5.add(b_ajout);
			panel5.add(b_modif);
			panel5.add(b_suppr);
			panel5.add(b_affprec);
			panel5.add(b_affsuiv);
			panel5.add(b_quit);
			
			//Ajouter les panel au container
			cont.add(panel1);
			cont.add(panel2);
			cont.add(panel3);
			cont.add(panel4);
			cont.add(panel5);
			
			pack();
			
		}
	 
	public Fenetre(String unTitre, Repertoire unRepertoire)
	{
		super(unTitre);
		
		g= unRepertoire;
		
		//Créatinon du container
		Container cont = this.getContentPane(); 
		cont.setLayout(new GridLayout(5,1));
		
		//Création des label et JTxtField
		JLabel libNom = new JLabel("NOM");
		nom = new JTextField(15);
		JLabel libPrenom = new JLabel("PRENOM");
		prenom = new JTextField(15);
		JLabel libAdresse = new JLabel("ADRESSE");
		adresse = new JTextField(30);
		JLabel libTel = new JLabel("TEL");
		tel = new JTextField(10);
		
		//Création des boutons
		b_ajout = new JButton("AJOUT");
		b_ajout.addActionListener(this);
		
		b_modif = new JButton("MODIFIER");
		b_modif.addActionListener(this);
		
		b_suppr = new JButton("SUPPRIMER");
		b_suppr.addActionListener(this);
		
		b_affprec = new JButton("PRECEDENT");
		b_affprec.addActionListener(this);
		
		b_affsuiv = new JButton("SUIVANT");
		b_affsuiv.addActionListener(this);
		
		b_quit = new JButton("QUITTER");
		b_quit.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
	        quitter();
	        
			}
		});
		
		//Création des panel
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		//Ajout des éléments à leur panel
		panel1.add(libNom);
		panel1.add(nom);
		
		panel2.add(libPrenom);
		panel2.add(prenom);
		
		panel3.add(libAdresse);
		panel3.add(adresse);
		
		panel4.add(libTel);
		panel4.add(tel);
		
		panel5.add(b_ajout);
		panel5.add(b_modif);
		panel5.add(b_suppr);
		panel5.add(b_affprec);
		panel5.add(b_affsuiv);
		panel5.add(b_quit);
		
		//Ajouter les panel au container
		cont.add(panel1);
		cont.add(panel2);
		cont.add(panel3);
		cont.add(panel4);
		cont.add(panel5);
		
		pack();
		
	}
	
	//Ecouteur de bouton
	public void actionPerformed(ActionEvent arg0) 
	{

		if("AJOUT"==arg0.getActionCommand())
		{
			ajoute_per();
			
		}

		if("MODIFIER" == arg0.getActionCommand())
		{
			modif_per();
		}
		
		if("SUPPRIMER" == arg0.getActionCommand())
		{
			suppr_per();
		}
		
		if("PRECEDENT"==arg0.getActionCommand())
		{
			affiche_prec();
		}

		if("SUIVANT"==arg0.getActionCommand())
		{
			affiche_suiv();
		}

		if("QUITTER"==arg0.getActionCommand())
		{
			quitter();
			
		}
	}
	
	//Fonction
	
	//Permet d'ajouter une personne
	public void ajoute_per()
	{
		
			g.ajouterPersonne(nom.getText(), prenom.getText(), adresse.getText(), tel.getText());
			nom.setText(null); prenom.setText(null); adresse.setText(null); tel.setText(null);
			
	}
	
	//Permet de modifier une personne
	public void modif_per()
	{
		g.recherchePersonne(num_cour).setNom(nom.getText());
		g.recherchePersonne(num_cour).setPrenom(prenom.getText());
		g.recherchePersonne(num_cour).setAdresse(adresse.getText());
		g.recherchePersonne(num_cour).setTelephone(tel.getText());
	}
	
	//Permet supprimer une personne
	public void suppr_per()
	{
		g.supprPersonne(g.recherchePersonne(num_cour));
		nom.setText(null); prenom.setText(null); adresse.setText(null); tel.setText(null);
	}
	
	//Permet d'afficher la personne précédente
	public void affiche_prec()
	{
		if(num_cour<=0)
		{
			System.out.print("Il n'y à pas de précédent.");
		}
		else
		{
			num_cour--;
			nom.setText(g.recherchePersonne(num_cour).getNom());
			prenom.setText(g.recherchePersonne(num_cour).getPrenom());
			adresse.setText(g.recherchePersonne(num_cour).getAdresse());
			tel.setText(g.recherchePersonne(num_cour).getTelephone());	
		}
	}
	
	//Permet d'afficher la personne suivante
	public void affiche_suiv()
	{
		if(num_cour>=g.tailleListe()-1)
		{
			System.out.print("Il n'y à pas de suivant.");
		}
		else
		{
			num_cour++;
			
			nom.setText(g.recherchePersonne(num_cour).getNom());
			prenom.setText(g.recherchePersonne(num_cour).getPrenom());
			adresse.setText(g.recherchePersonne(num_cour).getAdresse());
			tel.setText(g.recherchePersonne(num_cour).getTelephone());		
		}
	}
	
	public void quitter()
	{
		g.sauvegarde();
		System.exit(0);
	}
}

    class DelegueFrame extends WindowAdapter {

	// Fermeture de ma fenêtre via le bouton rouge
	
	public void windowClosing(WindowEvent e) {
	        
	        System.exit(0);
		}
	
}


