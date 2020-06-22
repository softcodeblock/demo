package com.softcodeblock.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class movieServiceController {
	
	  @GetMapping("/movie")
	  String findMovie() {
	    return "Hi From Get Method";
	  }

}
