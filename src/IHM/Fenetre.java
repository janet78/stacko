package IHM;

import javax.swing.JFrame;

public class Fenetre extends JFrame{
	
	public Fenetre(){
		setTitle("Stacko");
		setSize(800, 800);
		Panneau pan = new Panneau();
		pan.setLayout(null);
		getContentPane().add(pan);
	}
}
