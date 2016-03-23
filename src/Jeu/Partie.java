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
		
	Empilement EmpilementFinal=new Empilement
		//création d'un tableau de cases
	public Case [] creerListeCases(){
	Case [] listeCases = new Case[tabAbsCases.length];
	for(int i=0; i < tabAbsCases.length; i++){
		listeCases[i] = new Case(tabAbsCases[i],tabOrdCases[i]);

		listeCases[i].addEmpilement(vectEmpilement[i]);

		for(Brique b : this.listeEmpilements[i].getPileBriques()){
		listeCases[i].getEmpilement().ajouterBrique(b);
		}
	}
	return listeCases;		

	}
		}
	return listeCases;	
	
	//ajouter empilement final
	Empilementfinal=
	

		//création d'un tableau de briques
	public Brique [] creerListeBriques(){
	Brique [] listeBriques = new Brique[tabAbsBriques.length];
	for(int i=0; i < tabAbsBriques.length; i++){
		listeBriques[i] = new Brique(tabAbsBriques[i],tabOrdBriques[i],tabCouleursBriques[i]);
		}
	return listeBriques;		
		}
	//CrÈation d'un tableau d'empilement
	
 

}
