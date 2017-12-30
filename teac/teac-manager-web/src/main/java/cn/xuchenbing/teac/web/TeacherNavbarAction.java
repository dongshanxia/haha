package cn.xuchenbing.teac.web;



import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xuchenbing.teac.entity.TeacherNavbar;
import cn.xuchenbing.teac.entity.User;
import cn.xuchenbing.teac.service.TeacherNavbarService;
import cn.xuchenbing.teac.service.UserService;
import cn.xuchenbing.teac.util.MyUUIDUtil;





@Controller
@RequestMapping("/sys/TeacherNavbar")
public class TeacherNavbarAction {

	@Autowired
	private TeacherNavbarService teacherNavbarService;

	@RequestMapping("/update")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object update(TeacherNavbar teacherNavbar){
		System.out.println("--TeacherNavbar-----" +teacherNavbar);
		
	
		
		Map<String,String> result  =  new HashMap<String,String>();
		
		//插入数据		
		int update;
		try {
			update = teacherNavbarService.updateByPrimaryKey(teacherNavbar);
			if (update>0) {
				result.put("key", "yes");
			}else {
				result.put("key", "no");	
			}
		} catch (Exception e) {
			result.put("key", "no");
			e.printStackTrace();
		}			
		
		
		return result;		
		
	}
	
	@RequestMapping("/insert")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object insert(TeacherNavbar teacherNavbar){
		System.out.println("--TeacherNavbar-----" +teacherNavbar);
		
	
		String myUUID = MyUUIDUtil.getMyUUID();
		teacherNavbar.setTeacNavId(myUUID);
		teacherNavbar.setUserId("222");
		teacherNavbar.setTeacNavOrder(new Date());
		Map<String,String> result  =  new HashMap<String,String>();
		
		//插入数据		
		int insert;
		try {
			insert = teacherNavbarService.insert(teacherNavbar);
			if (insert>0) {
				result.put("key", "yes");
				result.put("teacNavId", myUUID);
			}else {
				result.put("key", "no");	
			}
		} catch (Exception e) {
			result.put("key", "no");
			e.printStackTrace();
		}			
		
		
		return result;		
		
	}

	@RequestMapping("/delete")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object delete(String id){
		System.out.println("--TeacherNavbar-----" +"delete");
		
	
		System.out.println(id);
		Map<String,Object> result  =  new HashMap<String,Object>();
		
		//查询数据			
		try {
			int deleteByPrimaryKey = teacherNavbarService.deleteByPrimaryKey(id);
			System.out.println(deleteByPrimaryKey);
			if (deleteByPrimaryKey>0) {
				result.put("key", "yes");		
			}else {
				result.put("key", "no");	
			}
		} catch (Exception e) {
			result.put("key", "no");
			e.printStackTrace();
		}			
		
		
		return result;		
		
	}
	
	@RequestMapping("/select")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object select(){
		System.out.println("--TeacherNavbar-----" +"select");
		
	
		
		Map<String,Object> result  =  new HashMap<String,Object>();
		
		//查询数据			
		try {
			List<TeacherNavbar> selectByUserIdANDorder = teacherNavbarService.selectByUserIdANDorder("222");
			if (selectByUserIdANDorder.size()>0) {
				result.put("key", "yes");
				result.put("TeacherNavbarList", selectByUserIdANDorder);
			}else {
				result.put("key", "no");	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result.put("key", "no");
			e.printStackTrace();
		}			
		
		
		return result;		
		
	}
	
	@RequestMapping("/teac_home")
	public String teac_home(){
		System.out.println("---action.account"+"teachernavbar  home");
		
			return "/home/teac_home";
		
	}
	

	
	

}
