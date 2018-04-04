import javax.swing.*;



public class Principal extends JFrame{
	
	public Principal() {

		this.setTitle("Menu Bataille Naval");
	    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(600, 250);
		this.getContentPane().add(new PremierPanel());
		repaint();
		this.setVisible(true);
		

	}
	public static void main(String[] args) {	
		new Principal();
	}

}