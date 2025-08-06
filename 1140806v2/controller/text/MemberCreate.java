package controller.text;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CustMember;
import service.impl.CustMemberServiceImpl;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MemberCreate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberCreate frame = new MemberCreate();
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
	public MemberCreate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name = new JTextField();
		name.setBounds(81, 39, 96, 21);
		contentPane.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setBounds(81, 83, 96, 21);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(81, 125, 96, 21);
		contentPane.add(password);
		password.setColumns(10);
		
		phone = new JTextField();
		phone.setBounds(81, 173, 96, 21);
		contentPane.add(phone);
		phone.setColumns(10);
		
		JButton create = new JButton("create");
		create.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name=name.getText();
				String Username=username.getText();
				String Password=password.getText();
				String Phone=phone.getText();
				CustMember custMember=new CustMember(Name,Username,Password,Phone);
				CustMemberServiceImpl custMemberServiceImpl=new CustMemberServiceImpl();
				if(custMember!=null)
				{
					custMemberServiceImpl.addCustMember(custMember);
					JOptionPane.showMessageDialog(null,"新增成功", "提示訊息",JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		});
		create.setBounds(231, 124, 85, 23);
		contentPane.add(create);
		
		JButton back = new JButton("back");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login=new Login();
				login.setVisible(true);
				dispose();
			}
		});
		back.setBounds(231, 172, 85, 23);
		contentPane.add(back);

	}
}
