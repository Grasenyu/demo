package com.gsy.demo.dao;

import java.util.List;

import com.gsy.demo.vo.Employee;
import com.gsy.demo.vo.Workhistory;

public interface Empdao {
	
	List<Employee> allemp();
	
	void add(Workhistory work);
	
}
