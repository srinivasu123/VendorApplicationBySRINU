package com.app.Util;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
@Component
public class VendorUtil {
	
	
	
	public List<String> getVendorTypes(){
		return Arrays.asList("CONTRACT","FULLTIME","PARTTIME");
	}
	
	public List<String> getVendorIdTypes(){
		return Arrays.asList("PAN","AADHAR","VOTERID","OTHERS");
	}
	
	
	public void addUiComponents(ModelMap map){
		map.addAttribute("venTypesList", getVendorTypes());
		map.addAttribute("venIdTypesList", getVendorIdTypes());
	}
	
	public void generatePie(String path, List<Object[]> list){
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[] ob:list){
			dataset.setValue(ob[0].toString(), new Double( ob[1].toString()));
			JFreeChart chart=ChartFactory.createPieChart3D("Vendor Report", dataset,true,true,false);
			try {
				ChartUtilities.saveChartAsJPEG(new File(path+"/VendorPieA.jpg"), chart,250,250);
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			
		}
	
	}
	public void generateBarChart(String path, List<Object[]> list){
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		for(Object[] ob:list){
			dataset.setValue(new Double(ob[1].toString()), ob[0].toString()," ");
			JFreeChart chart=ChartFactory.createBarChart3D("Vendor Report", "Vendor Type", "COUNT", dataset);
			try {
				ChartUtilities.saveChartAsJPEG(new File(path+"/VendorBarB.jpg"), chart,250,250);
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			
		}
		
	}

}
