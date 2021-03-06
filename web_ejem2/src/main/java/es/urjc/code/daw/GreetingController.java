package es.urjc.code.daw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	
	@Autowired
	private UserService usersService;
	
	@RequestMapping("/greeting")
	public String greeting(Model model) {
		
		model.addAttribute("name", usersService.getNumUsers()+" users");
		
		return "greeting_template";
	}

}
