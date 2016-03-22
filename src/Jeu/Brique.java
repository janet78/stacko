package Jeu;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import IHM.Constantes;

public class Brique extends JLabel {
	//variables
	private int x,y;
	private String couleur; 
	private Image imgBrique;
	

	//constructeur
	public Brique(int x, int y, String couleur) {
		super();
		this.x = x;
		this.y = y;

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
		this.setBounds(x, y, 100, 100);
	}
	
	//getters et setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

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


