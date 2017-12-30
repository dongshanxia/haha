package cn.xuchenbing.teac.web;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xuchenbing.teac.entity.AppResult;
import cn.xuchenbing.teac.entity.Contact;
import cn.xuchenbing.teac.entity.Education;
import cn.xuchenbing.teac.entity.News;
import cn.xuchenbing.teac.entity.Page;
import cn.xuchenbing.teac.entity.Profession;
import cn.xuchenbing.teac.entity.User;
import cn.xuchenbing.teac.entity.Work;
import cn.xuchenbing.teac.service.ContactService;
import cn.xuchenbing.teac.service.EducationService;
import cn.xuchenbing.teac.service.NewsService;
import cn.xuchenbing.teac.service.ProfessionService;
import cn.xuchenbing.teac.service.UserService;
import cn.xuchenbing.teac.service.WorkService;
import cn.xuchenbing.teac.util.MyUtil;




@Controller
@RequestMapping("/app")
public class appAction {

	
	@Resource
	private UserService userService;    //联系方式
	@Resource
	private ContactService contactService;    //联系方式
	@Resource
	private EducationService educationService;  //教育经历
	@Resource
	private NewsService newsService;  //新闻报告
	@Resource
	private WorkService workService; //工作经历
	@Resource
	private ProfessionService professionService; //职称
	
	

	
	
	
	@RequestMapping("/teac_teac")
	public String teac_teac(String id,HttpSession httpSession){
		System.out.println("---action.account");
		
		User user = new User();
		user.setUserId(id);
		User userSession = userService.selectByPrimaryKey(user);
		httpSession.setAttribute("userSession", userSession);

			return "/app/home/teac_home";
		
	}
	
	@RequestMapping("/teac_top")
	public String teac_top(){
		
		System.out.println("---action.account");
		
	
			return "/app/home/top";
		
	}
	
	
	@RequestMapping("/teac_select")
	@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
	public Object teac_select(String userId){		
		System.out.println("---action.json");

		ArrayList<String> ResultList = new ArrayList<String>();
		
		HashMap<String,Object> ResultMap = new HashMap<>();
		
		List<Contact> contactResult = contactService.selectResult(userId);
		if (contactResult.size()>0) {
			ResultList.add("contactResult");
			ResultMap.put("contactResult", contactResult);
		}
		
		List<Education> educationResult = educationService.selectResult(userId);		
		if (educationResult.size()>0) {
			ResultList.add("educationResult");
			ResultMap.put("educationResult", educationResult);
		}
		
		List<News> newsResult = newsService.selectResult(userId);
		if (newsResult.size()>0) {
			ResultList.add("newsResult");
			ResultMap.put("newsResult", newsResult);
		}
		
		List<Work> workResult = workService.selectResult(userId);
		if (workResult.size()>0) {
			ResultList.add("workResult");
			ResultMap.put("workResult", workResult);
		}
		
		List<Profession> professionResult = professionService.selectResult(userId);
		if (professionResult.size()>0) {
			ResultList.add("professionResult");
			ResultMap.put("professionResult", professionResult);
		}
		ResultMap.put("ResultList", ResultList);
		return ResultMap;
		
	}
	
	
	
	
	//主页面的科学研究
	@RequestMapping("/teac_kxyj")
	public String teac_kxyj(){
		System.out.println("-teac_kxyj--action.account");
			return "/app/home/teac_kxyj";
		
	}
	//主页面的个人主页
	@RequestMapping("/teac_home")
	public String teac_home(){
		System.out.println("---action.account");
			return "/app/home/teac_home";	
	}
	
	//主页面的论文专著
	@RequestMapping("/teac_lwzz")
	public String teac_lwzz(){
		System.out.println("---action.account");
			return "/app/home/teac_lwzz";	
	}
	
	//主页面的科研团队、teac_kytd
	@RequestMapping("/teac_kytd")
	public String teac_kytd(){
		System.out.println("---action.account");
			return "/app/home/teac_kytd";	
	}
}
