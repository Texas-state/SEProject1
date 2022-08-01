package LibraryMangement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.awt.event.ActionEvent;

public class Magazines extends JFrame  implements ActionListener{

	
	private JPanel contentPane;
	private JTextField textField_BooksName;
	private JTextField textField_publisher;
	private JTextField textField_quantity;
	private JTextField textField_price;
	private JButton btnAddBooks;
	private JButton btnNewButton_save;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Magazines frame = new Magazines();
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
	public Magazines() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 976, 644);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBounds(95, 154, 92, 13);
		contentPane.add(lblNewLabel);
		
		textField_BooksName = new JTextField();
		textField_BooksName.setBounds(249, 151, 275, 37);
		contentPane.add(textField_BooksName);
		textField_BooksName.setColumns(10);
		
		textField_publisher = new JTextField();
		textField_publisher.setColumns(10);
		textField_publisher.setBounds(249, 211, 275, 37);
		contentPane.add(textField_publisher);
		
		textField_quantity = new JTextField();
		textField_quantity.setColumns(10);
		textField_quantity.setBounds(249, 264, 275, 37);
		contentPane.add(textField_quantity);
		
		textField_price = new JTextField();
		textField_price.setColumns(10);
		textField_price.setBounds(249, 311, 275, 33);
		contentPane.add(textField_price);
		
		JLabel lblNewLabel_price = new JLabel("Price");
		lblNewLabel_price.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_price.setBounds(95, 328, 92, 13);
		contentPane.add(lblNewLabel_price);
		
		JLabel lblNewLabel_2 = new JLabel("ADD Magazines");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_2.setBounds(52, 29, 577, 43);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Publisher:");
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(95, 212, 92, 13);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Quantity:");
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(95, 288, 92, 13);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Best Seller:");
		lblNewLabel_3_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_3_1_1_1.setBounds(95, 356, 92, 13);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "YES", "NO" }));
		comboBox.setEditable(true);
		comboBox.setBounds(249, 354, 275, 27);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_Booktype = new JLabel("Type of Book");
		lblNewLabel_Booktype.setFont(new Font("Arial Black", Font.BOLD, 10));
		lblNewLabel_Booktype.setBounds(95, 395, 92, 19);
		contentPane.add(lblNewLabel_Booktype);
		
		JRadioButton rdbtnNewRadioButton_books = new JRadioButton("Books");
		rdbtnNewRadioButton_books.setBounds(253, 397, 105, 21);
		contentPane.add(rdbtnNewRadioButton_books);
		
		JRadioButton rdbtnNewRadioButton_Journals = new JRadioButton("Journals");
		rdbtnNewRadioButton_Journals.setBounds(360, 397, 105, 21);
		contentPane.add(rdbtnNewRadioButton_Journals);
		
		JButton btnNewButton_save = new JButton("Reset");
		btnNewButton_save.setFont(new Font("Times New Roman", Font.BOLD, 20));
		//btnNewButton_save.addActionListener(new ActionListener() {
		btnNewButton_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_BooksName.setText("");
				textField_price.setText("");
				textField_publisher.setText("");
				textField_quantity.setText("");
				
			}
		});
		btnNewButton_save.setBounds(95, 441, 131, 37);
		contentPane.add(btnNewButton_save);
		
		JButton btnAddBooks = new JButton("Add Magazine");
		btnAddBooks.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAddBooks.addActionListener(this);
		btnAddBooks.setBounds(266, 441, 159, 37);
		contentPane.add(btnAddBooks);
		
		JButton btnNewButton_Back_books = new JButton("Back");
		btnNewButton_Back_books.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_Back_books.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Books.main(new String[]{});
			}
		});
		btnNewButton_Back_books.setBounds(466, 441, 131, 37);
		contentPane.add(btnNewButton_Back_books);
		
		
	}
	

public void actionPerformed(ActionEvent ae){
    try{
    	System.out.println("clicked on button");
    	
       	Connection connectione = DriverManager.getConnection("jdbc:mysql:///LBTESTSAMPLE","root","test123");
           PreparedStatement st2=connectione.prepareStatement("select * from BOOKFORM"); 
           
            st2.executeQuery();
            System.out.println("query");
            
            
	PreparedStatement st = connectione.prepareStatement("insert into Magazines(name,Category,Quantity,price) VALUES(?,?,?,?)");
	st.setString(1, textField_BooksName.getText());
	st.setString(2, textField_publisher.getText());
	String squantity=textField_quantity.getText();
    int quantity=Integer.parseInt(squantity);
	st.setInt(3, quantity);
	String price1=textField_price.getText();
    int price=Integer.parseInt(price1);
    st.setInt(4, price);
	int i=st.executeUpdate();  
	System.out.println(i+" records inserted"); 
	//int rs = st.executeUpdate();
	//System.out.println(i);
    if (i>0)
    {
    	JOptionPane.showMessageDialog(null, "Successfully Added");
        this.setVisible(false);
    	System.out.println("success");
    	
    }
    else
    	  JOptionPane.showMessageDialog(null, "error");
    	System.out.println("failed");
    st.close();   
    connectione.close();
    }catch(Exception e){
    	e.printStackTrace();
        
    }
}

}	

