package controller.text;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.CustMember;
import model.CustOrder;
import service.impl.CustOrderServiceImpl;
import util.Tool;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MemberShop extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberShop frame = new MemberShop();
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
	public MemberShop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("預約日期");
		lblNewLabel_1.setBounds(95, 10, 47, 15);
		contentPane.add(lblNewLabel_1);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(72, 36, 96, 21);
		contentPane.add(date);
		
		JLabel lblNewLabel = new JLabel("預約時間");
		lblNewLabel.setBounds(95, 67, 47, 15);
		contentPane.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 300, 100);
		contentPane.add(scrollPane);
		
		JList<String> list = new JList<>(Tool.dala());
		scrollPane.setViewportView(list);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {  // 防止多次觸發
					String selectedName = list.getSelectedValue();
					// 當選擇某個名字時執行操作，這裡只顯示選擇的名字
					JOptionPane.showMessageDialog(null, "選擇的員工是: " + selectedName);
					}
			}
		});
		list.setFont(new Font("新細明體", Font.PLAIN, 16));
		
		JComboBox time = new JComboBox();
		time.setModel(new DefaultComboBoxModel(new String[] {"", "半小時", "一小時", "一小時半", "兩小時"}));
		time.setBounds(72, 80, 96, 21);
		contentPane.add(time);
		
		CustMember custMember=(CustMember)Tool.readFiled("Member.txt");
		if (custMember != null) {
		    JLabel memberMes = new JLabel("會員：" + custMember.getCustMemberName());
		    memberMes.setBounds(231, 39, 150, 43); // 調整顯示位置與大小
		    contentPane.add(memberMes);
		}
		
		JButton memberOrder = new JButton("order");
		memberOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name=custMember.getCustMemberName();
				String orderDate=date.getText();
				Double orderTimeDouble=Tool.convertToHours((String)time.getSelectedItem());
				String orderStaff=list.getSelectedValue().toString();
				CustOrder custOrder=new CustOrder(Name,orderDate,orderTimeDouble,orderStaff);
				if(custOrder!=null) 
				{
					new CustOrderServiceImpl().addCustOrder(custOrder);
					Tool.saveFiled(custOrder, "memberOrder.txt");
				}
					
			}
		});
		memberOrder.setBounds(69, 276, 85, 23);
		contentPane.add(memberOrder);
		
		

	}
}
