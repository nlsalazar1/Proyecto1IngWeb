package org.techhub.SpringMVCMiniProject.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.techhub.SpringMVCMiniProject.model.AdminLogin;
import org.techhub.SpringMVCMiniProject.model.Student;
import org.techhub.SpringMVCMiniProject.service.StudentService;
import org.springframework.web.bind.annotation.*;
@Controller
public class HomeController {

	@Autowired
	StudentService studentService;
	
	List<Student> list;
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public String masterpage(AdminLogin login, Map map) {
		
		if(login.getName().equals("admin") && login.getPass().equals("admin"))
		{
			return "master";		
		}
		else
		{
			map.put("msg", "invalido username o password");
			return "home";
		}
	}
	
	
	@RequestMapping(value="/addstudent",method=RequestMethod.GET)
	public String addnewstudent() {
		return "addnewrecord";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveRecord(Student model, Map map) {
		
		boolean b = studentService.isAddStudent(model);
		if(b)
		{
			map.put("msg", "Record Save Success.....");
		}
		else
		{
			map.put("msg", "Some problem is there....");
		}
		return "addnewrecord";
	}
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewallrecord(Map map) {
		
		list=studentService.getAllStudents();
		map.put("studrecord", list);
		return "viewallrecord";
	}
	
	@RequestMapping(value="/del",method=RequestMethod.GET)
	public String deleteRecord(@RequestParam("userid") Integer id,Map map) {
		
		studentService.isDeleteById(id);
		list=studentService.getAllStudents();
		map.put("studrecord", list);
		return "viewallrecord";
	}
}
