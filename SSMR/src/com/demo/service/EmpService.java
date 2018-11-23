package com.demo.service;

import java.util.List;

import com.demo.model.Emp;

public interface EmpService {

	public List<Emp> findemp();
	public Emp getEmpById(Integer eid);
}
