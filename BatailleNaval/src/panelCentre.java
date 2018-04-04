import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class panelCentre  extends JPanel implements ActionListener{
	
	private Object pM;
	private Object pO;
	
	public panelCentre (){
		
		this.setLayout(new GridLayout(3,1));
		JButton pM = new JButton( new AbstractAction("jouer contre un ami") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	        	System.out.println("debut de jouer contre un ami");
	     		this.setVisible(true);
	        }
	    });
		
		
		/*JButton pO = new JButton("Jouer contre l'ordinateur");
		pO.addActionListener(this);
		*/
		
		JButton pO = new JButton( new AbstractAction("jouer contre l'IA") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	        	 System.out.println("debut de jouer contre l'IA");
	        }
	    });
		
		String[] options = {"Français","English"};
		JComboBox choixLangue = new JComboBox(options);
		
		this.add(pM);
		this.add(pO);
		this.add(choixLangue);
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



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}