package cn.xuchenbing.teac.service.impl;


import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import cn.xuchenbing.teac.entity.TeacherNavbar;
import cn.xuchenbing.teac.service.TeacherNavbarService;





@Service("teacherNavberService")
public class TeacherNavbarServiceImpl extends BaseServiceImpl<TeacherNavbar> implements TeacherNavbarService {

	@Override
	public List<TeacherNavbar> selectByUserIdANDorder(String userId) {
		// TODO Auto-generated method stub
		return teacherNavbarMapper.selectByUserIdANDorder(userId);
	}

		
		
	   
}

