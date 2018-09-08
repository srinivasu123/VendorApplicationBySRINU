package com.app.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.Service.ICustomerService;
import com.app.Util.CoDecUtil;
import com.app.Util.CodeUtil;
import com.app.Util.CommonUtil;
import com.app.Util.CustomerUtil;
import com.app.model.Customer;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerService service;
	@Autowired
	private CustomerUtil util;
	@Autowired
	private ServletContext context;
	@Autowired
	private CodeUtil codeUtil;
	@Autowired
	private CoDecUtil coDecUtil;
	@Autowired
	private CommonUtil commonUtil;
	
	
	//1. show Customerpage in Browser
	@RequestMapping(value="/regCust")
	public String ShowCustomerPage(){
		
		return "CustomerRegister";
	}
	//2.Insert the data into db
	@RequestMapping("/insertCust")
	public String SaveCustomerData(@ModelAttribute("customer")Customer cust,ModelMap map){
	 
		
		
		//generate PWD,TOKEN
				String pwd=codeUtil.GenPWD();
				String token=codeUtil.GenToken();
			
				//encode pwd,token
				String encPwd=coDecUtil.doEncode(pwd);
				String encToken=coDecUtil.doEncode(token);
				
				//set encoded pwd,token to cust model object
				cust.setPassword(encPwd);
				cust.setAcctoken(encToken);
				
				//save cust object
				int custId=service.SaveCustomer(cust);
				
				//send email
				String text="Welcome to Customer : " +cust.getCustName()
						+" , your ID is  : "+cust.getCustEmail()
						+" , password is : "+pwd
						+" , Token is    : "+token
						+" , Type is     : "+cust.getCustType();
				
				boolean flag=commonUtil.sendEmail(cust.getCustEmail(), "Welcome to Customer", text);
				
				//final message
				String message="save with custid:"+custId;
				
				if(flag)
					message+=",Email also sent successfully";
				else
					message+=",Email sending failed";

				//send message to UI
		map.addAttribute("msg", message);
		
		return "CustomerRegister";
	}
	//3.show All Customers in Browser
	@RequestMapping(value="/ViewAllCustomers")
	public String getAllCustomers(ModelMap map){
		List<Customer> lists=service.getAllCustomers();
		map.addAttribute("customers", lists);
		return "CustomerData";
	}
	//4.delate Customer details
	@RequestMapping(value="/deleteCustomer")
	public String DeleteCustomer(@RequestParam("custId") int custId){
		service.DeleteCustomer(custId);
		
		
		return "redirect:ViewAllCustomers";
	}
	//5.Edit Customer Details
	@RequestMapping(value="/editCustomer")
	public String EditCustomerDetails(@RequestParam("custId") int custId,ModelMap map){
		Customer cust=service.getCustomerById(custId);
		
		

		map.addAttribute("cust", cust);
		return "CustomerDataEdit";
	}
	//6.Updated Customer Details
	@RequestMapping(value="/UpdateCustomer",method=RequestMethod.POST)
	public String UpdateCustomer(@ModelAttribute("customer")Customer cust){
		//generate PWD,TOKEN
				String pwd=codeUtil.GenPWD();
				String token=codeUtil.GenToken();
			
				//encode pwd,token
				String encPwd=coDecUtil.doEncode(pwd);
				String encToken=coDecUtil.doEncode(token);
				
				//set encoded pwd,token to cust model object
				cust.setPassword(encPwd);
				cust.setAcctoken(encToken);
				
				//save cust object
				
				service.UpdateCustomer(cust);
				//send email
				String text="Welcome to Customer : " +cust.getCustName()
						+" , your ID is  : "+cust.getCustEmail()
						+" , password is : "+pwd
						+" , Token is    : "+token
						+" , Type is     : "+cust.getCustType();
				
				boolean flag=commonUtil.sendEmail(cust.getCustEmail(), "Welcome to Customer", text);
				
				//final message
				String message="Email updated:"+cust;
				
				if(flag)
					message+=",Email Updated successfully";
				else
					message+=",Email sending failed";

				//send message to UI
		       // map.addAttribute("msg", message);
		
		return "redirect:ViewAllCustomers";
	}
	//7.Convert Db data into ExcelShhet
	@RequestMapping("/CustomerExcelExport")
	public String ShowExcelData(ModelMap map){
		List<Customer> cust=service.getAllCustomers();
		map.addAttribute("custs", cust);
		return"CustomerExcelViewName";
	}
	//8.
		@RequestMapping("/CustomerpdfExport")
		public String ShowPdfData(ModelMap map){
			List<Customer> cust=service.getAllCustomers();
			map.addAttribute("custs", cust);
			return"CustomerPdfViewName";
		
		}
		//9.Show Customer Chart
		@RequestMapping("/ShowCustomerReport")
		public String generateReport(){
			List<Object[]> list=service.getCustomerType();
			String path=context.getRealPath("/");
			util.generatePie(path, list);
			util.generateBarChart(path, list);
			return "CustomerReport";
		}
		
	

}
