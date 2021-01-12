package kr.green.test.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.Vo.UserVo;
import kr.green.test.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//객체를 새로생성하게 해주는것 오토와이얼드
	@Autowired
	private UserService userService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView openTilesView(ModelAndView mv) {
		mv.setViewName("/main/home");
		mv.addObject("setHeader","타일즈");
		return mv;
	}
		
	@RequestMapping(value = "/kk", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		
		String id = "abcd1234";
		String email = userService.getEmail(id);
		UserVo user = userService.getUser(id);
		System.out.println(email);
		System.out.println(user);
		mv.setViewName("/main/home");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv) {
		
		mv.setViewName("/main/login");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv,String username, String password) {
		
		UserVo isUser = userService.isUser(username, password);	
		mv.addObject("user", isUser);
		if(isUser != null) {
			mv.setViewName("redirect:/");			
		}else {
			mv.setViewName("redirect:/login");
		}
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView singupGet(ModelAndView mv) {
		mv.setViewName("/main/signup");
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView singupPost(ModelAndView mv, UserVo user) {
		boolean signup = userService.signup(user);
		if(signup) {
			mv.setViewName("redirect:/");			
		}else {
			mv.setViewName("redirect:/signup");
		}
		return mv;
	}
	//로그아웃 기능
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public ModelAndView singoutGet(ModelAndView mv, HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		mv.setViewName("redirect:/");
		return mv;
	}
}
