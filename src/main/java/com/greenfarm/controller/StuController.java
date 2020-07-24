package com.greenfarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.greenfarm.DAO.StudentDAO;
import com.greenfarm.domain.Student;

@Controller
public class StuController {

	@Autowired
	StudentDAO studao;

	@RequestMapping("/")
	public ModelAndView createStudent() {
		Student stu=new Student();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject(stu);
		return mv;
	}

	@RequestMapping("/display")
	public String studentList(@ModelAttribute("student") Student student,Model model) {
		List<Student> stuList;
		String viewName=null;
		boolean res = studao.createStudent(student);
		if(res)
		{
			stuList=studao.listStudent();
			model.addAttribute("stuList",stuList);
			viewName="display";
		}
		else
		{
			viewName="index";
		}
		return viewName;
	}
}