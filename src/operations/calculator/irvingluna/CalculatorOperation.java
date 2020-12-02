package operations.calculator.irvingluna;
import java.util.ArrayList;

public class CalculatorOperation {
	public ArrayList<String> operation(ArrayList<String> equation, int i) {
		ArrayList<String> subEquation = new ArrayList<String>(equation.subList(i-1, i+2));
		double result = binaryOperation(subEquation);
		String result2String = String.format("%.2f", result);
		equation.set(i-1, result2String);
		equation.remove(i);
		equation.remove(i);
		return equation;
	}
	
	protected double binaryOperation(ArrayList<String> operator) {
		return 0.0;
	}
	
	public boolean isOperationAllowed(String operation) {
		return false;
	}
}
