package Jeu;
import IHM.Panneau;

import javax.swing.ImageIcon;

import java.awt.event.*;

import javax.swing.JButton;

import java.io.File;
import java.io.IOException;

public class Case extends JButton implements MouseListener {
	public static ImageIcon imageCaisse;
	int x, y;
	Empilement empilement;
	

	//constructeur
	public Case(int x, int y){
		super();
		this.x= x;
		this.y= y;
		this.empilement=new Empilement();
		
		addMouseListener(this);
		
		ImageIcon imageCaisse = new ImageIcon(getClass().getResource("../Images/caisse.png"));
		
		
		this.setIcon(imageCaisse);
		this.setBorder(null);
		this.setBackground(null);
		this.setBounds(x-15, y+28, imageCaisse.getIconWidth(), imageCaisse.getIconHeight());
	}
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
		
		public Empilement getEmpilement(){
			return this.empilement;
		}
		
		
		
		
			
			//afficher fenetre avec pour titre "bravo niveau fini" et les boutons du menu de départ
		
	
	public void mouseClicked(MouseEvent e) {
		//System.out.println("souris cliqué en"+ this.getX() + "  " + this.getY() );
		Case CaseSupGauche = Case(this.x-120,this.y-120);
		Case CaseSupDroite = Case(this.x+120,this.y-120);
		this.getEmpilement().add(this.CaseSupGauche.getEmpilement());
		this.getEmpilement().add(this.CaseSupDroite.getEmpilement());
		if (this.getEmpilement()==EmpilementFinal){
			FenetreFin;
		}
		}
}
}	


