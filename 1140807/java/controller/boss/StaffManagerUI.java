package controller.boss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class StaffManagerUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffManagerUI frame = new StaffManagerUI();
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
	public StaffManagerUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(134, 69, 331, 247);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel bossMessage = new JLabel("");
		bossMessage.setHorizontalAlignment(SwingConstants.CENTER);
		bossMessage.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		bossMessage.setBounds(307, 21, 137, 38);
		contentPane.add(bossMessage);
		
		JButton memberManager = new JButton("新增員工");
		memberManager.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		memberManager.setBounds(13, 101, 96, 38);
		contentPane.add(memberManager);
		
		JButton staffManager = new JButton("刪除員工");
		staffManager.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		staffManager.setBounds(13, 238, 96, 38);
		contentPane.add(staffManager);
		
		JLabel bossMessage_1 = new JLabel("新增員工：");
		bossMessage_1.setHorizontalAlignment(SwingConstants.CENTER);
		bossMessage_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		bossMessage_1.setBounds(13, 21, 96, 38);
		contentPane.add(bossMessage_1);
		
		textField = new JTextField();
		textField.setBounds(13, 53, 96, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel bossMessage_1_1 = new JLabel("刪除員工ID：");
		bossMessage_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		bossMessage_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 14));
		bossMessage_1_1.setBounds(13, 165, 96, 38);
		contentPane.add(bossMessage_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(13, 197, 96, 38);
		contentPane.add(textField_1);

	}

}
