package string2Equation.calculator.irvingluna;

import java.util.ArrayList;

public class String2EquationOperator implements String2Equation {

	@Override
	public String subEquation(String equation) {
		return equation.substring(0, 1);
	}

	@Override
	public int iCorrector(String equation) {
		return 0;
	}

	@Override
	public boolean missingOperator(ArrayList<String> equation) {
		return false;
	}

}
