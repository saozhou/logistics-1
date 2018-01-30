package com.rg.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.rg.Domain.Fassets;
import com.rg.Domain.FileRecord;
import com.rg.Service.ArchiveService;
import com.rg.Service.BillService;
import com.rg.Service.FixedService;
import com.rg.Service.SalaryService;
import com.rg.Service.SheXinService;
import com.rg.Tools.HttpReturn;
import com.rg.Tools.JsonMap;
import com.rg.Tools.MapToBean;

/**
 * 
 * @author Zhou
 * 前后台财务部分交互调用
 * 
 * controller路径：logistics/FinaceController
 * 
 * 方法
 * 员工绩效考核：employeeAssessment() url="/employeeAssessment"
 * 生成财务报表: generateStatements() url="/generateStatements"
 * 固定资产统计折损:fixedAssets()      url="/fixedAssets"
 * 固定资产查看：fixedSearch() url="/fixedSearch"
 * 固定资产修改：fixedChange() url="/fixedChange"
 * 固定资产删除：fixedDelete() url="/fixedDelete"
 * 固定资产添加：fixedAdd() url="/fixedAdd"
 * 上游厂家结算:upstreamSettlement()  url="/upstreamSettlement"
 * 货运结算:freightSettlement()      url="/freightSettlement"
 * 下游买家结算:downstreamSettlement()url="/downstreamSettlement"
 * 支出账单:spendingBills()          url="/spendingBills"
 * 收入账单:revenueBills()           url="/revenueBills"   
 * 赊欠记录:creditRecord()           url="/creditRecord"
 * 赊欠自动抵扣:creditDeduction()     url="/creditDeduction"
 * 查询存档:queryArchive()           url="/queryArchive"
 * 添加存档:addArchive()             url="/addArchive"
 * 删除存档:deleteArchive()          url="/deleteArchive"
 * 修改存档:changeArchive()          url="/changeArchive"
 * 赊信额度管理:creditLimitsManage()  url="/creditLimitsManage"
 */
@Controller
@RequestMapping("/FinaceController")
public class FinaceController {
    
	 @Resource
	 private SalaryService salaryService;
	 @Resource
	 private BillService billService;
	 @Resource
	 private ArchiveService archiveService;
	 @Resource
	 private SheXinService sheXinService;
	 @Resource
	 private FixedService fixedService;
	 
	 /**
	  * 员工绩效考核
	  */
	 @RequestMapping(value="/employeeAssessment",method=RequestMethod.POST)
		@ResponseBody
	 public void employeeAssessment(){
		 
	 }
	 /**生成财务报表
	  * 
	  */
	 @RequestMapping(value="/generateStatements",method=RequestMethod.POST)
		@ResponseBody
	 public void generateStatements(){
		 
	 }
	 /**
	  * 固定资产统计折损
	  */
	 @RequestMapping(value="/fixedAssets",method=RequestMethod.POST)
		@ResponseBody
	 public void fixedAssets(){
		 
	 }
	 
