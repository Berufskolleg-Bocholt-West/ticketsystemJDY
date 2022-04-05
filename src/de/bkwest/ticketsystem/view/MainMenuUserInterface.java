package de.bkwest.ticketsystem.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpringLayout;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuUserInterface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuUserInterface frame = new MainMenuUserInterface();
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
	public MainMenuUserInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnCreateTicket = new JButton("CreateTicket");
		btnCreateTicket.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TicketUserInterface ticketUserInterface= new TicketUserInterface();
				ticketUserInterface.setVisible(true);
				MainMenuUserInterface.this.setVisible(false);
			}
		});
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCreateTicket, 54, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCreateTicket, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCreateTicket, 86, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCreateTicket, 116, SpringLayout.WEST, contentPane);
		contentPane.setLayout(sl_contentPane);
		contentPane.add(btnCreateTicket);
		
		JLabel lblNewLabel = new JLabel("Menu");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 11, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, 43, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 70, SpringLayout.WEST, contentPane);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//MainMenuUserInterface.this.setVisible(false);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLogout, 308, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLogout, -208, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLogout, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnLogout);
		
		JButton btnShowTickets = new JButton("Show Tickets");
		btnShowTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//MainMenuUserInterface.this.setVisible(false);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnShowTickets, 15, SpringLayout.SOUTH, btnCreateTicket);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnShowTickets, 0, SpringLayout.WEST, btnCreateTicket);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnShowTickets, 133, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnShowTickets, 116, SpringLayout.WEST, contentPane);
		contentPane.add(btnShowTickets);
		
		JButton btnLogin = new JButton("Login");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLogin, 126, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLogin, -11, SpringLayout.WEST, btnLogout);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLogout, 0, SpringLayout.NORTH, btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginUserInterface loginUserInterface = new LoginUserInterface();
				loginUserInterface.setVisible(true);
				MainMenuUserInterface.this.setVisible(false);
			}
			
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLogin, 2, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLogin, -9, SpringLayout.NORTH, btnCreateTicket);
		contentPane.add(btnLogin);
		JButton btnRegister = new JButton("Register");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRegister, 308, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRegister, -10, SpringLayout.EAST, contentPane);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterUserInterface registerUserInterface = new RegisterUserInterface();
				registerUserInterface.setVisible(true);
				MainMenuUserInterface.this.setVisible(false);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRegister, 164, SpringLayout.SOUTH, btnLogin);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRegister, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnRegister);
	}
}
