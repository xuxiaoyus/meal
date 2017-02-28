package com.meal.service.user;

import java.util.List;
import java.util.Map;

import com.meal.entity.PageData;

public interface UserService {
	public List<Map<String,Object>> UserLogin(PageData pd);
	

}
