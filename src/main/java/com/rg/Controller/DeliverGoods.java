package com.rg.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rg.Service.DriverService;
import com.rg.Service.InventoryService;
import com.rg.Service.OrderService;
import com.rg.Service.QuoteService;
import com.rg.Service.RequestService;

/**
 * 
 * @author Zhou
 * 用于前后台发货部分交互调用
 * controller路径：logistics/DeliverGoods
 * 
 * 方法
 * 调整出厂价：adjustFactoryPrice() url="/adjustFactoryPrice"
 * 调整出售价: adjustSellPrice()   url="/adjustSellPrice"
 * 修改库存情况: modifyInventory()  url="/modifyInventory"
 * 记录实收:recordAmount()         url="/recordAmount"
 * 记录实发:recordRealHair()       url="/recordRealHair"
 * 报销加油请求:oilRequest()        url="/oilRequest"
 * 报销保修请求 :warrantyRequest()  url="/warrantyRequest"
 * 报销餐补请求:meakRequest()       url="/meakRequest"
 * 发起结算请求:settlementRequest() url="/settlementRequest"
 */


@Controller
@RequestMapping("/DeliverGoods")
public class DeliverGoods {
	@Resource
	private OrderService orderService;
	@Resource
	private InventoryService inventoryService;
	@Resource
	private QuoteService quoteService;
	@Resource
	private RequestService requestService;
	
	/**
	 * 调整出厂价
	 */
	@RequestMapping(value="/adjustFactoryPrice",method=RequestMethod.POST)
	@ResponseBody
	public void adjustFactoryPrice(){
		
	}
	
	/**
	 * 调整出售价
	 */
	@RequestMapping(value="/adjustSellPrice",method=RequestMethod.POST)
	@ResponseBody
	public void adjustSellPrice(){
		
	}
	
	/**
	 * 修改库存情况
	 */
	@RequestMapping(value="/modifyInventory",method=RequestMethod.POST)
	@ResponseBody
	public void modifyInventory(){
		
	}
	
	/**
	 * 记录实收
	 */
	@RequestMapping(value="/recordAmount",method=RequestMethod.POST)
	@ResponseBody
	public void recordAmount(){
		
	}
	
	/**
	 * 记录实发
	 */
	@RequestMapping(value="/recordRealHair",method=RequestMethod.POST)
	@ResponseBody
	public void recordRealHair(){
		
	}
	
	/**
	 * 报销加油请求
	 */
	@RequestMapping(value="/oilRequest",method=RequestMethod.POST)
	@ResponseBody
	public void oilRequest(){
		
	}
	
	/**
	 * 报销保修请求
	 */
	@RequestMapping(value="/warrantyRequest",method=RequestMethod.POST)
	@ResponseBody
	public void warrantyRequest(){
		
	}
	
	/**
	 * 报销餐补请求
	 */
	@RequestMapping(value="/meakRequest",method=RequestMethod.POST)
	@ResponseBody
	public void meakRequest(){
		
	}
	
	/**
	 * 发起结算请求
	 */
	@RequestMapping(value="/settlementRequest",method=RequestMethod.POST)
	@ResponseBody
	public void settlementRequest(){
		
	}
	 
	
}
