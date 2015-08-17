import javax.swing.*;

public class SimpleFrame extends JFrame {
	public SimpleFrame() {
		super ( "My 1ST Frame" );
		setSize (300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setVisible(true);
	}
	private static void setLookAndFeel(){
		try {
			UIManager.setLookAndFeel("com.sum.java.swing.plaf.numbus.NimbusLookAndFeel");
		}catch (Exception exc){
				//ignore error
			
		}
	}
	
	public static void main(String[] argumentss) {
		// TODO Auto-generated method stub
		setLookAndFeel();
		SimpleFrame  sf = new SimpleFrame();
	}
}
