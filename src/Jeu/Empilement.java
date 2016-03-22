package Jeu;
import java.util.*;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Empilement extends JLabel{

	public ArrayList <Brique> pileBriques;
	
	public Empilement(){
		this.pileBriques = new ArrayList<Brique>();
	}
		
	
	public void ajouterBrique(Brique brique){
		this.pileBriques.add(brique);
	}
	 
	public ArrayList <Brique> getPileBriques(){
		return this.pileBriques;
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
