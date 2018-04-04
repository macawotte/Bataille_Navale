import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PremierPanel extends JPanel implements ActionListener{
	
	public static final String TITRE = "Bataille navale";
	private Object menuBar;
	private Object menu;
	private Object pC;
	private Object info;
	private Object boutonJoueur;
	private Object info5;
	
	public PremierPanel() {
		// Layout
		this.setLayout(new BorderLayout());
		panelCentre pC = new panelCentre();
		
		JLabel info = new JLabel(TITRE);
		JButton boutonJoueur = new JButton("JOUER");
		boutonJoueur.addActionListener(this);
		
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy à hh:mm:ss").format(Calendar.getInstance().getTime());
		
		
		JLabel info5 = new JLabel("Login de <xxxx> pour application <xxxx> le " + timeStamp);
		
		this.add(info, BorderLayout.NORTH);
		this.add(pC, BorderLayout.CENTER);
		this.add(boutonJoueur, BorderLayout.EAST);
		this.add(info5, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg) {
		System.out.println("lololol");
	}
	
	
	
	
	public Object getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(Object menuBar) {
		this.menuBar = menuBar;
	}

	public Object getMenu() {
		return menu;
	}

	public void setMenu(Object menu) {
		this.menu = menu;
	}

	public Object getpC() {
		return pC;
	}

	public void setpC(Object pC) {
		this.pC = pC;
	}

	public Object getInfo() {
		return info;
	}

	public void setInfo(Object info) {
		this.info = info;
	}

	public Object getBoutonJoueur() {
		return boutonJoueur;
	}

	public void setBoutonJoueur(Object boutonJoueur) {
		this.boutonJoueur = boutonJoueur;
	}

	public Object getInfo5() {
		return info5;
	}

	public void setInfo5(Object info5) {
		this.info5 = info5;
	}

	public static String getTitre() {
		return TITRE;
	}
	
	
	

	
	
}