package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.member.model.MemberDAOimpl;
import com.member.model.MemberDTO;

public class MemberList extends AbstractController{

	private MemberDAOimpl dao;

	public void setDao(MemberDAOimpl dao) {
		this.dao = dao;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		List<MemberDTO> userlist = dao.getMemberList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("userlist",userlist);
		mv.setViewName("WEB-INF/jsp/list.jsp");
		return mv;
	}

}
