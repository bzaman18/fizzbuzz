package com.kairos.fizzbuzz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author bzaman
 * @Description spring boot app to display fizzbuzz string given an integer number
 * @Date 26/02/2018
 */
@RestController
public class FizzBuzzController {
	
	private int fizz=3;
	private int buzz=5;

	
	@RequestMapping("/greeting")
	public String sayHi() {
		return "hi there, Are you Fizz or Buzz" ;
	}
	
	@GetMapping("/fizzbuzz")
	public String fizzBuzzMe(@RequestParam int num) {
		
		
		String output="";
		//check if num isnt zero
		if (num != 0) {
			
			//if num divisible by 3 then send fizz to frontend
			if(num % fizz==0) {
				output += "fizz";
			}
			//if num divisible by 5 then send buzz to frontend
		    if(num % buzz==0) {
				output += "buzz";			
			}
			
			//if num not divisible by 3 and 5 then send number to frontend
			if((num % fizz != 0) && (num % buzz != 0)) {
				output = String.valueOf(num);
			}
		}
		return output;
	}

}
