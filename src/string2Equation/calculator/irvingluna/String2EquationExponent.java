package string2Equation.calculator.irvingluna;

import java.util.ArrayList;

public class String2EquationExponent implements String2Equation {

	@Override
	public String subEquation(String equation) {
		// number of opening paranthesis - '('
		int j = 0;
		String subequation = equation.substring(0, 1);
		for(int i = 1; i < equation.length(); i++) {
			
			char ch = equation.charAt(i);
			
			if(ch == '(')
				j++;
			else if (ch == ')')
				j--;
			
			subequation = subequation + Character.toString(ch);
			
			if(j == 0)
				break;
		}
		return subequation;
	}
	
	public int iCorrector(String equation) {
		return equation.length()-1;
	}

	@Override
	public boolean missingOperator(ArrayList<String> equation) {
		return false;
	}
}
