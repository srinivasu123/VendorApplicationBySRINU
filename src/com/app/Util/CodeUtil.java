package com.app.Util;

import java.util.UUID;

import org.springframework.stereotype.Component;
@Component
public class CodeUtil {
	/*public static void main(String[] args) {
		UUID ob=UUID.randomUUID();
		String str=ob.toString();
		String str1=str.replaceAll("-", "");
		String str2=str1.substring(0, 5);
		System.out.println(str2);
	}*/
	public String getCommonStr(int len){
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0, len);
	}
	public String GenPWD(){
		return getCommonStr(6);
		
	}
	public String GenToken(){
		return getCommonStr(8);
	}

}
