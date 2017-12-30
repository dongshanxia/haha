package cn.xuchenbing.teac.util;

import java.util.UUID;

public class MyUtil {

	

	
	public static boolean IsEmpty(Object obj){
		
		
		if (obj == null && "".equals(obj)) {
			//do something
			return true;
		}
		
		
	    return false;
		
		
		
	}
}
