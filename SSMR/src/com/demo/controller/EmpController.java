package com.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.Emp;
import com.demo.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empservice;
	
	@RequestMapping("emps")
	public String list(Map<String,Object> map){
		
		List<Emp> emplist = empservice.findemp();
		map.put("emplist", emplist);
		return "list";
	}
	@RequestMapping(value="emp/{eid}",method=RequestMethod.GET)
	public String info(@PathVariable Integer eid,
			Map<String,Object> map){
		Emp emp = empservice.getEmpById(eid);
		map.put("emp", emp);
		return "info";
	}
	
	
}
