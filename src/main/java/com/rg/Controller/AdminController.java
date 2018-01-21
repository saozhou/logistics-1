package com.rg.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rg.Service.UserInfoService;
/**
 * 
 * @author Zhou
 * 管理员controller
 * 用于前后台管理员部分交互调用
 * controller路径：logistics/AdminController
 * 方法：
 * 用户权限管理（）userPower()  url="/userPower"
 * 删除操作（）delete();        url="/delete"
 * 请求处理（）demand();        url="/demand" 
 * 查看财务报表（）lookFinancialStatement  url="/lookFinancialStatement"
 * 查看财务细分（）checkFinancialBreakdown  url="/checkFinancialBreakdown"
 * 查看订单历史（）checkOrderHistory  url="/checkOrderHistory"
 */

@Controller
@RequestMapping("/AdminController")
public class AdminController {
	
	@Resource
	private UserInfoService userInfoService;
	
	/**
	 * 用户权限管理
	 */
	@RequestMapping(value="/userPower",method=RequestMethod.POST)
	@ResponseBody
	public void userPower(){
		
	}
	
	/**
	 * 删除操作
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public void delete(){
		
	}
	
	/**
	 * 请求处理
	 */
	@RequestMapping(value="/demand",method=RequestMethod.POST)
	@ResponseBody
	public void demand(){
		
	}
	
	/**
	 * 查看财务报表
	 */
	@RequestMapping(value="/lookFinancialStatement",method=RequestMethod.POST)
	@ResponseBody
	public void lookFinancialStatement(){
		
	}
	
	/**
	 * 查看财务细分
	 */
	@RequestMapping(value="/checkFinancialBreakdown",method=RequestMethod.POST)
	@ResponseBody
	public void checkFinancialBreakdown(){
		
	}
	
	/**
	 * 查看订单历史
	 */
	@RequestMapping(value="/checkOrderHistory",method=RequestMethod.POST)
	@ResponseBody
	public void checkOrderHistory(){
		
	}
}
