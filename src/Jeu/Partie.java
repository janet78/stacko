package Jeu;


public class Partie {
	public int tabAbsCases[];
	public int tabOrdCases[];
	public Empilement[] listeEmpilements;
	public int nbCoups;
	public Empilement empilementFinal;
	
	
	public Partie(int tabAbsCases[],int tabOrdCases[],Empilement listeEmpilements[], int nbCoups, Empilement empilementFinal){
		this.tabAbsCases= tabAbsCases;
		this.tabOrdCases= tabOrdCases;
		this.nbCoups = nbCoups;
		this.listeEmpilements = listeEmpilements;
		this.empilementFinal = empilementFinal;
		
	}
		
	
		//création d'un tableau de cases
	public Case [] creerListeCases(){
	Case [] listeCases = new Case[tabAbsCases.length];
	for(int i=0; i < tabAbsCases.length; i++){
		listeCases[i] = new Case(tabAbsCases[i],tabOrdCases[i]);	
	}
	return listeCases;		
	}
		
	
	
	
 

}
