import javax.swing.JFrame;

public class MapGeneration extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public MapGeneration() {
		this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MapGeneration();
	}
}
