package cn.xuchenbing.teac.web;



import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xuchenbing.teac.entity.User;
import cn.xuchenbing.teac.service.UserService;
import cn.xuchenbing.teac.util.MyUUIDUtil;





@Controller
@RequestMapping("/register_login")
public class register_loginAction {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login_UI")
	public String login_UI(){
		System.out.println("---action.account");
		
			return "/loginUI";
		
	}
	
	@RequestMapping("/register_UI")
	public String Register_UI(){
		System.out.println("Register_UI "+"---action.account");
		
			return "/registerUI";
		
	}
	
	@RequestMapping("/selectEmail")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object selectEmail(String userEmail){
		System.out.println("--register-----" +userEmail);
		
		//为返回 封装数据
		
		Map<String,String> result  =  new HashMap<String,String>();
		
		//查询数据
		
			User user = userService.selectByEmail(userEmail);
			System.out.println("22"+user);
			
			if (user==null) {
				result.put("key", "no");
			}else {
				result.put("key", "yes");
			}
		
		
		
		
		return result;		
		
	}
	
	
	@RequestMapping("/register")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object register(User user){
		System.out.println("--register" +user);
		
		//为返回 封装数据
		
		Map<String,String> result  =  new HashMap<String,String>();
		//为user 设置id
		user.setUserId(MyUUIDUtil.getMyUUID());
		//保存数据
		try {
			userService.insert(user);
			result.put("key", "yes");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result.put("key", "no");
			
		}
		
		
		
		return result;		
		
	}
	
	
	@RequestMapping("/login")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object login(User user){
		System.out.println("--login" +user);
		
		//为返回 封装数据
		
		Map<String,String> result  =  new HashMap<String,String>();
		
		
		//保存数据	
		User userResult = userService.selectByEmailandPassword(user);
		
		if (userResult!=null) {
			result.put("key", "yes");
			result.put("id", userResult.getUserId());
			result.put("url", "http://localhost:8080/teac-manager-web/sys/teac_teac.action?id="+userResult.getUserId());
		}else {
			result.put("key", "no");
		}
			
		
		return result;		
		
	}
	/*
	 String path=CommonOperation.class.getResource("/").getPath();
	 InputStream fis = new FileInputStream(path+"Config.properties");
	 Properties prop = new Properties();
	 prop.load(fis);
	 fis.close();
	 return prop.getProperty(key);
	
	*/

	
	

}
