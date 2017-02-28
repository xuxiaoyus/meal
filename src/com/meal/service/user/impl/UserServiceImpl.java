package com.meal.service.user.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.meal.dao.DaoSupport;
import com.meal.entity.PageData;
import com.meal.service.user.UserService;
@Service(value="userService")
public class UserServiceImpl implements UserService{
	@Resource(name="daoSupport")
	private DaoSupport daoSupport;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> UserLogin(PageData pd) {
		try {
			return (List<Map<String, Object>>) daoSupport.findForList("UserMapper.getUser", null);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	
}
