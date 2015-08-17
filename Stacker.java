import java.awt.*;
import javax.swing.*;

public class Stacker extends JFrame {
	public Stacker () {
	super ("Stacker");
	setSize (430, 150);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLookAndFeel();
	
	//create top panel
	JPanel commandPane = new JPanel();
	BoxLayout horizontal = new BoxLayout (commandPane, BoxLayout.X_AXIS);
	JButton subscribe = new JButton ("Subscribe");
	JButton unsubscribe = new JButton ("Unsubscribe");
	JButton refresh = new JButton ("Refresh");
	JButton save = new JButton ("Save");
	
	commandPane.add(subscribe);
	commandPane.add(unsubscribe);
	commandPane.add(refresh);
	commandPane.add(save);
	
	//create bottom pane
	JPanel textPane = new JPanel ();
	JTextArea text = new JTextArea (4, 70);
	JScrollPane scrollPane = new JScrollPane (text);
	
	//put them together
	FlowLayout flow = new FlowLayout ();
	setLayout (flow);
	add(commandPane);
	add(textPane);
	add(scrollPane);
	setVisible(true);
}
private void setLookAndFeel () {
	try { 
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		
		SwingUtilities.updateComponentTreeUI(this);
	
	} catch (Exception e) {
		System.err.println("Could not use the system " + "look and feel: " + e);
	}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Stacker st = new Stacker();
}
}
	
	
	
	


