package com.recuritshool;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.recruitschool.hrd.common.HrdHttp;
import com.recruitschool.hrd.model.HrdService;

@Controller
public class RecruitController {

	private HrdService hrdService;
		
	public void setHrdService(HrdService hrdService) {
		this.hrdService = hrdService;
	}

	@RequestMapping("/test.do")
	public ModelAndView HrdDataList(){
		System.out.println("Áö³ª°¨");
		HrdHttp hrdHttp = new HrdHttp();
		List list = hrdService.hrdSelectAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		mav.addObject("list",list);
		return mav;
	}
}
