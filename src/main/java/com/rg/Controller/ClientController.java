package com.rg.Controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rg.Service.ClientService;
import com.rg.Tools.JsonMap;

/**
 * 
 * @author Zhou
 * 用于前后台(客户/厂家)部分交互调用
 * controller路径：logistics/ClientController
 * 方法：
 * 客户信息添加（） clientAdd()    url="/clientAdd"
 * 客户信息添加（） clientAdd()    url="/clientAdd"
 * 客户信息添加（） clientAdd()    url="/clientAdd"
 * 客户信息添加（） clientAdd()    url="/clientAdd"
 * 
 * 查询可购商品（） queriesPurchasedGoods()  url="/queriesPurchasedGoods"
 * 查询已购订单（） queryPurchaseOrders()  url="/queryPurchaseOrders"
 * 查询当前订单的物流情况（） queryOrderSituation() url="/queryOrderSituation"
 */
@Controller
@RequestMapping("/ClientController")
public class ClientController {

	@Resource
	private ClientService clientService;
	
	/**
	 * 客户信息添加
	 */
	@RequestMapping(value="/clientAdd",method=RequestMethod.POST)
	@ResponseBody
	public void clientAdd(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		
	}
	
	/**
	 * 客户信息查找
	 */
	@RequestMapping(value="/clientSearch",method=RequestMethod.POST)
	@ResponseBody
	public void clientSearch(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		
	}
	
	
	/**
	 * 客户信息查找
	 */
	@RequestMapping(value="/clientDelete",method=RequestMethod.POST)
	@ResponseBody
	public void clientDelete(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		
	}
	@RequestMapping(value="/clientChange",method=RequestMethod.POST)
	@ResponseBody
	public void clientChange(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		
	}
    
	/**
	 * 查询可购商品
	 */
	@RequestMapping(value="/queriesPurchasedGoods",method=RequestMethod.POST)
	@ResponseBody
	 public void queriesPurchasedGoods(){
		 
	 }
   
	/**
	 * 查询已购订单
	 */
	@RequestMapping(value="/queryPurchaseOrders",method=RequestMethod.POST)
	@ResponseBody
	 public void queryPurchaseOrders(){
		 
	 }
	
	/**
	 * 查询当前订单的物流情况
	 */
	@RequestMapping(value="/queryOrderSituation",method=RequestMethod.POST)
	@ResponseBody
	 public void queryOrderSituation(){
		 
	 }
}
