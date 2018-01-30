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
import com.rg.Domain.Customer;
import com.rg.Domain.Cwork;
import com.rg.Domain.Employee;
import com.rg.Service.PersonnelService;
import com.rg.Tools.HttpReturn;
import com.rg.Tools.JsonMap;
import com.rg.Tools.MapToBean;

/**
 * 人事 url="/PersonnelController"
 * @author Zhou
 *员工信息查询 personnelSearch() url="/personnelSearch"
 *员工信息删除 personnelDelete() url="/personnelDelete"
 *员工信息添加 personnelAdd() url="/personnelAdd"
 *员工信息修改personnelChange() url="/personnelChange"
 *考勤打卡 checkAttendance; url="/checkAttendance"
 *绩效查看 performanceSearch url="/performanceSearch"
 */
@Controller
@RequestMapping("/PersonnelController")
public class PersonnelController {

	@Resource
	private PersonnelService personnelService;

	/**
	 * 员工信息查询
	 * 三种查询方法:
	 *分为全部查找及部分查找，Json的key为“searchWay”,value为“1|2|3”；
	 *1为全部查找，2为按编号查找，3为按姓名查找。
	 * @param request
	 * @param response
	 * @param json
	 * 
	 */
	@RequestMapping(value="/personnelSearch",method=RequestMethod.POST)
	@ResponseBody
	public void personnelSearch(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
	    String jsons;
		String searchWay = map.get("searchWay");
		List<Employee>employeeList = new ArrayList<Employee>();
		if(searchWay.equals("1")){
			employeeList = personnelService.selectAll();
		}else if(searchWay.equals("2")){
			String id = map.get("eid");
			employeeList = personnelService.likeSelectById(id);
			 
		}else{
			String name = map.get("ename");
			employeeList = personnelService.likeSelectByname(name);
		}
		
		if(employeeList==null){
			HttpReturn.reponseBody(response, "未查询到有效信息");
		}else{
			 jsons = JSON.toJSONString(employeeList); 
			 HttpReturn.reponseBody(response, jsons);
		}
	}
	
    /**
     * 员工信息删除
     * 员工信息删除需要前台传来员工ID
     * @param request
     * @param response
     * @param json
     * 
     */
	@RequestMapping(value="/personnelDelete",method=RequestMethod.POST)
	@ResponseBody
	public void personnelDelete(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		String id = map.get("eid");
		personnelService.deleteEmployee(id);
		HttpReturn.reponseBody(response, "删除成功");
	}
	

	/**
	 * 员工信息添加
	 * 需要先验证员工编号是否已经存在，然后再进行添加
	 * @param request
	 * @param response
	 * @param json
	 */
	@RequestMapping(value="/personnelAdd",method=RequestMethod.POST)
	@ResponseBody
	public void personnelAdd(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		Employee employee = new Employee();
		Employee employees = new Employee();
		  try {
			employee = MapToBean.mapToBean(employee, map);
		}catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 employees = personnelService.selectById(employee); 
		 if(employees!=null){
			 HttpReturn.reponseBody(response,"员工编号已经存在");
		 }else{
			 personnelService.addEmployee(employee);
			 HttpReturn.reponseBody(response, "添加成功");
		 }
		  
	}
	

	/**
	 * 员工信息修改
	 * @param request
	 * @param response
	 * @param json
	 */
	@RequestMapping(value="/personnelChange",method=RequestMethod.POST)
	@ResponseBody
	public void personnelChange(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		Employee employee = new Employee();
		  try {
			employee = MapToBean.mapToBean(employee, map);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  personnelService.update(employee); 
		  HttpReturn.reponseBody(response, "修改成功");
		  
	}
	

	/**
	 * 考勤打卡
	 * 考勤打卡需要前台传来
	 * Eid员工编号：String
     *Ename员工姓名：String
     *Company 公司：String
     *Ctime考勤时间：String
     *place位置：String
	 * @param request
	 * @param response
	 * @param json
	 */
	@RequestMapping(value="/checkAttendance",method=RequestMethod.POST)
	@ResponseBody
	public void checkAttendance(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		response.setContentType("text/html;charset=utf-8");
		Map<String,String>map = JsonMap.JsonMap(json); 
		Cwork cwork = new Cwork();
		try {
			cwork = MapToBean.mapToBean(cwork, map);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		personnelService.checkAttendance(cwork);
		HttpReturn.reponseBody(response, "打卡成功");
	}
	
	/**
	 * 考勤查看
	 * 
	 */
	@RequestMapping(value="/searchAttendance",method=RequestMethod.POST)
	@ResponseBody
	public void searchAttendance(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		
	}
	

	/**
	 * 绩效查看
	 * @param request
	 * @param response
	 * @param json
	 */
	@RequestMapping(value="/performanceSearch",method=RequestMethod.POST)
	@ResponseBody
	public void performanceSearch(HttpServletRequest request,HttpServletResponse response,
			@RequestBody String json){
		
	}
}
