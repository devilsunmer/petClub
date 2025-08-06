package controller.text;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.CustMember;
import service.impl.BossServiceImpl;
import service.impl.CustMemberServiceImpl;
import util.Tool;

import javax.swing.JLabel;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private JLabel mes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setBounds(61, 49, 96, 21);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(61, 96, 96, 21);
		contentPane.add(password);
		password.setColumns(10);

		mes = new JLabel("");
		mes.setBounds(36, 10, 96, 29);
		contentPane.add(mes);
		
		JButton send = new JButton("send");
		send.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username=username.getText();
				String Password=password.getText();
				CustMemberServiceImpl custMemberServiceImpl=new CustMemberServiceImpl();
				CustMember memberLogin=custMemberServiceImpl.login(Username, Password);
				if(memberLogin!=null)
				{
					Tool.saveFiled(memberLogin, "member.txt");
					MemberShop memberShop=new MemberShop();
					memberShop.setVisible(true);
					dispose();
				}else {
					mes.setText("wrong");
				}
				
			}
		});
		send.setBounds(10, 160, 85, 23);
		contentPane.add(send);
		
		JButton bossSend = new JButton("staffSend");
		bossSend.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username=username.getText();
				String Password=password.getText();
				BossServiceImpl bossServiceImpl=new BossServiceImpl();
				bossServiceImpl.login(Username, Password);
				if(bossServiceImpl.login(Username, Password)!=null)
				{
					BossUI bossUI=new BossUI();
					bossUI.setVisible(true);
					dispose();
				}else {
					mes.setText("wrong");
				}
			}
		});
		bossSend.setBounds(127, 160, 85, 23);
		contentPane.add(bossSend);
		
		JButton createMember = new JButton("memberCreate");
		createMember.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MemberCreate memberCreate=new MemberCreate();
				memberCreate.setVisible(true);
				dispose();
			}
		});
		createMember.setBounds(72, 10, 85, 23);
		contentPane.add(createMember);
		

	}
}
