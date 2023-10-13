package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commondataformodel(Model m) {
		m.addAttribute("Header", "Learn Code with Hawk");
		m.addAttribute("Desc", "Home For Programmer");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handelForm(@ModelAttribute("user") User user,Model model) {
		System.out.println(user);
		this.userService.createUser(user);
		return "success";
	}
}
/* @RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handelForm(@RequestParam(name = "email", required = true) String userEmail,
			@RequestParam("userName") String userName, @RequestParam("password") String userPassword, Model model) {
		User user=new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		System.out.println(user);
//		System.out.println("user email" + userEmail);
//		System.out.println("user name" + userName);
//		System.out.println("user password" + userPassword);
		//process
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
		model.addAttribute("user",user);
		return "success";
	}
}
*/