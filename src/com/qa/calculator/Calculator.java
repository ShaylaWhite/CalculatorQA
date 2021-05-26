package com.qa.calculator;

public class Calculator {

	public static void main(String[] args) {
	
		System.out.println(Operators.add(1,3));
		
		//accesses the Operator Classes methods	
		
		 Results.displayResults(); 
		 Results.displayExamOverall(); 


		}	
	
		
	
	
	public static int add(int num1, int num2) {
		
	return num1 + num2;

}

}