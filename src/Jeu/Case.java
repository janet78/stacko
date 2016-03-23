package Jeu;
import IHM.Panneau;

import javax.swing.ImageIcon;

import java.awt.event.*;

import javax.swing.JButton;

import IHM.Fenetre;
import IHM.menuFinJeu;

import java.io.File;
import java.io.IOException;

public class Case extends JButton implements MouseListener {



@SuppressWarnings("serial")

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
		this.setBounds(x, y, imageCaisse.getIconWidth(), imageCaisse.getIconHeight());
		addMouseListener(this);

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
	
	public Empilement getEmpilement(){
			return this.empilement;
		}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
	/*public void mouseClicked(MouseEvent e) {
		//System.out.println("souris cliquée en "+this.getX()+" et "+this.getY());
		Case CaseSupGauche = e(this.x-120, this.y-120);
		Case CaseSupDroite = e(this.x+120, this.y-120);
		this.getEmpilement().addElement(e.CaseSupGauche.getEmpilement());
		this.getEmpilement().addElement(e.CaseSupDroite.getEmpilement());
		if(this.getEmpilement() == partie1.empilementFinal){
			new menuFinJeu();
		}		
	}*/
	


		
}	
		
		
	