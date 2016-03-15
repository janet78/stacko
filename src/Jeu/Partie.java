package Jeu;

import Jeu.Partie;

public class Partie {
	public int tabAbsCases[];
	public int tabOrdCases[];
	public int tabAbsBriques[];
	public int tabOrdBriques[];
	public String tabCouleursBriques[];
	public int nbCoups;
	
	
	public Partie(int tabAbsCases[],int tabOrdCases[],int tabAbsBriques[],int tabOrdBriques[],String tabCouleursBriques[], int nbCoups){
		this.tabAbsCases= tabAbsCases;
		this.tabOrdCases= tabOrdCases;
		this.tabAbsBriques= tabAbsBriques;
		this.tabOrdBriques= tabOrdBriques;
		this.tabCouleursBriques= tabCouleursBriques;
		this.nbCoups = nbCoups;
		
	}
		
		//création d'un tableau de cases
	public Case [] creerListeCases(){
	Case [] listeCases = new Case[tabAbsCases.length];
	for(int i=0; i < tabAbsCases.length; i++){
		listeCases[i] = new Case(tabAbsCases[i],tabOrdCases[i]);
		}
	return listeCases;		
	}
	
		//création d'un tableau de briques
	public Brique [] creerListeBriques(){
	Brique [] listeBriques = new Brique[tabAbsBriques.length];
	for(int i=0; i < tabAbsBriques.length; i++){
		listeBriques[i] = new Brique(tabAbsBriques[i],tabOrdBriques[i],tabCouleursBriques[i]);
		}
	return listeBriques;		
		}
 
}
