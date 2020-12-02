package string2Equation.calculator.irvingluna;

import java.util.ArrayList;

public class String2EquationParanthesis implements String2Equation {
	
	public String subEquation(String equation) {
		String subequation = "";
		// number of opening paranthesis - '('
		int j = 1;
		for(int i = 1; i < equation.length(); i++) {
			char ch = equation.charAt(i);
			if(ch == '(') {
				j++;
			} else if (ch == ')') {
				j--;
			}
			if(j == 0) {
				break;
			}
			subequation = subequation + Character.toString(ch);
		}
		return subequation;
	}
	
	public int iCorrector(String equation) {
		return equation.length() + 1;
	}
	
	public boolean missingOperator(ArrayList<String> equation) {
		if(equation.size() < 1)
			return false;
		String lastblock =equation.get(equation.size()-1);
		if(lastblock.equals("^") || lastblock.equals("*") 
				|| lastblock.equals("/") || lastblock.equals("+") 
				|| lastblock.equals("-"))
			return false;
		return true;
	}
}