	 /**
	  * 固定资产添加
	  */
	 @RequestMapping(value="/fixedAdd",method=RequestMethod.POST)
		@ResponseBody
	 public void fixedAdd(HttpServletRequest request,HttpServletResponse response,
				@RequestBody String json){
		 response.setContentType("text/html;charset=utf-8");
	     Map<String,String>map = JsonMap.JsonMap(json); 
	     Fassets fassets = new Fassets(); 
	     Fassets fasset = new Fassets();
			 
			try {
				fassets = (Fassets) MapToBean.mapToBean(fassets, map);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
			fasset =(Fassets) fixedService.searchById(fassets.getFcode());
			if(fasset!=null){
				HttpReturn.reponseBody(response, "资产编号已存在");
			}else{
			 
				fixedService.fixedAdd(fassets);
				HttpReturn.reponseBody(response, "添加成功");
			}
	 }
	 /**
	  * 固定资产删除
	  * 需要前台传来资产的信息
	  */
	 @RequestMapping(value="/fixedDelete",method=RequestMethod.POST)
		@ResponseBody
	 public void fixedDelete(HttpServletRequest request,HttpServletResponse response,
				@RequestBody String json){
		 response.setContentType("text/html;charset=utf-8");
		 Map<String,String>map = JsonMap.JsonMap(json); 
	     Fassets fassets = new Fassets(); 
		 try {
			fassets = MapToBean.mapToBean(fassets, map);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 fixedService.deleteFixed(fassets);
		 HttpReturn.reponseBody(response, "操作成功，等待审核");
		 
	 }
	 /**
	  * 固定资产查询
	  * 查询方式分为全部查找及部分查找，Json的key为“searchWay”,value为“1|2|3”；
	 *1为全部查找，2为按编号查找，3为按姓名查找。
	  */
	 @RequestMapping(value="/fixedSearch",method=RequestMethod.POST)
		@ResponseBody
	 public void fixedSearch(HttpServletRequest request,HttpServletResponse response,
				@RequestBody String json){
		 response.setContentType("text/html;charset=utf-8");
		 Map<String,String>map = JsonMap.JsonMap(json); 
		    String jsons;
			String searchWay = map.get("searchWay");
			List<Fassets>fassetsList = new ArrayList<Fassets>();
			if(searchWay.equals("1")){
				fassetsList = fixedService.selectAll();
			    
			}else if(searchWay.equals("2")){
				String id = map.get("fcode");
				fassetsList = fixedService.likeSelectById(id);
				 
			}else{
				String fname = map.get("fname");
				fassetsList = fixedService.likeSelectByname(fname);
			}
			
			if(fassetsList==null){
				HttpReturn.reponseBody(response, "未查询到有效信息");
			}else{
				 jsons = JSON.toJSONString(fassetsList); 
				 HttpReturn.reponseBody(response, jsons);
			}
	 }
	 /**
	  * 固定资产修改
	  * 除编号其他均可修改
	  */
	 @RequestMapping(value="/fixedChange",method=RequestMethod.POST)
		@ResponseBody
	 public void fixedChange(HttpServletRequest request,HttpServletResponse response,
				@RequestBody String json){
		 response.setContentType("text/html;charset=utf-8");
		 Map<String,String>map = JsonMap.JsonMap(json); 
		 Fassets fassets = new Fassets();
		 try {
			fassets = MapToBean.mapToBean(fassets, map);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 fixedService.fixedChange(fassets);
		 HttpReturn.reponseBody(response, "修改成功");
		 
	 }
	 
	 /**
	  * 上游厂家结算
	  */
	 @RequestMapping(value="/upstreamSettlement",method=RequestMethod.POST)
		@ResponseBody
	 public void upstreamSettlement(){
		 
	 }
	 /**
	  * 货运结算
	  */
	 @RequestMapping(value="/freightSettlement",method=RequestMethod.POST)
		@ResponseBody
      public void freightSettlement(){
		 
	 }
	 /**
	  * 下游买家结算
	  */
	 @RequestMapping(value="/downstreamSettlement",method=RequestMethod.POST)
		@ResponseBody
      public void downstreamSettlement(){
		 
	 }
	 /**
	  * 支出账单
	  */
	 @RequestMapping(value="/spendingBills",method=RequestMethod.POST)
		@ResponseBody
      public void spendingBills(){
 		 
 	 }
	 /**
	  *  收入账单
	  */
	 @RequestMapping(value="/revenueBills",method=RequestMethod.POST)
		@ResponseBody
      public void revenueBills(){
 		 
 	 } 
	 /**
	  * 赊欠记录
	  */
	 @RequestMapping(value="/creditRecord",method=RequestMethod.POST)
		@ResponseBody
     public void creditRecord(){
 		 
 	 }
	 /**
	  * 赊欠自动抵扣
	  */
	 @RequestMapping(value="/creditDeduction",method=RequestMethod.POST)
		@ResponseBody
     public void creditDeduction(){
 		 
 	 }
	 
	 /**
	  * 与此对应的是需要下载一个文件的功能
	  * 查询存档
	  * 查看的方式：查看某个编号的文件，或者某个文件名的文件，或者是全部，或者是某段时间上传的文件
	  * 查看文件编号 前台需要传来的数据包括 fcode,searchWay:1
	  * 按文件名查看包括文件的：fname,searchWay:2
	  * 全部查看：searchWay:3
	  * 某段时间查看包括：searchWay:4 startDay:****-**-**,endeDay
	  * 
	  */
	 @RequestMapping(value="/queryArchive",method=RequestMethod.POST)
		@ResponseBody
	 public void queryArchive(HttpServletRequest request,HttpServletResponse response,@RequestBody String json){
 		 Map<String,String>map = JsonMap.JsonMap(json);
 		 String searchWay = map.get("searchWay");
 		 List<FileRecord>list = new ArrayList<FileRecord>();
 		 if(searchWay.equals("1")){
 		   list = archiveService.likeSelectById(map.get("fcode"));
 		 }else if(searchWay.equals("2")){
 			list = archiveService.likeSelectByName(map.get("fname"));
 
 		 }else if(searchWay.equals("3")){
 			list = archiveService.selectAll(); 
 		 }else if(searchWay.equals("4")){
 			 list = archiveService.selectByDay(map.get("startDay"),map.get("endDay"));
 		 }
 		 
 		 if(list==null){
 			 HttpReturn.reponseBody(response,"无结果");
 		 }else{
 			 String jsons = JSON.toJSONString(list);
 			 HttpReturn.reponseBody(response,jsons);
 		 }
  	 }
	 /**
	  * 添加存档
	  */
	 @RequestMapping(value="/addArchive",method=RequestMethod.POST)
		@ResponseBody
     public void addArchive(MultipartFile file, HttpServletRequest request, HttpServletResponse response){
			response.setContentType("text/html;charset=utf-8");
			String path = "D:\\Logistics";
			String fileLevel = file.getOriginalFilename();
			String ftype = (String)request.getParameter("ftype");
			String fcode = (String)request.getParameter("fcode");
			
			FileRecord fileRecord = new FileRecord();
			fileRecord = archiveService.getFileRecordById(fcode);
			if(fileRecord!=null){
				HttpReturn.reponseBody(response, "文件编号已经存在");
			}else{
			
			if(ftype.equals("合同")){
				path = path+"\\"+"合同";
			}else if(ftype.equals("票据")){
				path=path+"\\"+"票据";
			}else if(ftype.equals("其他")){
				path=path+"\\"+"其他";
			}
			 
			String fileName = fileLevel;
			String allPath = path + "\\" + fileName;
			File dir = new File(path, fileName);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			// MultipartFile自带的解析方法
			try {
				file.transferTo(dir);
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			archiveService.addFileRecord(request,response,allPath,fileName);
			HttpReturn.reponseBody(response, "保存成功");
		}
			
   	 }
	 /**
	  * 删除存档
	  */
	 @RequestMapping(value="/deleteArchive",method=RequestMethod.POST)
		@ResponseBody
     public void deleteArchive(HttpServletRequest request,HttpServletResponse response,@RequestBody String json){
 		 Map<String,String> map = JsonMap.JsonMap(json);
 		archiveService.deleteFileRecord(map);
 		HttpReturn.reponseBody(response, "删除成功");
   	 }
	 /**
	  * 修改存档
	  */
	 @RequestMapping(value="/changeArchive",method=RequestMethod.POST)
		@ResponseBody
     public void changeArchive(MultipartFile file, HttpServletRequest request, HttpServletResponse response){
			response.setContentType("text/html;charset=utf-8");
			String path = "D:\\Logistics";
			String fileLevel = file.getOriginalFilename();
			String ftype = (String)request.getParameter("ftype");
			String fcode = (String)request.getParameter("fcode");
			String fileName = fileLevel;
			String allPath = path + "\\" + fileName;
			archiveService.changeFileRecord(request,response,allPath,fileName);
			 {
			
			if(ftype.equals("合同")){
				path = path+"\\"+"合同";
			}else if(ftype.equals("票据")){
				path=path+"\\"+"票据";
			}else if(ftype.equals("其他")){
				path=path+"\\"+"其他";
			}
			 
			 
			File dir = new File(path, fileName);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			// MultipartFile自带的解析方法
			try {
				file.transferTo(dir);
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpReturn.reponseBody(response, "保存成功");
		}
			
   	 }
	 
	 /**
	  * 文件下载
	 * @throws IOException 
	  */
	 @RequestMapping(value="/downloadFile",method=RequestMethod.GET)
		@ResponseBody
     public void downloadFile(HttpServletRequest request, HttpServletResponse response ,@RequestBody String json) throws IOException{
			response.setContentType("text/html;charset=utf-8");
		 Map<String,String>map=JsonMap.JsonMap(json); 
			 String fcode =map.get("fcode");	 
			 archiveService.downLoadFile(fcode,response);
			HttpReturn.reponseBody(response, "保存成功");
		
			
   	 }
	 
	 /**
	  * 赊信额度管理
	  */
	 @RequestMapping(value="/creditLimitsManage",method=RequestMethod.GET)
		@ResponseBody
     public void creditLimitsManage(){
 		 
   	 }
}
