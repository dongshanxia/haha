package cn.xuchenbing.teac.mapper;

import cn.xuchenbing.teac.entity.TeacherNavbar;
import cn.xuchenbing.teac.entity.TeacherNavbarExample;
import cn.xuchenbing.teac.entity.User;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface TeacherNavbarMapper extends BaseMapper<TeacherNavbar>{
  
	
	
	
	List<TeacherNavbar> selectByUserIdANDorder(String userId);
}