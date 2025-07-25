package com.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton customer = new JButton("客人");
		customer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CustLoginUI costLoginUI=new CustLoginUI();
				costLoginUI.setVisible(true);
				dispose();
			}
		});
		customer.setFont(new Font("宋体", Font.PLAIN, 18));
		customer.setBounds(44, 83, 141, 95);
		contentPane.add(customer);
		
		JButton company = new JButton("員工");
		company.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffSystemLoginUI staffSystemLoginUI=new StaffSystemLoginUI();
				staffSystemLoginUI.setVisible(true);
				dispose();
			}
		});
		company.setFont(new Font("宋体", Font.PLAIN, 18));
		company.setBounds(222, 83, 141, 95);
		contentPane.add(company);

	}
}
