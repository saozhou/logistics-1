package com.rg.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rg.Service.ClientService;

/**
 * 
 * @author Zhou
 * 用于前后台客户部分交互调用
 * controller路径：logistics/ClientController
 * 方法：
 * 客户信息管理（） clientManage()    url="/clientManage"
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
	 * 客户信息管理
	 */
	@RequestMapping(value="/clientManage",method=RequestMethod.POST)
	@ResponseBody
	public void clientManage(){
		
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
