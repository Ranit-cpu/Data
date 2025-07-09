package com.Ranit.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DataApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
		System.out.println("Application Started");
	}
	
	
	@GetMapping("/")
	public String home(){
		return "redirect:/index.html";
	}
}
