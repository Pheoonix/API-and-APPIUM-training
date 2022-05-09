package com.project.implementations.constructors;

public class MathEquations {
//	public double leftVal;
//	public double rightVal;
//	public char opCode;
//	public double result;
	private double leftVal;
	private double rightVal;
	private char opCode;
	//private char opCode = 'a';
	private double result;
	
	public double getLeftVal() {return leftVal; }
	public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
	public double getRightVal() {return leftVal; }
	public void setRightVal(double rightVal) {this.rightVal = rightVal;}
	public char getOpCode() {return opCode; }
	public void setOpCode(char opCode) {this.opCode = opCode;}
	
	public MathEquations() {}
	
	public MathEquations(char opCode) {
		this.opCode = opCode;
	}
	public MathEquations(char opCode, double leftVal, double rightVal) {
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	public double getResult() {return result; }
	
	public void execute() {
		switch(opCode) {
		case 'a':
				result = leftVal + rightVal;
				break;
		case 's':
				result = leftVal - rightVal;
				break;
		case'd':
				result = rightVal != 0.0d ? leftVal/rightVal : 0.0d;
				break;
		case 'm':
				result = leftVal * rightVal;
				break;
		default: 
				System.out.println("Error: opCode is invalid!!!");
				result = 0.0d;
				break;
			}
	}
}
