package Jeu;
import java.util.*;

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
	

}
