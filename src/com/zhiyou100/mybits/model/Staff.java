package com.zhiyou100.mybits.model;

import java.util.List;

public class Staff {

	 private int id;
	 private String name;
	 private int age;
	 private String address;
	 private List<Product> pd;
	 
	
	public List<Product> getPd() {
		return pd;
	}
	public void setPd(List<Product> pd) {
		this.pd = pd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "staff [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", pd=" + pd + "]";
	}

	
	
	
}
