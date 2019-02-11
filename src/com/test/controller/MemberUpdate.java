package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.member.model.MemberDAOimpl;
import com.member.model.MemberDTO;

public class MemberUpdate extends AbstractController{

	private MemberDAOimpl dao;

	public void setDao(MemberDAOimpl dao) {
		this.dao = dao;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
		MemberDTO user = new MemberDTO();
		user.setId(req.getParameter("id"));
		user.setPass(req.getParameter("pass"));
		user.setName(req.getParameter("name"));
		user.setAddr(req.getParameter("addr"));
		user.setMemo(req.getParameter("memo"));
		dao.update(user);
		return new ModelAndView("redirect:member_list.do");
		
	}

}
