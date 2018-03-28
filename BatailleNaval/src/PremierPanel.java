import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

public class PremierPanel extends JPanel{
	
	public static final String TITRE = "Bataille navale";
	private static String[] options = {"Multijoueurs local","Multijoueur IA"};
	public PremierPanel() {
		// Layout
		this.setLayout(new BorderLayout());
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Joueur");
		menuBar.add(menu);
		
		//JOptionPane jop1 = new JOptionPane();
		//jop1.showMessageDialog(null, "Voulez vous vraiment quitter ?", "Fermeture du jeu", JOptionPane.WARNING_MESSAGE);
		
		JLabel info = new JLabel(TITRE);
		JButton boutonJouer = new JButton("JOUER");
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy à hh:mm:ss").format(Calendar.getInstance().getTime());
		JComboBox choix = new JComboBox(options);
		
		JLabel info5 = new JLabel("Login de <xxxx> pour application <xxxx> le " + timeStamp);
		
		this.add(info, BorderLayout.NORTH);
		this.add(choix, BorderLayout.CENTER);
		this.add(boutonJouer, BorderLayout.EAST);
		this.add(info5, BorderLayout.SOUTH);
	}
}