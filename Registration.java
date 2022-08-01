package LibraryMangement;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.sql.*;


public class Registration extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField name_TextField;
	private JTextField Addres_TextField;
	private JTextField PhoneNumber_TextField;
	private JTextField CardNumber_textField;
	private JLabel lblLastName;
	private JPasswordField Password_TextField;
	private JLabel lblRegistration;
	private JButton btnBack;
	private final ButtonGroup buttonGroup = new ButtonGroup();
//	private final Action action = new SwingAction();
	private JButton btnCreate;
	private JTextField ageTextField;
	private JLabel lblNewLabel_Phone_1;
	private JLabel lblLastName_1;
	private JTextField Last_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1171, 712);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(58, 131, 96, 15);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 10));
		contentPane.add(lblNewLabel);
		
		name_TextField = new JTextField();
		name_TextField.setBounds(242, 129, 191, 19);
		name_TextField.setColumns(10);
		contentPane.add(name_TextField);
		
		JLabel lblNewLabel_address = new JLabel("Address");
		lblNewLabel_address.setBounds(58, 234, 96, 15);
		lblNewLabel_address.setFont(new Font("Arial Black", Font.BOLD, 10));
		contentPane.add(lblNewLabel_address);
		
		Addres_TextField = new JTextField();
		Addres_TextField.setBounds(242, 232, 191, 19);
		Addres_TextField.setColumns(10);
		contentPane.add(Addres_TextField);
		
		JLabel lblNewLabel_Phone = new JLabel("Phone Number");
		lblNewLabel_Phone.setBounds(58, 273, 96, 15);
		lblNewLabel_Phone.setFont(new Font("Arial Black", Font.BOLD, 10));
		contentPane.add(lblNewLabel_Phone);
		
		PhoneNumber_TextField = new JTextField();
		PhoneNumber_TextField.setBounds(242, 271, 191, 19);
		PhoneNumber_TextField.setColumns(10);
		contentPane.add(PhoneNumber_TextField);
		
		JLabel lblNewLabel_3 = new JLabel("Library Card Number");
		lblNewLabel_3.setBounds(58, 353, 120, 15);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 10));
		contentPane.add(lblNewLabel_3);
		
		CardNumber_textField = new JTextField();
		CardNumber_textField.setBounds(242, 351, 191, 19);
		CardNumber_textField.setColumns(10);
		contentPane.add(CardNumber_textField);
		
		lblLastName = new JLabel("Password");
		lblLastName.setBounds(58, 189, 96, 15);
		lblLastName.setFont(new Font("Arial Black", Font.BOLD, 10));
		contentPane.add(lblLastName);
		
		Password_TextField = new JPasswordField();
		Password_TextField.setBounds(242, 187, 191, 19);
		Password_TextField.setColumns(10);
		contentPane.add(Password_TextField);
		
		lblRegistration = new JLabel("Registration");
		lblRegistration.setBounds(5, 15, 1147, 54);
		lblRegistration.setFont(new Font("Arial Black", Font.BOLD, 38));
		contentPane.add(lblRegistration);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(309, 410, 124, 44);
		buttonGroup.add(btnBack);
		btnBack.setFont(new Font("Arial", Font.BOLD, 14));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Login.main(new String[]{});
					//Login.dispose();
					
			}
		});
		contentPane.add(btnBack);
		
		btnCreate = new JButton("Create");
		btnCreate.setBounds(130, 409, 115, 45);
		btnCreate.addActionListener(this);
		btnCreate.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(btnCreate);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(242, 310, 191, 19);
		ageTextField.setColumns(10);
		contentPane.add(ageTextField);
		
		lblNewLabel_Phone_1 = new JLabel("Age");
		lblNewLabel_Phone_1.setBounds(69, 314, 85, 15);
		lblNewLabel_Phone_1.setFont(new Font("Arial Black", Font.BOLD, 10));
		contentPane.add(lblNewLabel_Phone_1);
		
		lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setFont(new Font("Arial Black", Font.BOLD, 10));
		lblLastName_1.setBounds(58, 164, 109, 15);
		contentPane.add(lblLastName_1);
		
		Last_textField = new JTextField();
		Last_textField.setColumns(10);
		Last_textField.setBounds(242, 158, 191, 19);
		contentPane.add(Last_textField);
		contentPane.setBackground(Color.WHITE);
		 //panel.setBackground(Color.WHITE);
	}

public void actionPerformed(ActionEvent ae){
    try{
        
        if(ae.getSource()==btnCreate){
        	System.out.println("Clicked on create button");
            try{
            	Connection connectione = DriverManager.getConnection("jdbc:mysql:///LBTESTSAMPLE","root","test123");
            String sql = "insert into Registration(FirstName, LastName, Password, Address, Age, PhoneNumber, LibraryCardNumber) values(?, ?, ?, ?, ?, ?, ?)";
	PreparedStatement st = connectione.prepareStatement(sql);
	System.out.println("executing");
	st.setString(1, name_TextField.getText());
	st.setString(2, Last_textField.getText());
	st.setString(3, Password_TextField.getText());
	st.setString(4, Addres_TextField.getText());
	String age1=ageTextField.getText();
    int age=Integer.parseInt(age1);
	st.setInt(5, age);
	String Phone1=PhoneNumber_TextField.getText();
    int phone=Integer.parseInt(Phone1);
	st.setInt(6, phone);
	st.setString(7,  CardNumber_textField.getText());
	int i = st.executeUpdate();
	if (i > 0){
                JOptionPane.showMessageDialog(null, "Successfully Added");
                this.setVisible(false);
                //new Home().setVisible(true);
            }
	else
                JOptionPane.showMessageDialog(null, "error");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
       
    }catch(Exception e){
        
    }
}
}

//	private class SwingAction extends AbstractAction {
//		public SwingAction() {
//			putValue(NAME, "SwingAction");
//			putValue(SHORT_DESCRIPTION, "Some short description");
//		}
//		public void actionPerformed(ActionEvent e) {
//		}
//	}
//}
