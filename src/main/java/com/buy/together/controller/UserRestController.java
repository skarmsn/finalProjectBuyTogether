package com.buy.together.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buy.together.dto.UserDTO;
import com.buy.together.service.UserService;

@RestController
@RequestMapping("/restUser")
public class UserRestController {

	@Inject
	private UserService userService;	
	private static final Logger logger = LoggerFactory.getLogger(UserRestController.class);
	
	//닉네임 중복 확인
	@RequestMapping(value="/nicknameCheck", method = RequestMethod.POST)
	public ResponseEntity<String> requestNickNameCheck(String nickname) {
		
		ResponseEntity<String> entity = null;
		String isExist = null;
		
		try {
			isExist = userService.checkNickname(nickname);
			entity = new ResponseEntity<String>(isExist, HttpStatus.OK); // HttpStatus.OK == 200
		} catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(isExist, HttpStatus.BAD_REQUEST); // HttpStatus.BAD_REQUEST == 400
		}
		
		return entity;
		
	}
	
	//필수 정보 DB 저장
	@RequestMapping(value="/registBasicInfo", method = RequestMethod.POST)
	public ResponseEntity<String> requestBasicInfo(@RequestBody UserDTO userDTO, HttpServletRequest request) {
		
		ResponseEntity<String> entity = null;
		System.out.println(userDTO.getNickname());
		
		try {
			userService.registBasicInfo(userDTO);
			entity = new ResponseEntity<String>("success", HttpStatus.OK); // HttpStatus.OK == 200
		} catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>("fail", HttpStatus.BAD_REQUEST); // HttpStatus.BAD_REQUEST == 400
		}
		
		return entity;
		
	}
	
}
