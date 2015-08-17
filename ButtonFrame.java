import javax.swing.*;
public class ButtonFrame extends JFrame {
	JButton load = new JButton ("Load");
	JButton save = new JButton("Save");
	JButton unsubscribe = new JButton ("Unsubscribe");
	
public ButtonFrame() {
	super ("Button Frame");
	setSize (340, 170);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel pane = new JPanel ();
	pane.add(load);
	pane.add(save);
	pane.add(unsubscribe);
	add(pane);
	setVisible(true);
}
	private static void setLookAndFeel () {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.NimbusLookAndFeel");
		}catch (Exception exc) {
				System.out.println(exc.getMessage());
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setLookAndFeel();
		ButtonFrame bf = new ButtonFrame();
	}

}
