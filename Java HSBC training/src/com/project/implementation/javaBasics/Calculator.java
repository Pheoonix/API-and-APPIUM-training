package com.project.implementation.javaBasics;

public class Calculator {

	public static void main(String[] args) {
				double val1 =21.0d;
				double val2 =11.0d;
				char opCode ='d';
				double result;
				
				if(opCode == 'a')
					result = val1 + val2;
				else if(opCode == 's')
					result = val1 - val2;
				else if(opCode == 'd')
					result = val2 != 0.0d ? val1/val2 : 0.0d;
				else if(opCode == 'm')
					result = val1 * val2;
				else {
					System.out.println("Error: opCode is invalid!!!");
					result = 0.0d;
				}
				System.out.println(result);
			}

	}
