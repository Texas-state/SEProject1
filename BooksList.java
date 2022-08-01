package LibraryMangement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BooksList extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BooksList frame = new BooksList();
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
	public BooksList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1078, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_booksInfo = new JLabel("Books Info");
		lblNewLabel_booksInfo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_booksInfo.setBounds(304, 10, 299, 44);
		contentPane.add(lblNewLabel_booksInfo);
		
		table = new JTable();
		table.setBackground(Color.PINK);
		table.setBounds(963, 623, -385, -494);
		contentPane.add(table);
		
		JButton btnNewButton_addBook_bookinfo = new JButton("Add Books ");
		btnNewButton_addBook_bookinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BooksForm.main(new String[]{});
			}
		});
		btnNewButton_addBook_bookinfo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_addBook_bookinfo.setBounds(87, 142, 163, 44);
		contentPane.add(btnNewButton_addBook_bookinfo);
		
		JButton btnViewBooks_btninfo = new JButton("View Books");
		btnViewBooks_btninfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewBooks_btninfo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnViewBooks_btninfo.setBounds(87, 250, 163, 44);
		contentPane.add(btnViewBooks_btninfo);
		
		JButton btnViewBooks_btninfo_1 = new JButton("Delete Books");
		btnViewBooks_btninfo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewBooks_btninfo_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnViewBooks_btninfo_1.setBounds(87, 359, 163, 44);
		contentPane.add(btnViewBooks_btninfo_1);
	}

}
