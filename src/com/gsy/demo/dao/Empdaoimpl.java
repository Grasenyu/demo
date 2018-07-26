package com.gsy.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gsy.demo.mapper.EmpMapper;
import com.gsy.demo.vo.Employee;
import com.gsy.demo.vo.Workhistory;


@Repository("dao")
public class Empdaoimpl implements Empdao{

	@Autowired
	EmpMapper empMapper;
	
	
	@Override
	public List<Employee> allemp() {
		// TODO Auto-generated method stub
		return empMapper.allemp();
	}


	@Override
	public void add(Workhistory work) {
		
		empMapper.add(work);
		
	}

}
