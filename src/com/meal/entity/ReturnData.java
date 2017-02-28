
package com.meal.entity;

import java.util.List;
import java.util.Map;

/**
 * @see 页面数据接收类
 * @time 2016年9月30日 上午11:34:15
 * @author admin
 *
 */
public class ReturnData {
	
	private String code;
	private String message;
	private List<Map<String,Object>> list;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Map<String, Object>> getList() {
		return list;
	}
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}
	
	
}
