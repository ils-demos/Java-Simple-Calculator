package string2Equation.calculator.irvingluna;

import java.util.ArrayList;

public interface String2Equation {
	public String subEquation(String equation);
	public int iCorrector(String equation);
	public boolean missingOperator(ArrayList<String> equation);
}
