package aadilkhan7.Test_Project_1.Register;
import java.awt.PageAttributes.MediaType;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aadilkhan7.Test_Project_1.User.User;
import aadilkhan7.Test_Project_1.User.UserService;

@RestController
public class RegisterController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	public ModelAndView registerPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.html");
		return mv;		
	}
	
	@RequestMapping(value = "/registerMe", method = RequestMethod.POST, consumes = "MediaType.APPLICATION_FORM_URLENCODED_VALUE")
	public ModelAndView registerMe(@RequestBody User user) {
		ModelAndView mv = new ModelAndView();
		userService.addUser(user);	
		mv.setViewName("success.html");		
		return mv;	
	}	
}