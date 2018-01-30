package com.rg.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.rg.Domain.Border;
import com.rg.Domain.Client;
import com.rg.Domain.Customer;
import com.rg.Domain.Vender;
import com.rg.Service.ClientService;
import com.rg.Tools.HttpReturn;
import com.rg.Tools.JsonMap;
import com.rg.Tools.MapToBean;

/**
 * 
 * @author Zhou
 * 用于前后台(客户/厂家)部分交互调用
 * controller路径：logistics/ClientController
 * 方法：
 * 客户信息添加（） clientAdd()    url="/clientAdd"
 * 客户信息查找（） clientSearch()    url="/clientSearch"
 * 客户信息删除（） clientDelete()    url="/clientDelete"
 * 客户信息修改（） clientChange()    url="/clientChange"
 *
 * 厂家信息添加（） venderAdd()       url="/venderAdd"
 * 厂家信息查找（） venderSearch()    url="/venderSearch"
 * 厂家信息删除（） venderDelete()    url="/venderDelete"
 * 厂家信息修改（） venderChange()    url="/venderChange"
 * 
 * 查询可购商品（） queriesPurchasedGoods()  url="/queriesPurchasedGoods"
 * 查询已购订单（） queryPurchaseOrders()  url="/queryPurchaseOrders"
 * 查询当前订单的物流情况（） queryOrderSituation() url="/queryOrderSituation"
 * 删除操作均为将客户信息的有效性设为隐藏状态
 */
@Controller
@RequestMapping("/ClientController")
public class ClientController {

	@Resource
	private ClientService clientService;
	@Resource
	private ClientService venderService ;
	
