package cn.xuchenbing.teac.util;

import java.util.UUID;

public class MyUUIDUtil {

	
	public static void main(String[] args) {
		  UUID uuid = UUID.randomUUID();
		  
	      System.out.println(uuid.toString().length());
	      System.out.println(uuid);
	      
	      System.out.println(uuid.toString().replaceAll("\\-", ""));

	      
	      
	}
	public static String  getMyUUID() 
	{
		
		
		
		return UUID.randomUUID().toString().replaceAll("\\-", "");
		
	}
	
	
}
