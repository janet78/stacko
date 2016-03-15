package Jeu;
import java.awt.event.*;


import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Case extends JButton implements ActionListener{
	public static ImageIcon imageCaisse;
	int x, y;

	//constructeur
	public Case(int x, int y){
		super();
		this.x= x;
		this.y= y;	
		
		ImageIcon imageCaisse = new ImageIcon(getClass().getResource("../Images/caisse.png"));
		
		this.setIcon(imageCaisse);
		this.setBorder(null);
		this.setBackground(null);
		this.setBounds(x-15, y+28, imageCaisse.getIconWidth(), imageCaisse.getIconHeight());		
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ev){
		System.out.println("coucou");
		
	}
	
}
	


