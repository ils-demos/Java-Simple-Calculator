package screens.calculator.irvingluna;

import states.calculator.irvingluna.ScreenState;

public class HowToScreen implements Screen {
	
	private ScreenState calculator;
	
	public HowToScreen(ScreenState calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void show() {
		System.out.println("This is a simple calculator that computes the elementary arithmetics. This calculator\n"
				+ "supports (), ^, *, /, +, and subtraction. It uses Pemdas operations to compute the answer of the equation\n"
				+ "see examples below.\n"
				+ "\n"
				+ "Examples Addition and Subtraction\n"
				+ "\t To add values, enter: \n"
				+ "\t\t 12+12\n"
				+ "\t\t this will return \"result: 24\"\n"
				+ "\t To subtract values, enter: \n"
				+ "\t\t 12-10\n"
				+ "\t\t this will return \"result: 2\n"
				+ "\t To add and subtract multiple values, enter: \n"
				+ "\t\t 12+12-10\n"
				+ "\t\t this will return \"result: 14\n"
				+ "\t To subtract values, enter: \\n\"\n"
				+ "\t\t 12-10\\n\"\n"
				+ "\t\t this will return \"result: 2\"\n"
				+ "\n\n"
				+ "Examples Multiplication and Division\n"
				+ "\t To multiply values, enter: \n"
				+ "\t\t 12*12\n"
				+ "\t\t this will return \"result: 144\"\n"
				+ "\t To divide values, enter: \n"
				+ "\t\t 12/3\n"
				+ "\t\t this will return \"result: 4\n"
				+ "\t To multiply and divide multiple values, enter: \n"
				+ "\t\t 12*12/6\n"
				+ "\t\t this will return \"result: 24\n"
				+ "\t To subtract values, enter: \\n\"\n"
				+ "\t\t 12-10\\n\"\n"
				+ "\t\t this will return \"result: 2\"\n"
				+ "\n\n"
				+ "Examples exponents\n"
				+ "\t To factor exponents enter, enter: \n"
				+ "\t\t 2^(10)\n"
				+ "\t\t this will return \"result: 1024\"\n"
				+ "\t This will also work without paranthesis: \n"
				+ "\t\t 2^10\n"
				+ "\t\t this will return \"result: 1024\n"
				+ "\n\n"
				+ "Examples with Paranthesis\n"
				+ "\t To control order of operation, add operations inside of paranthesis, enter: \n"
				+ "\t\t 2*(2+2)\n"
				+ "\t\t this will return \"result: 8\"\n"
				+ "\t Equations with paranthesis and no operands will operate similar to multiplication: \n"
				+ "\t\t 2(10)\n"
				+ "\t\t this will return \"result: 20\n"
				+ "\n\n"
				+ "Examples with all operations\n"
				+ "\t Combine all operations: \n"
				+ "\t\t(12+12)*(12/12)\n"
				+ "\t\t this will return \"result: 24\n"
				+ "\t More complicated equation: \n"
				+ "\t\t (2+2)/2^2(2-2)-2*(2(2+2)2)\n"
				+ "\t\t this will return \"result: -32\"\n"
				+ "\n\n"
				+ "Enter any key to go back to menu\n"
				);
	}

	@Override
	public void userInput(String userInput) {
		System.out.println("Back to menu");
		calculator.setState(calculator.getMenuScreenState());
	}

}
