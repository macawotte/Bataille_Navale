import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class panelCentre  extends JPanel implements ActionListener{
	
	private Object pM;
	private Object pO;
	
	public panelCentre (){
		this.setLayout(new GridLayout(1,3));
		
		JButton pM = new JButton("Jouer contre un ami");
		pM.addActionListener(this);
		
		JButton pO = new JButton("Jouer contre l'ordinateur");
		pO.addActionListener(this);
		
		
		String[] options = {"Français","English"};
		JComboBox choixLangue = new JComboBox(options);
		
		this.add(pM);
		this.add(pO);
		this.add(choixLangue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Ca passe --- avant le if "); 
        if (e.getSource()==pO) {
        	 System.out.println("Ca passe"); 
		}else {
			System.out.println("play contre une autre personne");
		}

	}

	
	
	
	public Object getpM() {
		return pM;
	}

	public void setpM(Object pM) {
		this.pM = pM;
	}

	public Object getpO() {
		return pO;
	}

	public void setpO(Object pO) {
		this.pO = pO;
	}
	
	

}

