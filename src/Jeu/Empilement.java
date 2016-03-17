package Jeu;
import java.util.*;

public class Empilement{

	public Vector<Brique>  pileBriques;
	
	public Empilement(){
		this.pileBriques = null;
	}
		
	
	public void ajouterBrique(Brique brique){
		this.pileBriques.add(brique);
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
