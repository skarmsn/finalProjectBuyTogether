package com.buy.together.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buy.together.domain.User;
import com.buy.together.service.JoinService;

@RestController
@RequestMapping("/join")
public class JoinRestController {
	
	@Inject
	private JoinService joinService;
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody User user) {
		
		ResponseEntity<String> entity = null;
		
		try {
			joinService.addJoin(user);
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return entity;
		
	}

}