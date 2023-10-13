package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");

		model.addAttribute("name", "Aryan Yadav");
		model.addAttribute("id", 9700);
		List<String> friends = new ArrayList<String>();
		friends.add("rahul");
		friends.add("nitin");
		friends.add("mukesh");
		friends.add("gautami");
		model.addAttribute("f", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		// Creating model and view object
		ModelAndView modelview = new ModelAndView();
		// Setting the data
		modelview.addObject("name", "Firehawk");

		LocalDateTime now = LocalDateTime.now();
		modelview.addObject("time", now);
		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(90);
		list.add(78);
		list.add(91);
		modelview.addObject("marks", list);
		// Setting the view name
		modelview.setViewName("help");
		return modelview;
	}

}
