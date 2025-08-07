package controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class Text extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JDatePickerImpl orderDatePicker;  // 訂單日期選擇器
    private JLabel lblOrderDate;  // 訂單日期標籤

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                try {
                    Text frame = new Text();
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
    public Text() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // 設置 JFrame 屬性
        setTitle("測試");  // 設置標題

        // 設置訂單日期選擇器
        UtilDateModel orderDateModel = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "今天");
        p.put("text.month", "月");
        p.put("text.year", "年");

        JDatePanelImpl orderDatePanel = new JDatePanelImpl(orderDateModel);  // 只傳入 UtilDateModel
        orderDatePicker = new JDatePickerImpl(orderDatePanel, null);
        orderDatePicker.setBounds(81, 12, 202, 23);
        orderDatePicker.getJFormattedTextField().setFont(new Font("微軟正黑體", Font.BOLD, 18));

        // 初始化顧客姓名標籤
        lblOrderDate = new JLabel("訂單日期");
        lblOrderDate.setBounds(10, 12, 66, 23);
        lblOrderDate.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
        lblOrderDate.setForeground(new Color(255, 255, 0));
        contentPane.setLayout(null);

        // 添加元件到 JFrame
        getContentPane().add(lblOrderDate);  // 正確的添加方法
        getContentPane().add(orderDatePicker);

        // 顯示窗口
        setVisible(true);
    }

    public  void BookingFrame(String title, String labelText, String dateText) {

    }
}