	/**
	 * 客户信息添加
	 */
	@RequestMapping(value="/clientAdd",method=RequestMethod.POST)
	@ResponseBody
	public void clientAdd(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		Client client = new Client(); 
		Client tclient=new Client();
		try {
			client = (Client) MapToBean.mapToBean(client, map);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		tclient =(Client) clientService.searchById(client.getId());
		if(tclient!=null){
			HttpReturn.reponseBody(response, "客户编号已存在");
		}else{
		 
			clientService.clientAdd(client);
			HttpReturn.reponseBody(response, "添加成功");
		}
		 
	}
	
	/**
	 *客户信息查找
	 *分为全部查找及部分查找，Json的key为“searchWay”,value为“1|2|3”；
	 *1为全部查找，2为按编号查找，3为按姓名查找。
	 */
	@RequestMapping(value="/clientSearch",method=RequestMethod.POST)
	@ResponseBody
	public void clientSearch(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
       String jsons;
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		String searchWay = map.get("searchWay");
		List<Customer>clientList = new ArrayList<Customer>();
		if(searchWay.equals("1")){
		   clientList = clientService.selectAll();
		    
		}else if(searchWay.equals("2")){
			String id = map.get("id");
			clientList = clientService.likeSelectById(id);
			 
		}else{
			String name = map.get("name");
			clientList = clientService.likeSelectByname(name);
		}
		
		if(clientList==null){
			HttpReturn.reponseBody(response, "未查询到有效信息");
		}else{
			 jsons = JSON.toJSONString(clientList); 
			 HttpReturn.reponseBody(response, jsons);
		}
	}
	
	
	/**
	 * 客户删除
	 * 前台所传来的json信息包括key：cid ,value:客户编号
	 */
	@RequestMapping(value="/clientDelete",method=RequestMethod.POST)
	@ResponseBody
	public void clientDelete(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		String id = map.get("id");
		clientService.deleteClient(id);
		HttpReturn.reponseBody(response, "删除成功");
	}
	
	/**
	 * 客户信息修改/客户授信/客户评级（客户评级未定）
	 * 前台需要传来的信息包括
	 * 客户修改后的信息及他原本信息中未被修改的信息
	 * key:为实体类属性名
	 * value:为内容
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	@RequestMapping(value="/clientChange",method=RequestMethod.POST)
	@ResponseBody
	public void clientChange(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json) throws IllegalArgumentException, IllegalAccessException{
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json);
		Client client = new Client();
        client = MapToBean.mapToBean(client, map);
		clientService.updateClient(client);
		HttpReturn.reponseBody(response, "修改成功");
	}
    
	
	
	/**
	 * 厂家信息添加
	 * 
	 */
	@RequestMapping(value="/venderAdd",method=RequestMethod.POST)
	@ResponseBody
	public void venderAdd(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
        Vender vender = new Vender();
        Vender tvender = new Vender();
		try {
			vender =   MapToBean.mapToBean(vender, map);
			 
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tvender =(Vender) venderService.searchById(vender.getId());
		if(tvender!=null){
			HttpReturn.reponseBody(response, "厂家编号已存在");
		}else{
			venderService.clientAdd(vender);
			HttpReturn.reponseBody(response, "添加成功");
		}
	}
	
	/**
	 * 厂家信息查找
	 * 分为全部查找及部分查找，Json的key为“searchWay”,value为“1|2|3”；
	 *1为全部查找，2为按编号查找，3为按姓名查找
	 */
	@RequestMapping(value="/venderSearch",method=RequestMethod.POST)
	@ResponseBody
	public void venderSearch(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		String jsons;
		String searchWay = map.get("searchWay");
		List<Customer>venderList = new ArrayList<Customer>();
		if(searchWay.equals("1")){
			 
			venderList = venderService.selectAll();
		    
		}else if(searchWay.equals("2")){
			String id = map.get("id");
			venderList = venderService.likeSelectById(id);
			 
		}else{
			String name = map.get("name");
			venderList = venderService.likeSelectByname(name);
		}
		
		if(venderList==null){
			HttpReturn.reponseBody(response, "未查询到有效信息");
		}else{
			 jsons = JSON.toJSONString(venderList); 
			 HttpReturn.reponseBody(response, jsons);
		}
	}
	
	
	/**
	 * 厂家删除
	 */
	@RequestMapping(value="/venderDelete",method=RequestMethod.POST)
	@ResponseBody                                                                                                                                                                                                                              
	public void venderDelete(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		
		Map<String,String>map = JsonMap.JsonMap(json); 
		String id = map.get("id");
		venderService.deleteClient(id);
		HttpReturn.reponseBody(response, "删除成功");
	}
	
	/**
	 * 厂家信息修改
	 */
	
	@RequestMapping(value="/venderChange",method=RequestMethod.POST)                       
	@ResponseBody
	public void venderChange(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		Vender vender = new Vender();
        try {
			vender = MapToBean.mapToBean(vender, map);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		venderService.updateClient(vender);
		HttpReturn.reponseBody(response, "修改成功");
		
	}
	
	/**
	 * 查询可购商品
	 */
	@RequestMapping(value="/queriesPurchasedGoods",method=RequestMethod.POST)
	@ResponseBody
	 public void queriesPurchasedGoods(HttpServletRequest request,HttpServletResponse response,
				@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
	 }
   
	/**
	 * 客户查询已购订单
	 * 已完成:1，未完成:2，全部:3
	 * 需要客户ID
	 */
	@RequestMapping(value="/queryPurchaseOrders",method=RequestMethod.POST)
	@ResponseBody
	 public void queryPurchaseOrders(HttpServletRequest request,HttpServletResponse response,
				@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		 String id = map.get("id");
		 List<Border>list = new ArrayList<Border>();
		 if(id.equals("1")){
			list = clientService.selcetBorder(id,1);
		 }else if(id.equals("2")){
			 list = clientService.selcetBorder(id,0);
		 }else if(id.equals("3")){
			 list = clientService.slectAlBorder();
		 }
		 
		 if(list==null){
			 HttpReturn.reponseBody(response, "无记录");
		 }else{
			 String jsons = JSON.toJSONString(list);
			 HttpReturn.reponseBody(response, jsons);
		 }
	 }
	
	/**
	 * 查询当前订单的物流情况
	 */
	@RequestMapping(value="/queryOrderSituation",method=RequestMethod.POST)
	@ResponseBody
	 public void queryOrderSituation(){
		 
	 }
}
