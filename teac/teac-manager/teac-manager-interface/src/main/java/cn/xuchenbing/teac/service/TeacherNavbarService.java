package cn.xuchenbing.teac.service;


import java.util.List;
import java.util.Set;

import cn.xuchenbing.teac.entity.TeacherNavbar;



public interface TeacherNavbarService extends BaseService<TeacherNavbar>{
	/**
	 * 通过userid查询teacherNavbar集合
	 * @param userId
	 * @return
	 */
	List<TeacherNavbar> selectByUserIdANDorder(String userId);
	
	
}
