package com.grupo.estudos.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grupo.estudos.calculator.dto.CalculationRequest;
import com.grupo.estudos.calculator.service.CalculationService;

@Controller
public class CalculatorController {
	
	@Autowired
	private CalculationService calculationService;	

	 @GetMapping("/")
	    public String home(){
	        return "home";
	    }
	 @PostMapping("/")
	 public ModelAndView calculation(CalculationRequest request) {
		 
		 ModelAndView modelAndView = new ModelAndView("home");
		 
		 float result = 0;
		 
		switch(request.getOperator()) {
		 case "+" :
			 result = calculationService.add(request.getFirstOperator(), request.getSecondOperator());
			 break;
			 
		 case "-" :
			 result = calculationService.sub(request.getFirstOperator(), request.getSecondOperator());
			 break;
			 
		 case "*" :
			 result = calculationService.mult(request.getFirstOperator(), request.getSecondOperator());
			 break;
			 
		 case "/" :
			 result = calculationService.div(request.getFirstOperator(), request.getSecondOperator());
			 break;
		 }
		 
		modelAndView.addObject("result", result);
		
		 return modelAndView;
		 
		 		 
	 }
}
