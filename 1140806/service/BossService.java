package service;

import model.Boss;
import model.CustMember;

public interface BossService {
	//create
		boolean addBoss(Boss boss);
		
		//read
		Boss login(String bossUsername,String bossPassword);
		String allBoss();
		
		//update
		boolean changeBoss(Boss boss);
			
		//delete
		boolean deleteBoss(Boss boss);

}
