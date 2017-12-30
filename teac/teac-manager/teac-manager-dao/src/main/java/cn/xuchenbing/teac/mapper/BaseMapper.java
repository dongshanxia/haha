package cn.xuchenbing.teac.mapper;

import java.util.List;

import cn.xuchenbing.teac.entity.Page;
import cn.xuchenbing.teac.entity.TeacherNavbar;



public interface BaseMapper<T> {
	//添加单个对象
	public int insert(T entity);
	
	//查询单个对象
	public T select(T entity);
	
	//通过关键字分页查询数据列表
	public List<T> selectPageList(Page<T> page);
	
	//通过关键字分页查询，返回总记录数
	public Integer selectPageCount(Page<T> page);
	
	//通过关键字分页查询数据列表
	public List<T> selectPageListUseDyc(Page<T> page);
		
	//通过关键字分页查询，返回总记录数
	public Integer selectPageCountUseDyc(Page<T> page);
	
	//通过条件查询前台的数据
	public List<T> selectResult(String userId);

	//查询单个对象
	public T selectByPrimaryKey(T entity);
	
	//修改单个对象
	int updateByPrimaryKey(T entity);
	//删除单个对象 
	int deleteByPrimaryKey(String id);
}
