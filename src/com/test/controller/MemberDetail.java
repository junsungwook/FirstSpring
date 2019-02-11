package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.member.model.MemberDAOimpl;
import com.member.model.MemberDTO;

public class MemberDetail extends AbstractController{

	private MemberDAOimpl dao;

	public void setDao(MemberDAOimpl dao) {
		this.dao = dao;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
		String id = req.getParameter("id");
		MemberDTO user = dao.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",user);
		mv.setViewName("WEB-INF/jsp/view.jsp");
		return mv;
	}

}
