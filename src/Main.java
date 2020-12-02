//This is a simple calculator application, it will allow the user to add,
//delete, subtract, and multiply
import java.util.Scanner;

import states.calculator.irvingluna.*;

public class Main {

	private ScreenState screen;
	private Scanner scanner;
	
	public Main() {
		
		screen = new ScreenState();
		scanner = new Scanner(System.in);
	}
	
	public void init(){
		String userInput = "";
		
		while(true) {
			screen.getState().show();
			userInput = scanner.nextLine();
			screen.getState().userInput(userInput);
		}
	}
	
	public void clearScreen() {  
		for (int i = 0; i < 50; ++i)
			System.out.println();

	} 

	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}

}
