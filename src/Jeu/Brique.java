package Jeu;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import IHM.Constantes;

@SuppressWarnings("serial")
public class Brique extends JLabel{
	//variables
	
	private String couleur; 
	private Image imgBrique;
	

	//constructeur
	public Brique(String couleur) {
		super();
		

		if(couleur =="rouge"){
				this.couleur = Constantes.COULEUR_ROUGE;
		}
		else if(couleur=="verte"){
			this.couleur = Constantes.COULEUR_VERTE;
		}
		else if(couleur=="bleue"){
			this.couleur = Constantes.COULEUR_BLEUE;
		}
		else if(couleur=="jaune"){
			this.couleur = Constantes.COULEUR_JAUNE;
		}
		
		String fichier = "../Images/brique" + this.couleur + ".png";
		this.setIcon(new ImageIcon(getClass().getResource(fichier)));
	}
	
	/*public void deplacer(int dx, int dy){
		this.setX(x+dx);
		this.setY(y+dy);
		
	}*/
	
	//getters et setters

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public Image getImgBrique(){
		return imgBrique;
	}
	
	public void deplacer(int dx, int dy){
		x+=dx;
		y+=dy;
		}
	
	
}


