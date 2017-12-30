package cn.xuchenbing.teac.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppResult<T> implements Serializable {


	private static final long serialVersionUID = 337297181251071639L;
	


	private T paramEntity;//多条件查询
	private List<T> resultList = new ArrayList<T>() ;
	
	
	
	public T getParamEntity() {
		return paramEntity;
	}
	public void setParamEntity(T paramEntity) {
		this.paramEntity = paramEntity;
	}
	
	public List<T> getResultList() {
		return resultList;
	}
	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	



}
