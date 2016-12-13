package com.buy.together.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.buy.together.dao.JoinDao;
import com.buy.together.domain.User;

@Service
public class JoinServiceImpl implements JoinService{
	
	@Inject
	private JoinDao joindao;
	
	@Override
	public void addJoin(User user) throws Exception {
		
		joindao.create(user);
		
	}

}