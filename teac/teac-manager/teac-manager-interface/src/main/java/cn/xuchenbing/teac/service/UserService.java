package cn.xuchenbing.teac.service;


import cn.xuchenbing.teac.entity.User;



public interface UserService extends BaseService<User>{
	//public User getUserById(int userId);  
	
	User selectByEmail (String email);
	
	User selectByEmailandPassword(User user);
}
