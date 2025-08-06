package util;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import service.impl.StaffMemberServiceImpl;

public class Tool {

	/**存取物件檔案*/
	public static void saveFiled(Object object,String filName)
	{
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(filName);
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**讀取物件檔案*/
	public static Object readFiled(String filName)
	{
		Object object=null;
		try {
			FileInputStream fileInputStream = new FileInputStream(filName);
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			object=objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return object;
	}
	
	/**寵物放置照片設定*/
	public static ImageIcon staffPhoto(String photoResourse,Class className)
	{
		//放在JLabel裡面
		ImageIcon staffPhoto=new ImageIcon(className.getResource(photoResourse));
		Image imageSet=staffPhoto.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		ImageIcon staffPhotoPut=new ImageIcon(imageSet);
		return staffPhotoPut;
 	}
	
	/** 顯示可以選擇陪伴的寵物 */
	public static String[] dala() {
		String lala = new StaffMemberServiceImpl().viewStaff();
		lala = lala.replaceAll("^[\\[\\n]+", "");
		String[] lada = lala.split("員工姓名:");
		List<String> staffNames = new ArrayList<>(); // 用來儲存所有的員工姓名
		for (int i = 0; i < lada.length; i++) {
			String staffList = lada[i].replaceAll("ID:\\d+\\s*", "").replaceAll(",", "").replace("]", "").trim();
			staffNames.add(staffList);
		}
		return staffNames.toArray(new String[0]);
	}
	
	/**comobox換算時間成double*/
	public static double convertToHours(String selectedItem) {
        switch (selectedItem) {
            case "半小時":
                return 0.5;
            case "一小時":
                return 1.0;
            case "一小時半":
                return 1.5;
            case "兩小時":
                return 2.0;
            default:
                return 0.0;  // 如果選擇是空的，則返回 0.0
        }

	}
}
