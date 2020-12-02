package operations.calculator.irvingluna;
import java.util.ArrayList;

public class FactorOperation extends CalculatorOperation {

	@Override
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
		double value1 = Double.parseDouble(operator.get(0).toString());
		double value2 = Double.parseDouble(operator.get(2).toString());
		switch(operator.get(1).toString()) {
			case "*": return value1 * value2;
			case "/": return value1 / value2;
		}
		return 0.0;
	}

	@Override
	public boolean isOperationAllowed(String operation) {
		if(operation.equals("*") || operation.equals("/"))
			return true;
		return false;
	}

}
