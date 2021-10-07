package com.grupo.estudos.calculator.dto;

public class CalculationRequest {
	
	private Integer firstOperator;
	private Integer secondOperator;
	private String operator;
	
	public Integer getFirstOperator() {
		return firstOperator;
	}
	public void setFirstOperator(Integer firstOperator) {
		this.firstOperator = firstOperator;
	}
	public Integer getSecondOperator() {
		return secondOperator;
	}
	public void setSecondOperator(Integer secondOperator) {
		this.secondOperator = secondOperator;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	

}
