package com.example.webpackdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@SpringBootApplication
public class WebpackDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebpackDemoApplication.class, args);
	}

	@GetMapping("/pageA")
	String pageA(Model model){
		model.addAttribute("data", "query data from java server");
		model.addAttribute("data2", "{a:123,c:789}");
		return "pageA";
	}
}
