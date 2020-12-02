package screens.calculator.irvingluna;

import states.calculator.irvingluna.ScreenState;

public class ClosingScreen implements Screen {
	
	private ScreenState calculator;
	
	public ClosingScreen(ScreenState calculator) {
		this.calculator = calculator;
	}

	@Override
	public void show() {
		System.out.println("\n\n\nClosing Application...");
		System.exit(0);

	}

	@Override
	public void userInput(String scanner) {
		// TODO Auto-generated method stub

	}

}
