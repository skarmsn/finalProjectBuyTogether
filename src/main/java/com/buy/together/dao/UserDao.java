package com.buy.together.dao;

import com.buy.together.domain.Interest;
import com.buy.together.domain.User;
import com.buy.together.domain.UserAddress;

public interface UserDao {

	public String checkUserNickname(String nickName) throws Exception;
	
	public String checkAdminNickname(String nickName) throws Exception;
	
	public void registNickname(User user) throws Exception;
	
	public void registUserAddress(UserAddress userAddress) throws Exception;
	
	public void registInterest(Interest interest) throws Exception;
	
}
