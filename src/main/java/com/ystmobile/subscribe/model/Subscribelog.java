package com.ystmobile.subscribe.model;

import java.util.Date;

public class Subscribelog {
	private int ID;
	private String phone;
	private String type;
	private Date createdate;
	private int DF;
	private int county_id;
	private String county_name;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public int getDF() {
		return DF;
	}
	public void setDF(int dF) {
		DF = dF;
	}
	public int getCounty_id() {
		return county_id;
	}
	public void setCounty_id(int county_id) {
		this.county_id = county_id;
	}
	public String getCounty_name() {
		return county_name;
	}
	public void setCounty_name(String county_name) {
		this.county_name = county_name;
	}
	
	

}
