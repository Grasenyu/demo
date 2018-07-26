package com.gsy.demo.mapper;

import java.util.List;

import com.gsy.demo.vo.Employee;
import com.gsy.demo.vo.Workhistory;

public interface EmpMapper {
	
	List<Employee> allemp();
	
	void add(Workhistory work);
	
	

}
