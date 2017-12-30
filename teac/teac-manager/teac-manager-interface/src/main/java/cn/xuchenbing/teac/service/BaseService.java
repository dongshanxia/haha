package cn.xuchenbing.teac.service;

import java.util.List;

import cn.xuchenbing.teac.entity.AppResult;
import cn.xuchenbing.teac.entity.Page;


public interface BaseService<T> {
	//添加单个对象
	public int insert (T entity) throws Exception;
	

	//删除单个对象 
	int deleteByPrimaryKey(String id);
	
	//查询单个对象
	public T select(T entity);
	
	//通过关键字分页查询
	public Page<T> selectPage(Page<T> page); 
	
	
	//通过多条件分页查询
	public Page<T> selectPageUseDyc(Page<T> page); 
	
	//通过条件查询前台的数据
	public List<T> selectResult(String userId);
	
	//查询单个对象
	public T selectByPrimaryKey(T entity);
	
	
	int updateByPrimaryKey(T entity);
}
