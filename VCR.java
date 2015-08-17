import javax.swing.*;

public class VCR extends JFrame {
	JButton play = new JButton ("Play");
	JButton stopeject = new JButton ("Stop/Eject");
	JButton rewind = new JButton ("Rewind");
	JButton fastforward = new JButton ("Fast Forward");
	JButton pause = new JButton ("Pause");
	
	public VCR() {
		super ("VCR");
		setSize (600,75);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		pane.add(play);
		pane.add(stopeject);
		pane.add(rewind);
		pane.add(fastforward);
		pane.add(pause);
		add(pane);
		setVisible(true);
}
	private static void setLookAndFeel () {
		try { 
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VCR.setLookAndFeel ();
		VCR vcr = new VCR ();
	}
}

