package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jedis.JedisClient;
import com.demo.jedis.JsonUtils;
import com.demo.mapper.EmpMapper;
import com.demo.model.Emp;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpMapper empmapper;
	@Autowired
	JedisClient jedisClient;
	
	@Override
	public List<Emp> findemp() {
		return empmapper.findemps();
	}
	@Override
	public Emp getEmpById(Integer eid) {
		Emp emp = null;
		String json_emp =null;
		/*********��������***********/
		boolean isempty=jedisClient.exists("emp_"+eid);
		if(isempty){
			//������
			
			json_emp=jedisClient.get("emp_"+eid);
			emp=JsonUtils.jsonToPojo(json_emp, Emp.class);
			System.out.println("�ӻ���ȡ����");
		}else{
			//����û��
			/********��ѯ�����ݿ�*************/
			emp=empmapper.getEmpById(eid);
			System.out.println("�����ݿ�ȡ����");
			json_emp= JsonUtils.objectToJson(emp);
			//���뻺��
			
			jedisClient.set("emp_"+emp.getEid(), json_emp);
			System.out.println("���뻺��");
		}
		
	
		
		
		return emp;
	}

}
