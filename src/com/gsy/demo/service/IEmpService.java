package com.gsy.demo.service;

import java.util.List;

import com.gsy.demo.vo.Employee;
import com.gsy.demo.vo.Workhistory;

public interface IEmpService {
	List<Employee> allemp();
	void add(Workhistory work);
}