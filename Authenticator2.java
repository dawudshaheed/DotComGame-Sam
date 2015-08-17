import javax.swing.*;

public class Authenticator2 extends javax.swing.JFrame {
	JTextField username = new JTextField (15);
	JPasswordField password = new JPasswordField (15);
	JTextArea comments = new JTextArea (4, 15);
	JButton ok = new JButton ("OK");
	JButton cancel = new JButton ("Cancel");
	
	public Authenticator2 () {
		super ("Account Information");
		setSize (300, 200);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel ();
		JLabel usernameLabel = new JLabel ("Username: ");
		JLabel passwordLabel = new JLabel ("Password: ");
		JLabel commentsLabel = new JLabel ("Comments: ");
		comments.setLineWrap(true);
		comments.setWrapStyleWord(true);
		
		pane.add(usernameLabel);
		pane.add(username);
		pane.add(passwordLabel);
		pane.add(password);
		pane.add(commentsLabel);
		pane.add(comments);
		
		JScrollPane scroll = new JScrollPane (comments, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
				
		pane.add(scroll);		
		pane.add(ok);
		pane.add(cancel);
		
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
		Authenticator2.setLookAndFeel ();
		Authenticator2 auth = new Authenticator2 ();
	}
}

