package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.member.model.MemberDAOimpl;

public class MemberDelete extends AbstractController{

	private MemberDAOimpl dao;

	public void setDao(MemberDAOimpl dao) {
		this.dao = dao;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
		String id = req.getParameter("id");
		dao.delete(id);
		return new ModelAndView("redirect:member_list.do");
	}
	
}
