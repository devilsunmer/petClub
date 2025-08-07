package controller.boss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReadMemberUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField memberByIdField;
	private JTextField freeMemberNameFiled;
	private JTextField memberNameField;
	private JTextField memberUserNameField;
	private JTextField mamberPasswordField;
	private JTextField memberPhoneField;
	private JTextField memberIdField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					ReadMemberUI frame = new ReadMemberUI();
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
	public ReadMemberUI() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 73, 521, 254);
		contentPane.add(tabbedPane);
		
		Panel memberCreat = new Panel();
		memberCreat.setBackground(new Color(255, 255, 255));
		memberCreat.setBounds(10, 35, 414, 216);
		memberCreat.setLayout(null);
		
		Panel memberRead = new Panel();
		memberRead.setBackground(new Color(255, 255, 255));
		memberRead.setBounds(0, 0, 409, 187);
		memberRead.setLayout(null);
		
		Panel memberUpdate = new Panel();
		memberUpdate.setBackground(new Color(255, 255, 255));
		memberUpdate.setLayout(null);
		memberUpdate.setBounds(0, 0, 409, 187);
		
		Panel memberDelete = new Panel();
		memberDelete.setBackground(new Color(255, 255, 255));
		memberDelete.setLayout(null);
		memberDelete.setBounds(0, 0, 409, 187);

		Panel freeMember = new Panel();
		freeMember.setLayout(null);
		freeMember.setBackground(Color.WHITE);
		freeMember.setBounds(-83, -51, 409, 225);
		
		JLabel bossMessage = new JLabel("");
		bossMessage.setHorizontalAlignment(SwingConstants.CENTER);
		bossMessage.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		bossMessage.setBounds(64, 25, 137, 38);
		contentPane.add(bossMessage);
		
		tabbedPane.addTab("會員查詢管理",memberRead);
		
		JButton allMemberButton = new JButton("查詢全部");
		allMemberButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		allMemberButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		allMemberButton.setBounds(47, 10, 98, 38);
		memberRead.add(allMemberButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 57, 496, 158);
		memberRead.add(scrollPane);
		
		JTextArea readOut = new JTextArea();
		readOut.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		scrollPane.setViewportView(readOut);
		
		JButton memberByNameButton = new JButton("ID查詢");
		memberByNameButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		memberByNameButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		memberByNameButton.setBounds(384, 10, 98, 38);
		memberRead.add(memberByNameButton);
		
		memberByIdField = new JTextField();
		memberByIdField.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		memberByIdField.setBounds(278, 19, 96, 21);
		memberRead.add(memberByIdField);
		memberByIdField.setColumns(10);
		tabbedPane.addTab("潛在會員查詢",freeMember);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 46, 476, 169);
		freeMember.add(scrollPane_1);
		
		JTextArea freeMemberOut = new JTextArea();
		scrollPane_1.setViewportView(freeMemberOut);
		
		freeMemberNameFiled = new JTextField();
		freeMemberNameFiled.setBounds(195, 6, 110, 30);
		freeMember.add(freeMemberNameFiled);
		freeMemberNameFiled.setColumns(10);
		
		JButton freeMemberByNameButton = new JButton("名字查詢");
		freeMemberByNameButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		freeMemberByNameButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		freeMemberByNameButton.setBounds(330, 7, 101, 26);
		freeMember.add(freeMemberByNameButton);
		
		JButton allMemberButton_1 = new JButton("查詢全部");
		allMemberButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		allMemberButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		allMemberButton_1.setBounds(25, 6, 98, 30);
		freeMember.add(allMemberButton_1);
		tabbedPane.addTab("會員修改管理",memberUpdate);
		
		memberNameField = new JTextField();
		memberNameField.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		memberNameField.setBounds(124, 10, 125, 36);
		memberUpdate.add(memberNameField);
		memberNameField.setColumns(10);
		
		JLabel label = new JLabel("會員姓名：");
		label.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		label.setBounds(10, 10, 93, 36);
		memberUpdate.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("會員帳號：");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 56, 104, 36);
		memberUpdate.add(lblNewLabel_1);
		
		memberUserNameField = new JTextField();
		memberUserNameField.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		memberUserNameField.setColumns(10);
		memberUserNameField.setBounds(124, 56, 125, 36);
		memberUpdate.add(memberUserNameField);
		
		JLabel lblNewLabel_2 = new JLabel("會員密碼：");
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 102, 93, 36);
		memberUpdate.add(lblNewLabel_2);
		
		mamberPasswordField = new JTextField();
		mamberPasswordField.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		mamberPasswordField.setColumns(10);
		mamberPasswordField.setBounds(124, 102, 125, 36);
		memberUpdate.add(mamberPasswordField);
		
		memberPhoneField = new JTextField();
		memberPhoneField.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		memberPhoneField.setColumns(10);
		memberPhoneField.setBounds(124, 148, 125, 36);
		memberUpdate.add(memberPhoneField);
		
		JLabel lblNewLabel_2_1 = new JLabel("會員電話：");
		lblNewLabel_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(10, 148, 93, 36);
		memberUpdate.add(lblNewLabel_2_1);
		
		memberIdField = new JTextField();
		memberIdField.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		memberIdField.setBounds(429, 46, 46, 46);
		memberUpdate.add(memberIdField);
		memberIdField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("會員修改的ＩＤ：");
		lblNewLabel_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(306, 56, 125, 36);
		memberUpdate.add(lblNewLabel_1_1);
		
		JButton enterMemberUpdateButton = new JButton("確認修改");
		enterMemberUpdateButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		enterMemberUpdateButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		enterMemberUpdateButton.setBounds(317, 112, 98, 38);
		memberUpdate.add(enterMemberUpdateButton);
		
		JButton clear = new JButton("清除");
		clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		clear.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		clear.setBounds(317, 160, 98, 38);
		memberUpdate.add(clear);
		tabbedPane.addTab("會員刪除管理",memberDelete);
		
		JScrollPane member = new JScrollPane();
		member.setBounds(158, 10, 348, 205);
		memberDelete.add(member);
		
		JTextArea textArea = new JTextArea();
		member.setViewportView(textArea);
		
		JButton leaveButton_1 = new JButton("離開");
		leaveButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		leaveButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		leaveButton_1.setBounds(32, 131, 98, 38);
		memberDelete.add(leaveButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBounds(50, 63, 46, 46);
		memberDelete.add(textField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("會員刪除的ＩＤ：");
		lblNewLabel_1_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 17, 125, 36);
		memberDelete.add(lblNewLabel_1_1_1);
		
		JButton backButton = new JButton("上一頁");
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		backButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		backButton.setBounds(254, 25, 98, 38);
		contentPane.add(backButton);
		
		JButton leaveButton = new JButton("離開");
		leaveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		leaveButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		leaveButton.setBounds(391, 25, 98, 38);
		contentPane.add(leaveButton);

		
		

	}
}
