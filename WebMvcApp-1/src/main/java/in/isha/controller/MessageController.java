package in.isha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MessageController {
 
	@GetMapping("/fluffy")
	public ModelAndView getMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","welcome guys...");
		mav.setViewName("message");
		return mav;
			}
}
