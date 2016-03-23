package Jeu;
import java.util.*;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.*;
import Main.Brique;


public class Empilement {
	public String combinaisonCouleurs[];
	
	public Partie partie;
	public Brique[] pileBriques;
	
	ArrayList <Brique> empilement =new ArrayList <Brique>();
	
	//faire code pour afficher empilement au dessus de la case

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Empilement extends JLabel{

	public Vector<Brique>  pileBriques;
	
	public Empilement(){
		this.pileBriques = new Vector<Brique>();
	}
		
	
	public void ajouterBrique(Brique brique){
		this.pileBriques.addElement(brique);
	}
	 
	public Vector <Brique> getPileBriques(){
		return this.pileBriques;
	 }
	
	
	//création de la combinaison de couleur 
	public String [] getCombinaisonCouleurs(){
		String [] listeCombinaisonCouleurs = new String[pileBriques.size()];	
		for(int i=0; i<pileBriques.size(); i++){
			listeCombinaisonCouleurs[i] = pileBriques.elementAt(i).getCouleur();
		}
	return listeCombinaisonCouleurs;
		
	}
>>>>>>> origin/master
	
}
