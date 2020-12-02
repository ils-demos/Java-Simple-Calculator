package screens.calculator.irvingluna;

import app.calculator.irvingluna.Calculator;
import states.calculator.irvingluna.ScreenState;

public class CalculatorScreen implements Screen {
	private ScreenState calculator;
	
	public CalculatorScreen(ScreenState calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void show() {
		System.out.println("Enter your equation and presss enter, or menu to return back to menu..\n\n");

	}

	@Override
	public void userInput(String userInput) {
		if(userInput.equals("menu")) {
			System.out.println("back to menu");
			calculator.setState(calculator.getMenuScreenState());
			return;
		}
		new Calculator().calculate(userInput);
	}
}
