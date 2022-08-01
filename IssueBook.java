package LibraryMangement;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.*;

import org.eclipse.swt.graphics.Color;

import com.toedter.calendar.JDateChooser;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class IssueBook extends JFrame implements ActionListener{

	private JPanel contentPane;
	// private JPanel contentPane;
	    JDateChooser dateChooser;
	    private JTextField t1,t2,t3,t4,t5,t6,t8,t9,t10,t11,t12,t13;
	    private JButton Search_book_btn,LB_Button,b3,b4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					IssueBook frame = new IssueBook();
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
	public IssueBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(300, 200, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		//contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		JLabel l1 = new JLabel("Book Name");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 10));
		//l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		//l1.setBackground(new Color(47, 79, 79));
		l1.setBounds(47, 63, 100, 23);
		contentPane.add(l1);

		JLabel l2 = new JLabel("Name");
		//l2.setBackground(new Color(47, 79, 79));
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		l2.setBounds(47, 97, 100, 23);
		contentPane.add(l2);

		JLabel l3 = new JLabel("Author");
		//l3.setForeground(new Color(47, 79, 79));
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		l3.setBounds(47, 131, 100, 23);
		contentPane.add(l3);

		JLabel l4 = new JLabel("Publisher");
		//l4.setForeground(new Color(47, 79, 79));
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setBounds(47, 165, 100, 23);
		contentPane.add(l4);

		JLabel l5 = new JLabel("Edition");
		//l5.setForeground(new Color(47, 79, 79));
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		l5.setBounds(47, 199, 100, 23);
		contentPane.add(l5);

		JLabel l6 = new JLabel("Price");
		//l6.setForeground(new Color(47, 79, 79));
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		l6.setBounds(47, 233, 100, 23);
		contentPane.add(l6);

		t1 = new JTextField();
		///t1.setForeground(new Color(47, 79, 79));
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t1.setBounds(126, 66, 86, 20);
		contentPane.add(t1);
		
		Search_book_btn = new JButton("Search");
		Search_book_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	//	b1.addActionListener(this);
		Search_book_btn.setBorder(new BevelBorder(BevelBorder.LOWERED, java.awt.Color.RED, null, null, null));
		Search_book_btn.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		Search_book_btn.setBounds(234, 59, 100, 30);
	        
		contentPane.add(Search_book_btn);

		t2 = new JTextField();
		t2.setEditable(false);
		//t2.setForeground(new Color(47, 79, 79));
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t2.setBounds(126, 100, 208, 20);
		contentPane.add(t2);
		t2.setColumns(10);

		t3 = new JTextField();
		t3.setEditable(false);
		//t3.setForeground(new Color(47, 79, 79));
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t3.setColumns(10);
		t3.setBounds(126, 131, 208, 20);
		contentPane.add(t3);

		t4 = new JTextField();
		t4.setEditable(false);
		//t4.setForeground(new Color(47, 79, 79));
		t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t4.setColumns(10);
		t4.setBounds(126, 168, 208, 20);
		contentPane.add(t4);

		t5 = new JTextField();
		t5.setEditable(false);
		//t5.setForeground(new Color(47, 79, 79));
		t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t5.setColumns(10);
		t5.setBounds(126, 202, 208, 20);
		contentPane.add(t5);

		t6 = new JTextField();
		t6.setEditable(false);
		//t6.setForeground(new Color(47, 79, 79));
		t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t6.setColumns(10);
		t6.setBounds(126, 236, 208, 20);
		contentPane.add(t6);

		JPanel panel = new JPanel();
		//panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book",
				//	TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
		panel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.setBounds(10, 38, 345, 288);
	      //  panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Issue Book");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 8, 325, 13);
		panel.add(lblNewLabel);

		JLabel l8 = new JLabel("Library_ID");
		//l8.setForeground(new Color(47, 79, 79));
		l8.setFont(new Font("Tahoma", Font.BOLD, 14));
		l8.setBounds(384, 63, 100, 23);
		contentPane.add(l8);

		JLabel l9 = new JLabel("Name");
		//l9.setForeground(new Color(47, 79, 79));
		l9.setFont(new Font("Tahoma", Font.BOLD, 14));
		l9.setBounds(384, 103, 100, 23);
		contentPane.add(l9);

		JLabel l10 = new JLabel("Last Name");
		//l10.setForeground(new Color(47, 79, 79));
		l10.setFont(new Font("Tahoma", Font.BOLD, 14));
		l10.setBounds(384, 147, 100, 23);
		contentPane.add(l10);

		JLabel l11 = new JLabel("Address");
		//l11.setForeground(new Color(47, 79, 79));
		l11.setFont(new Font("Tahoma", Font.BOLD, 14));
		l11.setBounds(384, 187, 100, 23);
		contentPane.add(l11);

		JLabel l12 = new JLabel("Age");
		//l12.setForeground(new Color(47, 79, 79));
		l12.setFont(new Font("Tahoma", Font.BOLD, 14));
		l12.setBounds(384, 233, 100, 23);
		contentPane.add(l12);

		JLabel l13 = new JLabel("PhoneNumber");
		//l13.setForeground(new Color(47, 79, 79));
		l13.setFont(new Font("Tahoma", Font.BOLD, 14));
		l13.setBounds(384, 284, 100, 23);
		contentPane.add(l13);

		t8 = new JTextField();
		//t8.setForeground(new Color(47, 79, 79));
		t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t8.setColumns(10);
		t8.setBounds(508, 66, 86, 20);
		contentPane.add(t8);

		LB_Button = new JButton("Search");
		LB_Button.addActionListener(this);
		LB_Button.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		LB_Button.setBorder(new CompoundBorder(UIManager.getBorder("Button.border"), null));
		LB_Button.setBounds(604, 59, 100, 30);
//	        b2.setBackground(Color.BLACK);
//	        b2.setForeground(Color.WHITE);
		contentPane.add(LB_Button);

		t9 = new JTextField();
		//t9.setForeground(new Color(47, 79, 79));
		t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t9.setEditable(false);
		t9.setColumns(10);
		t9.setBounds(508, 106, 208, 20);
		contentPane.add(t9);

		t10 = new JTextField();
		//t10.setForeground(new Color(47, 79, 79));
		t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t10.setEditable(false);
		t10.setColumns(10);
		t10.setBounds(508, 150, 208, 20);
		contentPane.add(t10);

		t11 = new JTextField();
		t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t11.setEditable(false);
		t11.setColumns(10);
		t11.setBounds(508, 190, 208, 20);
		contentPane.add(t11);

		t12 = new JTextField();
		t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t12.setEditable(false);
		t12.setColumns(10);
		t12.setBounds(508, 236, 208, 20);
		contentPane.add(t12);

		t13 = new JTextField();
		t13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t13.setEditable(false);
		t13.setColumns(10);
		t13.setBounds(508, 286, 208, 20);
		contentPane.add(t13);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//panel_1.setForeground(new Color(0, 100, 0));
		panel_1.setBounds(360, 38, 378, 372);
	       // panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
	        
		JLabel l15 = new JLabel(" Date of Issue :");
		//l15.setForeground(new Color(105, 105, 105));
		l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		l15.setBounds(20, 340, 118, 26);
		contentPane.add(l15);

		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		//dateChooser.setForeground(new Color(105, 105, 105));
		dateChooser.setBounds(137, 337, 200, 29);
		contentPane.add(dateChooser);

		b3 = new JButton("Issue");
		//b3.addActionListener(this);
		b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		//b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		b3.setBounds(47, 377, 118, 33);
		b3.setBackground(java.awt.Color.WHITE);
	        //b3.setForeground(Color.WHITE);
	        contentPane.add(b3);

		b4 = new JButton("Back");
		b4.addActionListener(this);
		b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b4.setBorder(new CompoundBorder(new CompoundBorder(), null));
		b4.setBounds(199, 377, 100, 33);
		//b4.setBackground(Color.BLACK);
	     //   b4.setForeground(Color.WHITE);
	        contentPane.add(b4);
	    }
	    
	    public void actionPerformed(ActionEvent ae){
	        try{
	        	Connection connectione = DriverManager.getConnection("jdbc:mysql:///LBTESTSAMPLE","root","test123");
	            if(ae.getSource() == Search_book_btn){
	            	System.out.println("Clicked on search book button");
	                String sql = "select * from bookform where Author = ?";
			PreparedStatement st = connectione.prepareStatement(sql);
			st.setString(1, t1.getText());
			ResultSet rs = st.executeQuery();
			
	                while (rs.next()) {
	                    t2.setText(rs.getString("name"));
	                    t3.setText(rs.getString("Author"));
	                    t4.setText(rs.getString("publisher"));
	                   // t5.setText(rs.getString("edition"));
	                    t6.setText(rs.getString("price"));
	                    //t7.setText(rs.getString("pages"));
			}
			st.close();
			rs.close();
			
	            }
	            if(ae.getSource() == LB_Button){
	                String sql = "select * from Registration where LibraryCardNumber = ?";
			PreparedStatement st = connectione.prepareStatement(sql);
			st.setString(1, t8.getText());
			ResultSet rs = st.executeQuery();
			
	                while (rs.next()) {
	                    t9.setText(rs.getString("FirstName"));
	                    t10.setText(rs.getString("LastName"));
	                    t11.setText(rs.getString("Address"));
	                    t12.setText(rs.getString("Age"));
	                    t13.setText(rs.getString("PhoneNUmber"));
	                    
			}
			st.close();
			rs.close();
			
	            }
	            if(ae.getSource() == b3){
	                    try{
	                String sql = "insert into issueBook(Book_Name, FirstName, ContactNumber, IssueDate, Age) values(?, ?, ?, ?, ?)";
			PreparedStatement st = connectione.prepareStatement(sql);
			//st.setString(1, t2.getText());
			st.setString(2, t9.getText());
			st.setString(3, t13.getText());
			
			st.setString(4, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());

			st.setString(5, t12.getText());
			int i = st.executeUpdate();
			if (i > 0)
	                    JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
			else
	                    JOptionPane.showMessageDialog(null, "error");
	                    }catch(Exception e){
	                        e.printStackTrace();
	                                }
	            }
	            if(ae.getSource() == b4){
	                this.setVisible(false);
			new BooksList().setVisible(true);
				
	            }
	            
	            connectione.close();
	        }catch(Exception e){
	            
	        }
	    }
//	public void actionPerformed(ActionEvent e) {
//	}
	}
