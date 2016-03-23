package Jeu;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import IHM.Constantes;

public class FenetreFin {
	JPanel pan = new JPanel();	
	JButton bNiveaux;
	JButton bPlay;


    public FenetreFin(){
    	
    	this.setTitle("Bravo ! Niveau fini");
		this.setSize(Constantes.FRAME_WIDTH,Constantes.FRAME_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);		
		this.setContentPane(this.pan);		
		this.setLayout(null);
		this.setBackground(Color.pink);
    
		
		this.bReset = new JButton("Rejouer");
		this.bReset.addActionListener(this);
		this.bReset.setBounds(200, 400, 190, 30);
		this.pan.add(this.bReset);
	
		this.bPlay = new JButton("Retour");
		this.bPlay.addActionListener(this);
		this.bPlay.setBounds(200, 500, 190, 30);
		this.pan.add(this.bPlay);
	
    }


	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bPlay){
			System.exit(0);
		}
		if(e.getSource() == bReset){
			
		}
		
	}
}
