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

import com.app.Service.ILocationService;
import com.app.Util.LocationUtil;
import com.app.model.Location;

@Controller
public class LocationController {
	@Autowired
	private ILocationService service;
	@Autowired
	private LocationUtil util;
	@Autowired
	private ServletContext context;
	
	//1.
	@RequestMapping(value="/regLoc")
	public String showReg(){
		return "LocReg";
	}
	
	//2.
	@RequestMapping(value="/insertLoc", method=RequestMethod.POST)
	public String SaveLocation(@ModelAttribute("location")Location loc, ModelMap map){
		int locId=service.SaveLocation(loc);
		String message="save with locid:"+locId;
		map.addAttribute("msg", message);
		return "LocReg";
	}
	
	//3.
	@RequestMapping("/viewAllLocs")
	public String getAllLocs(ModelMap map){
		List<Location> loc=service.getAllLocations();
		
		map.addAttribute("locations", loc);
		
		return "LocationData";
	}
	//4.
	@RequestMapping("/deleteLoc")
	public String deleteLocation(@RequestParam("locId") int locId){
		service.DeleteLocation(locId);
		
		return "redirect:viewAllLocs";
	}
	//5.
	@RequestMapping("/editLoc")
	public String ShowEditloc(@RequestParam("locId") int locId,ModelMap map){
		Location loc=service.getLocationById(locId);
		map.addAttribute("loc", loc);
		return "LocationDataEdit";
	}
	//6.
	@RequestMapping(value="/updateLoc", method=RequestMethod.POST)
	public String UpdateLcation(@ModelAttribute("location")Location loc){
		service.UpdateLocation(loc);
		return "redirect:viewAllLocs";
	}
	//7.
	@RequestMapping("/LocExcelExport")
	public String ShowExcelDate(ModelMap map){
		List<Location> locs=service.getAllLocations();
//		System.out.println(locs);
		map.addAttribute("locs", locs);
		return "LocExcelView";
		
	}
	//8.
	@RequestMapping("/LocpdfExport")
	public String ShowPdfData(ModelMap map){
		List<Location> locs=service.getAllLocations();
		map.addAttribute("locs", locs);
		return "LocPdfView";
	}
	//9. Show Location Chart
	@RequestMapping("/ShowLocReport")
	public String generateReport(){
		List<Object[]> list=service.getLocationType();
		String path=context.getRealPath("/");
		util.generatePie(path, list);
		util.generateBarChart(path, list);
		return "LocationReport";
	}

}
