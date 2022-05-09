package com.project.implementations.constructors;

public class Main {

	public static void main(String[] args) {
//				double[] leftVals = {100.0d, 25.0d, 224.0d, 12.0d};
//				double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//				char[] opCodes = {'d', 'a', 's', 'm'};
//				double[] results = new double[opCodes.length]; //result will be same size as of opcodes
	//operation will be done with respective positioned elements like 100.0d division with50.0d			
		
//		MathEquations testEquation = new MathEquations();
//		testEquation.execute();
//		System.out.print("test=");
//		System.out.print(testEquation.getResult());
		MathEquations[] equations = new MathEquations[4];
		equations[0] = new MathEquations('d', 100.0d, 50.0d);
		equations[1] = new MathEquations('a', 25.0d, 92.0d);
		equations[2] = new MathEquations('s', 224.0d, 17.0d);
		equations[3] = new MathEquations('m', 12.0d, 3.0d);
		
//		for(int i = 0; i<opCodes.length; i++) {
//
//		}
				for(MathEquations equation : equations) {
					equation.execute();
					System.out.print("results = ");
					System.out.println(equation.getResult());
				}
	}
//	public static MathEquations create(double leftVal, double rightVal, char opCode) {
//		MathEquations equation = new MathEquations();
//		equation.setLeftVal(leftVal);
//		equation.setRightVal(rightVal);
//		equation.setOpCode(opCode);
//		return equation;
//	}

	}
