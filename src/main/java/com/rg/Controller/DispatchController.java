package com.rg.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rg.Service.BidService;
import com.rg.Service.CarService;
import com.rg.Service.OrderService;
import com.rg.Service.PersonnelService;
import com.rg.Service.RequestService;

/**
 * 
 * @author Zhou
 * 前后台调度部分交互调用
 * controller路径：logistics/DispatchController
 * 
 * 发布招标信息并生成二维码:issueTender()  url="/issueTender"
 * 查看库存:checkInventory()           url="/checkInventory"
 * 查看车辆实时信息:vehicleInformation() url="/vehicleInformation"
 * 订单查询:orderInquiry               url="/orderInquiry"
 * 查看车队列表:checkTeamList           url="/checkTeamList"
 * 查看司机列表:checkDriverList         url="/checkDriverList"
 * 查看车辆列表:checkCarList            url="/checkCarList"
 * 发起调度亲求:schedulingRequest       url="/schedulingRequest"
 */
@Controller
@RequestMapping("/DispatchController")
public class DispatchController {

	@Resource
	private CarService carService;
	@Resource
	private OrderService orderService;
	@Resource
	private BidService bidService;
	@Resource
	private PersonnelService personnelService;
	@Resource
	private RequestService scheduleRequestService;

	/**
	 * 发布招标信息并生成二维码
	 */
	@RequestMapping(value="/issueTender",method=RequestMethod.POST)
	@ResponseBody
	public void issueTender(){
		
	}
	

	/**
	 * 查看库存
	 */
	@RequestMapping(value="/checkInventory",method=RequestMethod.POST)
	@ResponseBody
    public void checkInventory(){
		
	}
	/**
	 * 查看车辆实时信息
	 */
    @RequestMapping(value="/vehicleInformation",method=RequestMethod.POST)
	@ResponseBody
    public void vehicleInformation(){
		
	}
    
	/**
	 * 订单查询
	 */
    @RequestMapping(value="/orderInquiry",method=RequestMethod.POST)
	@ResponseBody
    public void orderInquiry(){
		
   	}
    
    /**
	 * 查看车队列表
	 */
    @RequestMapping(value="/checkTeamList",method=RequestMethod.POST)
	@ResponseBody
    public void checkTeamList(){
		
   	}
    
    /**
	 *  查看司机列表   
	 */
    @RequestMapping(value="/checkDriverList",method=RequestMethod.POST)
	@ResponseBody
    public void checkDriverList(){
		
   	}
    
    /**
  	 * 查看车辆列表   
  	 */
    @RequestMapping(value="/checkCarList",method=RequestMethod.POST)
	@ResponseBody
    public void checkCarList(){
		
   	}
    
    /**
  	 * 发起调度亲求
  	 */
    @RequestMapping(value="/schedulingRequest",method=RequestMethod.POST)
	@ResponseBody
    public void schedulingRequest(){
		
   	}
}
