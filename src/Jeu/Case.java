package Jeu;
<<<<<<< HEAD
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
=======
import java.awt.event.*;

>>>>>>> origin/master

import javax.swing.ImageIcon;
import javax.swing.JButton;

<<<<<<< HEAD
public class Case extends JButton implements MouseListener{
=======
public class Case extends JButton implements ActionListener{
>>>>>>> origin/master
	public static ImageIcon imageCaisse;
	int x, y;
	Empilement empilement;
	Partie partie1;


	//constructeur
	public Case(int x, int y, Empilement empilement){
		super();
		this.x= x;
		this.y= y;	
		this.empilement = empilement;
		
		ImageIcon imageCaisse = new ImageIcon(getClass().getResource("../Images/caisse.png"));
		
		this.setIcon(imageCaisse);
		this.setBorder(null);
		this.setBackground(null);
<<<<<<< HEAD
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
=======
		this.setBounds(x-15, y+28, imageCaisse.getIconWidth(), imageCaisse.getIconHeight());		
		this.addActionListener(this);
>>>>>>> origin/master
	}

	public void setY(int y) {
		this.y = y;
	}
	public Empilement getEmpilement() {
		return empilement;
	}

	
<<<<<<< HEAD

	public void mouseClicked(MouseEvent e) {
		System.out.println("souris cliquŽe en "+this.getX()+" et "+this.getY());
		System.out.println(this.getEmpilement());		
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
=======
	public void actionPerformed(ActionEvent ev){
		System.out.println("coucou");
>>>>>>> origin/master
		
	}
	
}
	


