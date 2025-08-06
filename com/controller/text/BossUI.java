package controller.text;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.StaffMember;
import service.impl.CustFreeMemberServiceImpl;
import service.impl.CustMemberServiceImpl;
import service.impl.StaffMemberServiceImpl;

public class BossUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField staffNew;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BossUI frame = new BossUI();
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
	public BossUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 292, 136);
		contentPane.add(scrollPane);
		
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		id = new JTextField();
		id.setBounds(124, 172, 96, 21);
		contentPane.add(id);
		id.setColumns(10);
		
		staffNew = new JTextField();
		staffNew.setBounds(124, 231, 96, 21);
		contentPane.add(staffNew);
		staffNew.setColumns(10);

		JLabel memberCount = new JLabel("");
		memberCount.setBounds(261, 175, 69, 35);
		contentPane.add(memberCount);
		
		JLabel freeCount = new JLabel("");
		freeCount.setBounds(261, 227, 59, 29);
		contentPane.add(freeCount);

		JButton delete = new JButton("deleteOrder");
		delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		delete.setBounds(10, 171, 85, 23);
		contentPane.add(delete);
		
		JButton newStaff = new JButton("NewStaff");
		newStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new StaffMemberServiceImpl().addStaffMember(new StaffMember(staffNew.getText()));
			}
		});
		newStaff.setBounds(10, 230, 85, 23);
		contentPane.add(newStaff);
		
		JButton staffView = new JButton("staffview");
		staffView.setBounds(317, 30, 85, 23);
		contentPane.add(staffView);
		
		JButton memberView = new JButton("memberview");
		memberView.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				output.setText(new CustMemberServiceImpl().allMember());
			}
		});
		memberView.setBounds(317, 63, 85, 23);
		contentPane.add(memberView);
		
		JButton print = new JButton("報表");
		print.setBounds(317, 126, 85, 23);
		contentPane.add(print);
		
		JButton excel = new JButton("excel");
		excel.setBounds(317, 159, 85, 23);
		contentPane.add(excel);
		
		JButton freeView = new JButton("freeCust");
		freeView.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				output.setText(new CustFreeMemberServiceImpl().allFreeMember());
			}
		});
		freeView.setBounds(317, 96, 85, 23);
		contentPane.add(freeView);
		

	}
}
