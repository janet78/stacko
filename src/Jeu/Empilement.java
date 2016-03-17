package Jeu;

public class Empilement{

	public Brique [] tabBriques;
	
	public Empilement(Brique [] tabBriques){
		this.tabBriques = tabBriques;
	}
	
	
	
	
	
	

	
	
	
	
	//création de la combinaison de couleur en oui
	public String [] getCombinaisonCouleurs(){
		String [] listeCombinaisonCouleurs = new String[tabBriques.length];	
		for(int i=0; i<tabBriques.length; i++){
			listeCombinaisonCouleurs[i] = tabBriques[i].getCouleur();
		}
	return listeCombinaisonCouleurs;
		
	}
	

}
