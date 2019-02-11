package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class TestController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO 자동 생성된 메소드 스텁
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","controller에서 저장한 데이터");
		mv.setViewName("WEB-INF/jsp/result.jsp");
		return mv;
	}

}
