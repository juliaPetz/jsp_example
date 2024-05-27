package htl4.example.sbjsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping({"/","index"})
	public String index(Model model) {
		String message = "Hello Spring Boot + JSP";
		model.addAttribute("message", message);
		return "index";
	}
	
	@GetMapping({"/name"})
	public String namePage(Model model) {
		String firstName = "Julia";
		model.addAttribute("firstName", firstName);
		return "name";
	}
	
}
