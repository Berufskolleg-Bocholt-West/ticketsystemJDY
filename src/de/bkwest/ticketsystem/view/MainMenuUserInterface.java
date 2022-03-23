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
		contentPane.setLayout(null);
		
		JButton btnCreateTicket = new JButton("CreateTicket");
		btnCreateTicket.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TicketUserInterface ticketUserInterface= new TicketUserInterface();
				ticketUserInterface.setVisible(true);
				MainMenuUserInterface.this.setVisible(false);
			}
		});
		btnCreateTicket.setBounds(10, 54, 106, 32);
		contentPane.add(btnCreateTicket);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 285, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(10, 97, 106, 32);
		contentPane.add(btnLogout);
		
		JButton btnShowTickets = new JButton("Show Tickets");
		btnShowTickets.setBounds(10, 140, 106, 32);
		contentPane.add(btnShowTickets);
	}

}
