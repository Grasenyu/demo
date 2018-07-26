package com.gsy.demo.handler;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gsy.demo.service.IEmpService;
import com.gsy.demo.vo.Workhistory;

@Controller
public class Emphanlder {
	
	@Autowired
	IEmpService service;
	
	@RequestMapping("/all")
	public String getall(Map map) {
		map.put("emp",service.allemp());
		return "main";
	}
	@RequestMapping("/add")
	public String add(Integer eid ,HttpServletRequest request) {
		
		request.setAttribute("eid", eid);
		
		return "add";
	}
	
	@RequestMapping("/addwork")
	public String addwork(Workhistory work) {
		work.setChangeDate(new Date().toString());
		service.add(work);
		return "redirect:main.gsy";
		
	}
	
}
