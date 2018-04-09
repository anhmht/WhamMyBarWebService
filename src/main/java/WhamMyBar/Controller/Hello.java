package WhamMyBar.Controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

	@RequestMapping("/Hello")
	public @ResponseBody String  Hello (HttpServletResponse  response)  {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		return "Ánh Mi";
	}
	
}
