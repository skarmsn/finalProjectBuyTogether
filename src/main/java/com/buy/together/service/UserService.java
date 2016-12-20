package com.buy.together.service;

import com.buy.together.dto.UserDTO;

public interface UserService {

	public String checkNickname(String nickName) throws Exception;
	
	public void registBasicInfo(UserDTO userDTO) throws Exception;
	
}
