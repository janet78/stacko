package Jeu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Case extends JButton implements MouseListener{
	public static ImageIcon imageCaisse;
	int x, y;
	Empilement empilement;
	Partie partie1;


	//constructeur
	public Case(int x, int y){
		super();
		this.x= x;
		this.y= y;
		this.empilement =  new Empilement();
		
		ImageIcon imageCaisse = new ImageIcon(getClass().getResource("../Images/caisse.png"));
		
		this.setIcon(imageCaisse);
		this.setBorder(null);
		this.setBackground(null);
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
	public Empilement getEmpilement() {
		return this.empilement;
	}

	

	public void mouseClicked(MouseEvent e) {
		System.out.println("souris cliquée en "+this.getX()+" et "+this.getY());
				
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
	
}
	


