package com.demo.mapper;

import java.util.List;

import com.demo.model.Emp;

public interface EmpMapper {

	
	public List<Emp> findemps();
	public Emp getEmpById(Integer eid);
}
