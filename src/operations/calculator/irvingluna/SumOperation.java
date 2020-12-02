package operations.calculator.irvingluna;
import java.util.ArrayList;

public class SumOperation extends CalculatorOperation {
	
	protected double binaryOperation(ArrayList<String> operator) {
		double value1 = Double.parseDouble(operator.get(0).toString());
		double value2 = Double.parseDouble(operator.get(2).toString());
		switch(operator.get(1).toString()) {
			case "+": return value1 + value2;
			case "-": return value1 - value2;
		}
		return 0.0;
	}
	
	public boolean isOperationAllowed(String symbol) {
		if(symbol.equals("+") || symbol.equals("-"))
			return true;
		return false;
	}
}
