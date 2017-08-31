package com.zhiyou100.mybits.model;

import java.util.Arrays;
import java.util.List;

public class Query {
   
	private Staff sta;
	 
	private  Integer[] integers;
	  
	private List<Integer>  list;
	 
	public Staff getSta() {
		return sta;
	}

	public void setSta(Staff sta) {
		this.sta = sta;
	}

	public Integer[] getIntegers() {
		return integers;
	}

	public void setIntegers(Integer[] integers) {
		this.integers = integers;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Query [sta=" + sta + ", integers=" + Arrays.toString(integers) + ", list=" + list + "]";
	}
	
	
	
	
	
	
	
	
	
}
