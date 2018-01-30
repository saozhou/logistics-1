package com.rg.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rg.Domain.Client;
import com.rg.Service.InventoryService;
import com.rg.Service.OrderService;
import com.rg.Service.QuoteService;
import com.rg.Service.RequestService;

/**
 * 
 * @author Zhou
 * 用于前后台销售部分交互调用
 * controller路径：logistics/SellController
 * 发起订单请求 tradeOrder        url="/tradeOrder"
 * 查看库存信息 checkInventory    url="/checkInventory"
 * 获取报价信息 offerInformation  url="/offerInformation"
 */

@Controller
@RequestMapping("/SellController")
public class SellController {

	@Resource
	private OrderService orderService;
	@Resource
	private InventoryService inventoryService;
	@Resource
	private QuoteService quoteService;
	@Resource
	private RequestService requestService;
	
	/**
	 * 发起订单请求
	 */
	@RequestMapping(value="/tradeOrder",method=RequestMethod.POST)
	@ResponseBody
	public void tradeOrder(){
		
	}
	/**
	 *  查看库存信息 
	 */
	@RequestMapping(value="/checkInventory",method=RequestMethod.POST)
	@ResponseBody
	public void checkInventory(){
	 
	}
	/**
	 * 获取报价信息
	 */
	@RequestMapping(value="/offerInformation",method=RequestMethod.POST)
	@ResponseBody
	public void offerInformation(){
		
	}
	
	 
}
