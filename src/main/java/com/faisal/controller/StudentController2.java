package com.faisal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.faisal.entity.StudentEntity;
import com.faisal.service.StudentService1;

@Controller
public class StudentController2 {

	@Autowired
	private StudentService1 studentservice;
	
	@RequestMapping("/addstudent")
	public String showstudentform(Model model)
	{
		StudentEntity student=new StudentEntity();
		model.addAttribute("student",student);
		return "AddStudent";
	}
	
	@RequestMapping("/saveProcess")
	public String saveProcess(@ModelAttribute("student")StudentEntity student,Model model)
	{
		studentservice.savestudentobj(student);
		
		return "redirect:/ListStudents";
	}
	
	@RequestMapping("/ListStudents")
	public String getallstudents(Model model)
	{
	List<StudentEntity> liststudent=studentservice.getAllStudents();
	model.addAttribute("theStudents",liststudent);
		return "liststudents";
	}
	
	@RequestMapping("/showUpdateForm")
	public String showUpdateForm(@RequestParam("id") Integer id,Model model)
	{
		StudentEntity stdent=findById(id);
		model.addAttribute("student",stdent);
		return "AddStudent";
	}
	
	private StudentEntity findById(Integer id)
	{
		
		StudentEntity se=studentservice.getStudenytObjById(id);
		return se;
	}
	
	@RequestMapping("/deleteRecord")
	public String deleteStudentObj(@RequestParam("id")Integer id)
	{
		StudentEntity stdentity=findById(id);
		studentservice.deleteStudentObj(stdentity);
		return "redirect:/ListStudents";
	}
	
	
}
