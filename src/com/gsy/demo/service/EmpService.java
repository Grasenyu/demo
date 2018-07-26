package com.gsy.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gsy.demo.dao.Empdao;
import com.gsy.demo.vo.Employee;
import com.gsy.demo.vo.Workhistory;

@Repository("service")
public class EmpService implements IEmpService {

	@Autowired
	Empdao dao;
	
	@Override
	public List<Employee> allemp() {
		// TODO Auto-generated method stub
		return dao.allemp();
	}

	@Override
	public void add(Workhistory work) {
		
		dao.add(work);
		
	}

}
