package com.capgemini.elearnings.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	class Hello {
		String greet = "Hello User ...";
		Date d = new Date();
		
		public String getGreet() {
			return greet;
		}
		public void setGreet(String greet) {
			this.greet = greet;
		}
		public Date getD() {
			return d;
		}
		public void setD(Date d) {
			this.d = d;
		}
		
		
	}	

	@GetMapping(path = "/")
	public Hello hello(){
		return new Hello();
	}
}
