package com.buy.together.service;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.buy.together.dao.UserDao;
import com.buy.together.domain.Interest;
import com.buy.together.domain.User;
import com.buy.together.domain.UserAddress;
import com.buy.together.dto.UserDTO;

@Repository
public class UserServiceImpl implements UserService {

	@Inject 
	private UserDao userDao;
	
	//닉네임 중복 확인
	@Override
	public String checkNickname(String nickName) throws Exception {
		
		String isNicknameExist;
		
		isNicknameExist =  userDao.checkUserNickname(nickName);
		
		if(isNicknameExist == null) { //입력한 닉네임이 user 테이블에 존재하지 않는다면,
			
			isNicknameExist = userDao.checkAdminNickname(nickName); //입력한 닉네임 admin 테이블 조회
			
		}
		
		return isNicknameExist;
		
	}
	
	//필수 정보 DB 저장
	@Override
	public void registBasicInfo(UserDTO userDTO) throws Exception {
	
		Interest interest = new Interest();
		interest.setUser_number(userDTO.getUser_number());

		for(int i=0; i<userDTO.getCategory().size(); i++) { //회원이 선택한 카테고리 갯수만큼 반복
			
			interest.setCategory_number(Integer.parseInt(userDTO.getCategory().get(i)));
			userDao.registInterest(interest); //관심 카테고리 DB 저장
			
		}
		
		User user = new User(userDTO.getUser_number(), userDTO.getNickname());
		userDao.registNickname(user); //닉네임 DB 저장
		
		UserAddress userAddress = new UserAddress(userDTO.getUser_sido(), userDTO.getUser_sigungu(), userDTO.getUser_dong(), userDTO.getUser_number());
		userDao.registUserAddress(userAddress); //관심 지역 DB 저장 
		
	}

}
