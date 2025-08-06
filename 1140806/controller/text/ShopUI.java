package controller.text;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.CustFreeMember;
import model.CustOrder;
import service.impl.CustFreeMemberServiceImpl;
import service.impl.CustOrderServiceImpl;
import util.Tool;

public class ShopUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox time;
	private JTextField date;
	private JTextField name;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopUI frame = new ShopUI();
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
	public ShopUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(45, 30, 400, 350);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 300, 100);
		panel.add(scrollPane);

		time = new JComboBox();
		time.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedItem = (String) time.getSelectedItem();
                    if (selectedItem != null && !selectedItem.isEmpty()) {
                        double hours = Tool.convertToHours(selectedItem);
                        JOptionPane.showMessageDialog(null, "選擇的時間是: " + selectedItem );
                    }
				}
			}
		});
		time.setModel(new DefaultComboBoxModel(new String[] {"", "半小時", "一小時", "一小時半", "兩小時"}));
		time.setBounds(55, 86, 96, 21);
		panel.add(time);
		
		JLabel lblNewLabel = new JLabel("預約時間");
		lblNewLabel.setBounds(78, 60, 47, 15);
		panel.add(lblNewLabel);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(55, 29, 96, 21);
		panel.add(date);
		
		JLabel lblNewLabel_1 = new JLabel("預約日期");
		lblNewLabel_1.setBounds(78, 4, 47, 15);
		panel.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(214, 29, 96, 21);
		panel.add(name);
		name.setColumns(10);
		
		phone = new JTextField();
		phone.setBounds(214, 86, 96, 21);
		panel.add(phone);
		phone.setColumns(10);
		
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
		
		JButton freeMemberOrder = new JButton("order");
		freeMemberOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name=name.getText();
				String Phone=phone.getText();
				String orderDate=date.getText();
				Double orderTimeDouble=Tool.convertToHours((String)time.getSelectedItem());
				String orderStaff=list.getSelectedValue().toString();
				CustFreeMember custFreeMember=new CustFreeMember(Name,Phone);
				CustOrder custOrder=new CustOrder(Name,orderDate,orderTimeDouble,orderStaff);
				if(custFreeMember!=null&&custOrder!=null) 
				{
					new CustFreeMemberServiceImpl().addCustFreeMember(custFreeMember);
					new CustOrderServiceImpl().addCustOrder(custOrder);
					Tool.saveFiled(custOrder,"custFreeOrder.txt");
				}
			}
		});
		freeMemberOrder.setBounds(40, 254, 85, 23);
		panel.add(freeMemberOrder);
		
		JButton memberLogin = new JButton("memberlogin");
		memberLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login=new Login();
				login.setVisible(true);
				dispose();
			}
		});
		memberLogin.setBounds(300, 15, 100, 25);
		contentPane.add(memberLogin);

	}
}
