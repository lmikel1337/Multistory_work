package net.javatutorial.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringTest1Application {
	
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "8====D";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringTest1Application.class, args);

	}
}
