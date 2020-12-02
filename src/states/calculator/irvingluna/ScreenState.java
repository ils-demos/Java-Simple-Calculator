package states.calculator.irvingluna;

import screens.calculator.irvingluna.*;

public class ScreenState {
	
	private Screen loadingScreen;
	private Screen menuScreen;
	private Screen calculatorScreen;
	private Screen howToScreen;
	private Screen aboutScreen;
	private Screen closingScreen;
	
	private Screen state;
	
	public ScreenState() {

		loadingScreen = new LoadingScreen(this);
		menuScreen = new MenuScreen(this);
		calculatorScreen = new CalculatorScreen(this);
		howToScreen = new HowToScreen(this);
		aboutScreen = new AboutScreen(this);
		closingScreen = new ClosingScreen(this);
		
		state = loadingScreen;
	}

	public Screen getState() {
		return this.state;
	}
	
	public void setState(Screen newState) {
		this.state = newState;
	}
	

	public Screen getLoadingScreenState() {
		return loadingScreen;
	}

	public Screen getMenuScreenState() {
		return menuScreen;
	}

	public Screen getCalculationScreenState() {
		return calculatorScreen;
	}

	public Screen getHowToScreenState() {
		return howToScreen;
	}

	public Screen getAboutScreenState() {
		return aboutScreen;
	}

	public Screen getClosingScreenState() {
		return closingScreen;
	}
}
