package com.rg.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rg.Service.ArchiveService;
import com.rg.Service.BillService;
import com.rg.Service.SalaryService;
import com.rg.Service.SheXinService;

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
	  * 查询存档
	  */
	 @RequestMapping(value="/queryArchive",method=RequestMethod.POST)
		@ResponseBody
	 public void queryArchive(){
 		 
  	 }
	 /**
	  * 添加存档
	  */
	 @RequestMapping(value="/addArchive",method=RequestMethod.POST)
		@ResponseBody
     public void addArchive(){
 		 
   	 }
	 /**
	  * 删除存档
	  */
	 @RequestMapping(value="/deleteArchive",method=RequestMethod.POST)
		@ResponseBody
     public void deleteArchive(){
 		 
   	 }
	 /**
	  * 修改存档
	  */
	 @RequestMapping(value="/changeArchive",method=RequestMethod.POST)
		@ResponseBody
     public void changeArchive(){
 		 
   	 }
	 /**
	  * 赊信额度管理
	  */
	 @RequestMapping(value="/creditLimitsManage",method=RequestMethod.POST)
		@ResponseBody
     public void creditLimitsManage(){
 		 
   	 }
}
