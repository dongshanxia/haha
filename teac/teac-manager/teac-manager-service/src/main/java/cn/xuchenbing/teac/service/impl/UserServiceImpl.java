package cn.xuchenbing.teac.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.xuchenbing.teac.entity.User;
import cn.xuchenbing.teac.service.UserService;




@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

		
		@Override
		public User selectByEmail(String email) {
			// TODO Auto-generated method stub
			return userMapper.selectByEmail(email);
		}

		@Override
		public User selectByEmailandPassword(User user) {
			// TODO Auto-generated method stub
			return userMapper.selectByEmailandPassword(user);
		}  
	   
	    
	    
	}

