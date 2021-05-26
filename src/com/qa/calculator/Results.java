package com.qa.calculator;

public class Results {

	public static double Physics = 130;
	public static double Chemistry = 100;
	public static double Biology = 112;
	public static double total = Physics + Chemistry + Biology; ; 
	public static double percentage;
	
	//we see public static double, which means that  
	//the return value from this method is a double.
	
	public static void displayResults() {
		System.out.println("Physics Grade:" + Physics);
		System.out.println("Chemistry Grade:" + Chemistry);
		System.out.println("Biology Grade:" + Biology);
				
		System.out.println("\nOverall Mark:" + total);
		
		System.out.println("Percentage:" + percentage);
			
	}
	
	public static double displayExamOverall() {
		
		return percentage = total * 100 / 450;
			
		}
	
	
}
