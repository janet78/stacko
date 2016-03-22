package Jeu;


public class Partie {
	public int tabAbsCases[];
	public int tabOrdCases[];
	public Empilement[] listeEmpilements;
	public int nbCoups;
	
	
	public Partie(int tabAbsCases[],int tabOrdCases[],Empilement listeEmpilements[], int nbCoups){
		this.tabAbsCases= tabAbsCases;
		this.tabOrdCases= tabOrdCases;
		this.nbCoups = nbCoups;
		this.listeEmpilements = listeEmpilements;
		
	}
		
		//création d'un tableau de cases
	public Case [] creerListeCases(){
	Case [] listeCases = new Case[tabAbsCases.length];
	for(int i=0; i < tabAbsCases.length; i++){
		listeCases[i] = new Case(tabAbsCases[i],tabOrdCases[i]);
		for(Brique b : this.listeEmpilements[i].getPileBriques()){
		listeCases[i].getEmpilement().ajouterBrique(b);
		}
	}
	return listeCases;		
	}
	
		
}
