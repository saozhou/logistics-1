package com.rg.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rg.Service.DriverService;

/**
 * 
 * @author Zhou
 * 前后台车队部分交互调用
 * controller路径：logistics/DriverController
 * 司机添加 :driverAdd()       url="/driverAdd"
 * 司机信息修改:driverChange() url="/driverChange"
 * 司机删除 :driverDelete()    url="/driverDelete"
 * 司机列表 :driverList()      url="/driverList"
 * 车辆添加 :carAdd()          url="/carAdd"
 * 车辆信息修改 :carChange()    url="/carChange" 
 * 车辆删除:carDelete()       url="/carDelete"
 * 车辆列表:carList()         url="/carList"
 * 订单查询:orderSearch()     url="/orderSearch"
 */

@Controller
@RequestMapping("/DriverController")
public class DriverController {
	@Resource
	private DriverService driverService;
	
    /**
     * 司机添加
     */
	@RequestMapping(value="/driverAdd",method=RequestMethod.POST)
	@ResponseBody
	public void driverAdd(){
		
	}
	
	 /**
     * 司机信息修改
     */
	@RequestMapping(value="/driverChange",method=RequestMethod.POST)
	@ResponseBody
	public void driverChange(){
   
	}
	
	 /**
     * 司机删除
     */
	@RequestMapping(value="/driverDelete",method=RequestMethod.POST)
	@ResponseBody
	public void driverDelete(){
		
	}
	
	 /**
     * 司机列表
     */
	@RequestMapping(value="/driverList",method=RequestMethod.POST)
	@ResponseBody
	public void driverList(){
		
	}
	
	 /**
     * 车辆添加
     */
	@RequestMapping(value="/carAdd",method=RequestMethod.POST)
	@ResponseBody
	public void carAdd(){
		
	}
	
	 /**
     * 车辆信息修改
     */
	@RequestMapping(value="/carChange",method=RequestMethod.POST)
	@ResponseBody
	public void carChange(){
		
	}
	
	 /**
     * 车辆删除
     */
	@RequestMapping(value="/carDelete",method=RequestMethod.POST)
	@ResponseBody
	public void carDelete(){
		
	}
	
	 /**
     * 车辆列表
     */
	@RequestMapping(value="/carList",method=RequestMethod.POST)
	@ResponseBody
	public void carList(){
		
	}
	
	 /**
     * 订单查询
     */
	@RequestMapping(value="/orderSearch",method=RequestMethod.POST)
	@ResponseBody
	public void orderSearch(){
		
	}
}

  