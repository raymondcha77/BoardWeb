package com.ezen.biz.dao;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.biz.dto.UserVO;

@Repository("userDao")
public class UserDAO extends SqlSessionDaoSupport {

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public UserVO getUser(UserVO vo) {
		System.out.println("===> JDBC·Î getUser() Ã³¸®22222");

		UserVO user = getSqlSession().selectOne("UserMapper.getUser", vo);
		System.out.println("user="+user);
		
		return user;		
	}

}


