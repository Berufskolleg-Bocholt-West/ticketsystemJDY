package de.bkwest.ticketsystem.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import de.bkwest.ticketsystem.controller.*;
import de.bkwest.ticketsystem.model.User;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LoginUserInterface extends JFrame {

	private JPanel contentPane;
	private JTextField txtFUsername;
	private JPasswordField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		DBCon.fetchUser();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUserInterface frame = new LoginUserInterface();
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
	public LoginUserInterface() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(35, 74, 66, 17);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(35, 102, 66, 22);
		contentPane.add(lblPassword);

		txtFUsername = new JTextField();
		txtFUsername.setBounds(120, 74, 120, 20);
		contentPane.add(txtFUsername);
		txtFUsername.setColumns(10);
		
		JLabel testLabel = new JLabel(" ");
		testLabel.setBounds(12, 166, 89, 22);
		contentPane.add(testLabel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				testLabel.setText(LoginFunction.compare(getGUIUsername(),getGUIPassword()));
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBounds(120, 146, 120, 23);
		contentPane.add(btnLogin);

		btnLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
			}
		});

		passField = new JPasswordField();
		passField.setBounds(120, 105, 120, 20);
		contentPane.add(passField);
		
		JButton btnToRegister = new JButton("To Register");
		btnToRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegisterUserInterface registerUserInterface =new RegisterUserInterface();
				registerUserInterface.setVisible(true);
				LoginUserInterface.this.setVisible(false);
				
			}
		});
		btnToRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnToRegister.setBounds(120, 180, 120, 23);
		contentPane.add(btnToRegister);
		
	}

	public String getGUIPassword() {
		String password = new String(passField.getPassword());
		return password;
	}

	public String getGUIUsername() {
		String username = txtFUsername.getText();
		return username;
	}
}
