package com.app.Util;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;
@Component
public class CoDecUtil {
	
	
	/*public static void main(String[] args) {
		//Encode
		String s="darling";
		byte[] a1=s.getBytes();
		byte[] arr=Base64.encodeBase64(a1);
		String s1=new String();
		System.out.println(s1);
		
		//Decode
		byte[] a3=s1.getBytes();
		byte[] s2=Base64.decodeBase64(a3);
		String s3=new String();
		System.out.println(s3);
		
	}
	*/
	
	
	public String doEncode(String str){
		byte[] arr=Base64.encodeBase64(str.getBytes());
		
		return new String(arr);
	}
	
	public String doDecode(String str){
		byte[] arr=Base64.decodeBase64(str.getBytes());
		
		return new String(arr);
		
	}

}
