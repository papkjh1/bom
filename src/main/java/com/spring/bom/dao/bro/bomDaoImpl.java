package com.spring.bom.dao.bro;





import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.bom.model.bro.user_info;
@Repository
public class bomDaoImpl implements bomDao {
	@Autowired
	private SqlSession session;

	@Override	
	public user_info loginCheck(user_info ui) throws Exception{
		System.out.println("dao ui "+ui);
		user_info userinfo = session.selectOne("login",ui);
		System.out.println("dao userinfo.getUcode, userinfo.getUatid"+ userinfo.getuCode()+", "+ userinfo.getuAtid());
		return userinfo;
	}

	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		
	}
	 

	
		
	
	
	

}
