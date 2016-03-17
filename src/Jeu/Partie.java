package Jeu;

import java.awt.Component;

import Jeu.Partie;

public class Partie {
	public int tabAbsCases[];
	public int tabOrdCases[];
	//public int tabAbsBriques[];
	//public int tabOrdBriques[];
	//public String tabCouleursBriques[];
	public Empilement[] listeEmpilements;
	public int nbCoups;
	
	
	public Partie(int tabAbsCases[],int tabOrdCases[],Empilement listeEmpilements[], int nbCoups){
		this.tabAbsCases= tabAbsCases;
		this.tabOrdCases= tabOrdCases;
		//this.tabAbsBriques= tabAbsBriques;
		//this.tabOrdBriques= tabOrdBriques;
		//this.tabCouleursBriques= tabCouleursBriques;
		this.nbCoups = nbCoups;
		
	}
		
		//création d'un tableau de cases
	public Case [] creerListeCases(){
	Case [] listeCases = new Case[tabAbsCases.length];
	for(int i=0; i < tabAbsCases.length; i++){
		listeCases[i] = new Case(tabAbsCases[i],tabOrdCases[i], listeEmpilements[i]);
		}
	return listeCases;		
	}
	
		
}
