import javax.swing.*;
public class Password extends javax.swing.JFrame {
	JTextField username = new JTextField (10);
	JPasswordField password = new JPasswordField (10);
	
	public Password() {
		super ("Password");
		setSize(200, 175);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		JLabel usernameLabel = new JLabel("Username: ");
		JLabel passwordLabel = new JLabel("Password: ");
		
		pane.add(usernameLabel);
		pane.add(username);
		pane.add(passwordLabel);
		pane.add(password);
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
		Password.setLookAndFeel ();
		Password pw = new Password ();
	}
}

