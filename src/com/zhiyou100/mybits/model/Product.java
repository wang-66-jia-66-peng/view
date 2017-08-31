package com.zhiyou100.mybits.model;

public class Product {

	private int p_id;
	private int p_price;
	private String p_name;
	private int s_id;
	private Staff st;
	
	
	
	
	
	public Staff getSt() {
		return st;
	}
	public void setSt(Staff st) {
		this.st = st;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	
	@Override
	public String toString() {
		return "product [p_id=" + p_id + ", p_price=" + p_price + ", p_name=" + p_name + ", s_id=" + s_id + ", st=" + st
				+ "]";
	}
	
	
	
}
