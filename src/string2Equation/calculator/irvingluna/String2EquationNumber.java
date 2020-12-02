package string2Equation.calculator.irvingluna;

import java.util.ArrayList;

public class String2EquationNumber implements String2Equation {

	@Override
	public String subEquation(String equation) {
		String number = equation.substring(0, 1);
		for(int i = 1; i < equation.length(); i++) {
			char ch = equation.charAt(i);
			if(!Character.isDigit(ch))
				break;
			number += equation.substring(i, i+1);
		}
		return number;
	}
	
	public int iCorrector(String equation) {
		return equation.length() - 1;
	}

	@Override
	public boolean missingOperator(ArrayList<String> equation) {
		if(equation.size() < 1)
			return false;
		String lastBlock =equation.get(equation.size()-1);
		if(!hasOperator(lastBlock))
			return true;
		return false;
	}
	
	private boolean hasOperator(String lastBlock) {
		if(lastBlock.equals("^") || lastBlock.equals("*") 
				|| lastBlock.equals("/") || lastBlock.equals("+") 
				|| lastBlock.equals("-"))
			return true;
		return false;
	}
}
