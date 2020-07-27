package com.zhitengda;

import java.util.HashMap;
import java.util.Map;

public class JinChengHeXianCheng {

	public static String getMsg(){
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("vipCode", "");
		params.put("type", "type");	// Y 收寄类型：1-我收， 2-我寄
		params.put("nameType", "nameType");	// Y 姓名类型：1-寄件人，2-收件人
		params.put("name", "name"); // Y 姓名（如果传了姓名，姓名类型不能为空）
		params.put("blTransfer", "name");// Y 是否查询在途（0-标识全部，1-标识只查询在途）
		 

		
		return "";
	}
	
	public static void main(String[] args) {
		   
		
		
		
	}
	
	

}
