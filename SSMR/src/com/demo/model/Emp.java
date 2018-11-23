package com.demo.model;

import java.util.Date;

public class Emp {

	private Integer eid; 
	private String ename; 
	private String sex;
	private Date hire;
	private Float sar; 
	private Integer did;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getHire() {
		return hire;
	}
	public void setHire(Date hire) {
		this.hire = hire;
	}
	public Float getSar() {
		return sar;
	}
	public void setSar(Float sar) {
		this.sar = sar;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	
	
}
