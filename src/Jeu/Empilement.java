package Jeu;
import java.util.*;
import java.util.ArrayList;
import java.util.*;



public class Empilement {
	public String combinaisonCouleurs[];
	public Partie partie;
	public ArrayList <Brique> pileBriques;
	
	
	public Empilement(){
		this.pileBriques = new ArrayList<Brique>();
	}
	
	public ArrayList <Brique> getPileBriques(){
		return pileBriques;
	}
	
	public void ajouterBrique(Brique brique){
		this.pileBriques.add(brique);
	}
	 
	 
	
	//création de la combinaison de couleur 
	public String [] getCombinaisonCouleurs(){
		String [] listeCombinaisonCouleurs = new String[pileBriques.size()];	
		for(int i=0; i<pileBriques.size(); i++){
			listeCombinaisonCouleurs[i] = pileBriques.get(i).getCouleur();
		}
	return listeCombinaisonCouleurs;
		
	}

	
}
