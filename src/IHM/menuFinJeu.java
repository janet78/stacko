package IHM;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class menuFinJeu extends JFrame implements ActionListener{
	JPanel pan = new JPanel();	
	
	public menuFinJeu(){
		this.setTitle("Niveau réussi");
		this.setSize(Constantes.FRAME_WIDTH,Constantes.FRAME_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);		
		this.setContentPane(this.pan);		
		this.setLayout(null);
		this.setBackground(Color.yellow);

}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	}
