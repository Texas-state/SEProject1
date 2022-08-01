package LibraryMangement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Books extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Books frame = new Books();
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
	public Books() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 696);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Library Books");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(36, 10, 318, 57);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(833, 624, -369, -511);
		contentPane.add(table);
		
		JButton btnNewButton_Books = new JButton("Books");
		btnNewButton_Books.setFont(new Font("Times New Roman", Font.BOLD, 34));
		btnNewButton_Books.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BooksList.main(new String[]{});
			}
		});
		btnNewButton_Books.setBounds(157, 121, 451, 40);
		contentPane.add(btnNewButton_Books);
		
		JButton btnReferenceBooks = new JButton("Reference Books & Magazines");
		btnReferenceBooks.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnReferenceBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Magazines.main(new String[]{});
			}
		});
		btnReferenceBooks.setBounds(157, 248, 451, 40);
		contentPane.add(btnReferenceBooks);
		
		JButton btnNewButton_1_1 = new JButton("Audio/Video");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(157, 367, 451, 40);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.main(new String[]{});
			}
		});
		btnNewButton.setBounds(736, 158, 122, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.main(new String[]{});
			}
		});
		btnNewButton_1.setBounds(736, 311, 122, 40);
		contentPane.add(btnNewButton_1);
	}
}
