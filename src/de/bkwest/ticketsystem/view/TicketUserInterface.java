package de.bkwest.ticketsystem.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class TicketUserInterface extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitle;
	private JLabel lblDiscription;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketUserInterface frame = new TicketUserInterface();
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
	public TicketUserInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldTitle.setBounds(10, 36, 512, 32);
		contentPane.add(textFieldTitle);
		textFieldTitle.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitle.setBounds(10, 11, 81, 20);
		contentPane.add(lblTitle);
		
		JScrollPane jspDiscriptionFild = new JScrollPane();
		jspDiscriptionFild.setBounds(10, 120, 988, 342);
		contentPane.add(jspDiscriptionFild);
		
		lblDiscription = new JLabel("Discription:");
		lblDiscription.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiscription.setBounds(10, 89, 81, 20);
		contentPane.add(lblDiscription);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(844, 28, 154, 51);
		contentPane.add(btnSave);
		
	}
}
