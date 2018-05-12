package com.test.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.pojo.User;
import com.test.service.TestService;

@Controller
public class TestController {

	@Resource
	private TestService testService;

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		String userId = request.getParameter("id");
		User user = this.testService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}

}
