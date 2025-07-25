package com.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StaffSystemLoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSystemLoginUI frame = new StaffSystemLoginUI();
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
	public StaffSystemLoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("員工登入");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 14, 62, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 14));
		textField.setBounds(82, 11, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("員工密碼");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 62, 62, 15);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("宋体", Font.PLAIN, 14));
		passwordField.setBounds(82, 54, 96, 23);
		contentPane.add(passwordField);
		
		/**staff員工登入*/
		JButton staffLoginButton = new JButton("登入");
		staffLoginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffSystemUI staffSystemUI=new StaffSystemUI();
				staffSystemUI.setVisible(true);
				dispose();
			}
		});
		staffLoginButton.setFont(new Font("宋体", Font.PLAIN, 14));
		staffLoginButton.setBounds(212, 10, 87, 38);
		contentPane.add(staffLoginButton);
		
		/**老闆登入*/
		JButton bossLoginButton = new JButton("老闆登入");
		bossLoginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BossUI bossUI=new BossUI();
				bossUI.setVisible(true);
				dispose();
			}
		});
		bossLoginButton.setFont(new Font("宋体", Font.PLAIN, 14));
		bossLoginButton.setBounds(319, 39, 105, 38);
		contentPane.add(bossLoginButton);
		
		
		JButton leaveButton = new JButton("離開");
		leaveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		leaveButton.setFont(new Font("宋体", Font.PLAIN, 14));
		leaveButton.setBounds(212, 58, 87, 43);
		contentPane.add(leaveButton);

	}
}
