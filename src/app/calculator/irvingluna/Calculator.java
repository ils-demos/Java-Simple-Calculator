package app.calculator.irvingluna;
import java.util.ArrayList;

import operations.calculator.irvingluna.*;
import string2Equation.calculator.irvingluna.*;

public class Calculator {
	
	private ArrayList<CalculatorOperation> calculatorOperations;

	public Calculator() {
		calculatorOperations = new ArrayList<CalculatorOperation>();
		calculatorOperations.add(new ExponentOperation());
		calculatorOperations.add(new FactorOperation());
		calculatorOperations.add(new SumOperation());
	}
	
	public void calculate(String parameter) {
		if(parameter.equals("menu"))
			return;
		try {
			ArrayList<String> equationElements= str2equ(parameter.replaceAll("\\s+",""));
			ArrayList<String> results = pemdas(equationElements);
			System.out.println("results: " + results.get(0));	
		}
		catch(Exception e) {
			System.out.println("no input found");
		}
	}
	
	private ArrayList<String> pemdas(ArrayList<String> equation) {
		if(equation.size() == 1 && !isBreakable(equation.get(0)))
			return equation;
		for(int po = 0; po < calculatorOperations.size(); po++) {
			CalculatorOperation calculator = calculatorOperations.get(po);
			for(int i = 0; i < equation.size(); i ++) {
				String e = equation.get(i);
				if(isBreakable(e)) {
					String temp = pemdas(str2equ(e)).get(0);
					equation.set(i,temp);
				}
				if(calculator.isOperationAllowed(e)) {
					equation = calculator.operation(equation, i);
				}
			}
		}
		if(isBreakable(equation.get(0))) {
			equation = pemdas(str2equ(equation.get(0)));
		}
		return pemdas(equation);
	}

	private boolean isBreakable(String equation) {
		if(equation.length() <= 1 || isNumeric(equation))
			return false;
		return true;
	}

	public static boolean isNumeric(String equation) {
	    try {
	        Double.parseDouble(equation);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	private String2Equation getSubEquationType(String equation) {
		
		char ch = equation.charAt(0);
		
		if(ch == '(')
			return new String2EquationParanthesis();
		if(Character.isDigit(ch))
			return new String2EquationNumber();
		if(ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '^')
			return new String2EquationOperator();
		//if character is letter
		
		return null;
	}
	
	private ArrayList<String> str2equ(String equation) {
		
	    ArrayList<String> equationBlocks = new ArrayList<String>();
		String subEquation = "";
		String temp = "";
		String2Equation subEquationType = null;
		
		for(int i = 0; i < equation.length(); i++) {
			subEquation  = equation.substring(i, equation.length());
			subEquationType = getSubEquationType(subEquation);
			temp = subEquationType.subEquation(subEquation.toString());
			if(subEquationType.missingOperator(equationBlocks))
				equationBlocks.add("*");
			equationBlocks.add(temp);
			i += subEquationType.iCorrector(temp);
		}
		return equationBlocks;
	}
}