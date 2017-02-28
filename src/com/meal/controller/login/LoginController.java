package com.meal.controller.login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.meal.controller.BaseController;
import com.meal.entity.PageData;
import com.meal.entity.ReturnData;
import com.meal.service.user.UserService;

@Controller
@RequestMapping("/v1/user")
public class LoginController extends BaseController {

	@Autowired
	private UserService userService;
	
	private ReturnData returnData;

	private List<Map<String, Object>> userList;
	

	@ResponseBody
	@RequestMapping(value="/loginweb",method=RequestMethod.GET)
	public List<Map<String, Object>> loginManager(HttpServletRequest request,HttpServletResponse response,HttpSession session
//			@RequestParam(value="accounts",required=true) String account,
//			@RequestParam(value="password",required=true) String password
			
			){
		PageData pd = this.getPageData();
	
		List<Map<String, Object>> user = userService.UserLogin(pd);
		
		
	
		
		return user;
	}

}
