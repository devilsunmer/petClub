package controller.boss;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import util.ImageInPanel;
import java.awt.Color;

public class BossLoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					BossLoginUI frame = new BossLoginUI();
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
	public BossLoginUI() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel bossMessage = new JLabel("");
		bossMessage.setHorizontalAlignment(SwingConstants.CENTER);
		bossMessage.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		bossMessage.setBounds(287, 32, 137, 38);
		contentPane.add(bossMessage);

		JLabel bossMessage_1 = new JLabel("可查看");
		bossMessage_1.setHorizontalAlignment(SwingConstants.CENTER);
		bossMessage_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		bossMessage_1.setBounds(21, 80, 96, 38);
		contentPane.add(bossMessage_1);

		JLabel memberCount = new JLabel("");
		memberCount.setForeground(new Color(0, 128, 64));
		memberCount.setHorizontalAlignment(SwingConstants.CENTER);
		memberCount.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		memberCount.setBounds(195, 111, 152, 38);
		contentPane.add(memberCount);

		JLabel freeMemberCount = new JLabel("");
		freeMemberCount.setForeground(new Color(255, 128, 0));
		freeMemberCount.setHorizontalAlignment(SwingConstants.CENTER);
		freeMemberCount.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		freeMemberCount.setBounds(195, 182, 152, 38);
		contentPane.add(freeMemberCount);

		JLabel staffCount = new JLabel("");
		staffCount.setForeground(new Color(0, 128, 64));
		staffCount.setHorizontalAlignment(SwingConstants.CENTER);
		staffCount.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		staffCount.setBounds(195, 243, 152, 38);
		contentPane.add(staffCount);

		JButton memberManager = new JButton("會員管理");
		memberManager.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReadMemberUI frame = new ReadMemberUI();
				frame.setVisible(true);
				dispose();
			}
		});
		memberManager.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		memberManager.setBounds(10, 124, 123, 38);
		contentPane.add(memberManager);

		JButton staffManager = new JButton("寵物員工管理");
		staffManager.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StaffManagerUI frame = new StaffManagerUI();
				frame.setVisible(true);
				dispose();
			}
		});
		staffManager.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		staffManager.setBounds(10, 172, 123, 38);
		contentPane.add(staffManager);

		JButton excelButton = new JButton("報表匯出");
		excelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		excelButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		excelButton.setBounds(10, 221, 123, 38);
		contentPane.add(excelButton);

		JButton printButton = new JButton("報表列印");
		printButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				list name;
//				name.print();
			}
		});
		printButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		printButton.setBounds(10, 271, 123, 38);
		contentPane.add(printButton);

		JButton loginOutButton = new JButton("登出");
		loginOutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		loginOutButton.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		loginOutButton.setBounds(10, 22, 123, 38);
		contentPane.add(loginOutButton);

		JButton leave = new JButton("離開");
		leave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		leave.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		leave.setBounds(154, 22, 123, 38);
		contentPane.add(leave);




//		ImageInPanel imagePhoto = new ImageInPanel("/images/money.jpg");
//		imagePhoto.setBounds(0, 0, 434, 407);
//		contentPane.add(imagePhoto);
//		imagePhoto.setLayout(new BorderLayout(0, 0));
		}
}
