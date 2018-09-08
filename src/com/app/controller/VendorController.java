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

import com.app.Service.IVendorService;
import com.app.Util.VendorUtil;
import com.app.model.Vendor;
@Controller
public class VendorController {
	@Autowired
	private IVendorService service;
	@Autowired
	private ServletContext context;
	@Autowired
	private VendorUtil util;
	
	@RequestMapping("/regVen")
	public String ShowVendorRegister(){
		return "VenReg";
	}
	@RequestMapping(value="/insertVen", method=RequestMethod.POST)
	public String SaveVendor(@ModelAttribute("vendor")Vendor ven, ModelMap map){
		int venId=service.SaveVendor(ven);
		String message="save with locid:"+venId;
		map.addAttribute("msg", message);
		return "VenReg";
	}
	@RequestMapping("/viewAllVendors")
	public String getAllvendors(ModelMap map){
		List<Vendor> ven=service.getAllVendors();
		map.addAttribute("vendors", ven);
		return "VendorData";
	}
	//4.
		@RequestMapping("/deleteVen")
		public String deleteVendor(@RequestParam("venId") int venId){
			service.DeleteVendor(venId);
			
			return "redirect:viewAllVendors";
		}
		//5.
		@RequestMapping(value="/editVen")
		public String ShowEditVendor(@RequestParam("venId")int venId,ModelMap map){
			Vendor ven=service.getVendorById(venId);
			map.addAttribute("ven", ven);

			util.addUiComponents(map);
			return"VendorDataEdit";
		}
		//6.
		@RequestMapping(value="/updateVendor",method=RequestMethod.POST)
		public String UpdateVendorDetails(@ModelAttribute("vendor")Vendor ven){
			
			service.UpdateVendor(ven);
			
			return"redirect:viewAllVendors";
			
		}
		//7.
		@RequestMapping("/VenExcelExport")
		public String ShowVendorExcelview(ModelMap map){
			List<Vendor> ven=service.getAllVendors();
			map.addAttribute("vens", ven);
			return "VendorExcelViewName";
		}
		//8.
		@RequestMapping("/VendorPdfExport")
		public String ShowVendorPdfView(ModelMap map){
			List<Vendor> ven=service.getAllVendors();
			map.addAttribute("vens",ven);
			return"VendorPdfViewName";
			
		}
		//9.Show Vendor Chart
				@RequestMapping("/ShowVendorReport")
				public String generateReport(){
					List<Object[]> list=service.getVendorType();
					String path=context.getRealPath("/");
					util.generatePie(path, list);
					util.generateBarChart(path, list);
					return "VendorReport";
				}
	

}
