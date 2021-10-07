package com.grupo.estudos.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {
	
	int result;
	
	public int add(int number1, int number2) {
		result = number1 + number2;
		return result;
	}
	
	public int sub(int number1, int number2) {
		result = number1 - number2;
		return result;
	}
	
	public int mult(int number1, int number2) {
		result = number1 * number2;
		return result;
	}
	
	public int div(int number1, int number2) {
		result = number1 / number2;
		return result;
	}
	
}
