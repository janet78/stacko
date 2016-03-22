package IHM;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Jeu.*;


@SuppressWarnings("serial")
public class Panneau extends JPanel {

	private int xFond; //abscisse du coin supérieur gauche du fond par rapport à la fenetre 
	private ImageIcon icoFond;
	private Image imgFond;
	public Case case1;
	
	
	//grille
	int qA[]={120, 240, 360, 480, 600};
	int qO[]={120, 240, 360, 480, 600};
	
	
	//constructeur
	public Panneau(){
		super(); 
		setLayout(new FlowLayout());
		this.xFond = -50;
		
		icoFond = new ImageIcon(getClass().getResource("../Images/fondEcran.png"));
		this.imgFond = this.icoFond.getImage();
		
		//placement des cases et briques de la partie
		int cAbs[] = {qA[0],qA[1],qA[2]};
		int cOrd[] = {qA[0],qO[1],qO[0]};
		int bAbs[] = {qA[0],qO[2]};
		int bOrd[] = {qA[0],qO[0]};
		String bCouleur[] = {"jaune", "bleue"};
		
		Partie partie1 = new Partie(cAbs,cOrd,bAbs,bOrd,bCouleur, 5);
		for(int i=0; i < bAbs.length; i++){
			add(partie1.creerListeBriques()[i]);
		}
		for(int i=0; i < cAbs.length; i++){	
			add(partie1.creerListeCases()[i]);
		}
		
		//affichage du nbCoups
		JLabel compteur = new JLabel("coucou");
		add(compteur);
		
		
	}
	

	//méthodes
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.imgFond, this.xFond, 0, null); //placement du fond	
	}	
}	
	
	


