package com.util;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;

public class Tool {

	public static void main(String[] args) {
		
	}
	
	/** 存取資料 */
	public static void saveFiled(Object object, String fileName) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(object);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** 調取資料 */
	public static Object readField(String fileName) {
		Object object = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(fileName);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			object = objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return object;
	}
	
	/** 員工照片放置用 */
	public static ImageIcon staffPhoto(String photoResours,Class className) 
	{
		//要放在jLabel裡面
		ImageIcon staffPhotoIcon=new ImageIcon(className.getResource(photoResours));
		Image scaledImage=staffPhotoIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		ImageIcon reStaff=new ImageIcon(scaledImage);
		return reStaff;
	} 

	/**開始前介紹or補充*/
	public static String showRules()
	{
		String rules="首先，分為兩種模式進行。\n"
				+ "第一種視為客人，可以進行時間上的預約、投餵零食或是撫慰心靈等消費。\n"
				+ "第二種視為員工，可以進行時間控管，或是選擇休息。\n"
				+ "最後特別的是，\n"
				+ "老闆模式是在員工系統中直接使用密碼登入，可以看到員工的各式狀況、客人預約或是消費等紀錄。";
		rules=rules+"";
		
		return rules;
	}
	
	
}
