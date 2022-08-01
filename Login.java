package LibraryMangement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField loginText;
	private JPasswordField passwordText;
	
	//	private final Action action = new SwingAction();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1214, 751);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(219, 243, 72, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(219, 292, 62, 34);
		contentPane.add(lblNewLabel_1);
		
		loginText = new JTextField();
		loginText.setBounds(341, 237, 266, 34);
		contentPane.add(loginText);
		loginText.setColumns(10);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(341, 292, 266, 34);
		contentPane.add(passwordText);
		passwordText.setColumns(10);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBackground(new Color(240, 255, 255));
		
		loginButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
			String name=loginText.getText();
			String password=String.valueOf(passwordText.getPassword());
			
				if(name.equals("admin")&&password.equals("admin123")){
					Books.main(new String[]{});
					//JFrame.dispose();
				}else{
					JOptionPane.showMessageDialog(Login.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					loginText.setText("");
					passwordText.setText("");
				}
			}
		});
		loginButton.setBounds(294, 393, 154, 39);
		contentPane.add(loginButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(SystemColor.textHighlight);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginText.setText("");
				passwordText.setText("");
			}
		});
		btnReset.setBounds(490, 393, 135, 39);
		contentPane.add(btnReset);
		
		JLabel lblLibraryMangementSystem = new JLabel("Library Mangement System");
		lblLibraryMangementSystem.setFont(new Font("Arial", Font.BOLD, 13));
		lblLibraryMangementSystem.setBounds(10, 0, 1120, 55);
		contentPane.add(lblLibraryMangementSystem);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration.main(new String[]{});
			}
		});
		btnSignup.setBackground(new Color(240, 255, 255));
		btnSignup.setBounds(381, 461, 154, 39);
		contentPane.add(btnSignup);
	}
//	private class SwingAction extends AbstractAction {
//		public SwingAction() {
//			putValue(NAME, "SwingAction");
//			putValue(SHORT_DESCRIPTION, "Some short description");
//		}
		public void actionPerformed(ActionEvent e) {
		}
	}

