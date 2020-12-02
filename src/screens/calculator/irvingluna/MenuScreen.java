package screens.calculator.irvingluna;

import states.calculator.irvingluna.ScreenState;

public class MenuScreen implements Screen {
	
	private ScreenState calculator;
	
	public MenuScreen(ScreenState calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void show() {
		System.out.println("Enter the number of your choice and press enter.\n\nMenu:\n"
				+ "\t1) Calculator\n"
				+ "\t2) How to Use this Calculator\n"
				+ "\t3) About Dev\n"
				+ "\t4) Quit\n"
				+ "Enter option: ");

	}

	@Override
	public void userInput(String userinput) {
		switch(userinput) {
			case "1": calculator.setState(calculator.getCalculationScreenState());
			break;
			case "2": calculator.setState(calculator.getHowToScreenState());
			break;
			case "3": calculator.setState(calculator.getAboutScreenState());
			break;
			case "4": calculator.setState(calculator.getClosingScreenState());
			break;
			default: System.out.println("Invalid Option");
		}
	}

}
