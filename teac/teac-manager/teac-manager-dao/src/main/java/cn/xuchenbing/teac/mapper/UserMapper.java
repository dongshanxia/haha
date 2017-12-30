package cn.xuchenbing.teac.mapper;

import cn.xuchenbing.teac.entity.User;

public interface UserMapper extends BaseMapper<User>{
	
	
	
	User selectByEmail (String email);
	
	User selectByEmailandPassword(User user);
}