package de.bkwest.ticketsystem.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import de.bkwest.ticketsystem.controller.DBCon;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class RegisterUserInterface extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JPasswordField passwordField;
	private JPasswordField confirmPasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterUserInterface frame = new RegisterUserInterface();
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
	public RegisterUserInterface() {
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textUser = new JTextField();
		textUser.setBounds(120, 43, 120, 20);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		JLabel lblNewUsername = new JLabel("Username:");
		lblNewUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewUsername.setBounds(35, 43, 66, 17);
		contentPane.add(lblNewUsername);
		
		JLabel lblNewPassword = new JLabel("Password:");
		lblNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewPassword.setBounds(35, 71, 66, 22);
		contentPane.add(lblNewPassword);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DBCon.insert(getGUIUsername(),getGUIPassword(),getGUIConfirmedPassword());
				LoginUserInterface loginUserInterface = new LoginUserInterface();
				loginUserInterface.setVisible(true);
				RegisterUserInterface.this.setVisible(false);
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegister.setBounds(120, 146, 120, 23);
		contentPane.add(btnRegister);
		
		JButton btnToLogin = new JButton("to login");
		btnToLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUserInterface loginUserInterface = new LoginUserInterface();
				loginUserInterface.setVisible(true);
				RegisterUserInterface.this.setVisible(false);
			}
		});
		btnToLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnToLogin.setBounds(120, 180, 120, 23);
		contentPane.add(btnToLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 74, 120, 20);
		contentPane.add(passwordField);
		
		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setBounds(120, 115, 120, 20);
		contentPane.add(confirmPasswordField);
		
		JLabel lblConfirmPassword = new JLabel("Confirm ");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmPassword.setBounds(35, 102, 66, 22);
		contentPane.add(lblConfirmPassword);
		
		JLabel lblNewPassword_1 = new JLabel("Password:");
		lblNewPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewPassword_1.setBounds(35, 120, 66, 22);
		contentPane.add(lblNewPassword_1);
	}
	public String getGUIPassword() {
		String password = new String(passwordField.getPassword());
		return password;
	}

	public String getGUIUsername() {
		String username = textUser.getText();
		return username;
	}
	public String getGUIConfirmedPassword() {
		String comfirmedPassword = new String(confirmPasswordField.getPassword());
		return comfirmedPassword;
	}
}
