package com.spring.bom.dao.bear;

import java.util.List;

import com.spring.bom.model.bear.Chat;
import com.spring.bom.model.bear.User;

public interface ChatDao {
	
	//user 온라인유저 조회
	List<User> 	uonline(User user);
	
	//chat msg 저장 
	int		chatmsg(Chat chat);

}
