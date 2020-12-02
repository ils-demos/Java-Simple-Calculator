package operations.calculator.irvingluna;
import java.util.ArrayList;

public class ExponentOperation extends CalculatorOperation {
	
	@Override
	protected double binaryOperation(ArrayList<String> operator) {
		double total = 1;
		double value1 = Double.parseDouble(operator.get(0).toString());
		double value2 = Double.parseDouble(operator.get(2).toString());
		for(int i = 0; i < value2; i++)
			total *= value1;
		return total;
	}

	@Override
	public boolean isOperationAllowed(String operation) {
		if(operation.equals("^"))
			return true;
		return false;
	}
}
