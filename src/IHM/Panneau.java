package IHM;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Jeu.*;


@SuppressWarnings("serial")
public class Panneau extends JPanel implements ActionListener{

	private int xFond; //abscisse du coin supérieur gauche du fond par rapport à la fenetre 
	private ImageIcon icoFond;
	private Image imgFond;
	public Case case1;
	public JButton bMenu;
	public JLabel compte;
	public int nbClicsRestants;
	
	
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
			partie1.creerListeCases()[i].addActionListener(this);
			add(partie1.creerListeCases()[i]);
		}
		
		//affichage du nbCoups
		nbClicsRestants = partie1.nbCoups;
		this.compte = new JLabel("nombre de coups restants : "+nbClicsRestants);
		this.compte.setBounds(25, 25, 200, 50);
		add(this.compte);
		
		//bouton menu
		this.bMenu = new JButton("MENU");
		this.bMenu.addActionListener(this);
		this.bMenu.setBounds(20, 750, 80, 20);
		add(this.bMenu);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == this.bMenu){
			new menuJeu();
		}	
	}

	//méthodes
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.imgFond, this.xFond, 0, null); //placement du fond
	}




	
	
		
}	
	
	


