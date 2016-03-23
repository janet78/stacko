package IHM;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class menuJeu extends JFrame implements ActionListener{
	
	JPanel pan = new JPanel();	
	JButton bReset;
	JButton bNiveaux;
	JButton bPlay;


    public menuJeu(){
    	
    	this.setTitle("Menu");
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