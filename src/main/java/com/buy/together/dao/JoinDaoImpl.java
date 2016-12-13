package com.buy.together.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.buy.together.domain.User;

@Repository
public class JoinDaoImpl implements JoinDao {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.buy.together.mappers.buyTogetherMapper";
	
	@Override
	public void create(User user) throws Exception {
		
		session.insert(namespace + ".create", user);
		
	}

}