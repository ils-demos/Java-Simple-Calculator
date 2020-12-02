package screens.calculator.irvingluna;

import states.calculator.irvingluna.ScreenState;

public class AboutScreen implements Screen {
	private ScreenState calculator;
	
	public AboutScreen(ScreenState calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void show() {
		System.out.println("About the Dev");
		System.out.println("Name: Irving Luna");
		System.out.println("website: irvingluna.com");
		System.out.println("email: me@irvingluna.com");
		System.out.println("About: Hi I am a full stack developer. I have been\n"
				+ "developing applications since early 2010. My most recent experience\n"
				+ "is with PHP and Classic ASP.\n"
				+ "\n"
				+ "My experience with development is wide, having on worked on several\n"
				+ "different projects. If you have any questions then let me know, best"
				+ "method is by email.\n"
				+ "\n"
				+ "- Irving Luna"
				+ "\n\n"
				+ "Relevant Skills\n"
				+ "\tData Structures: 9/10\n"
				+ "\tDesign & Patterns: 8/10\n"
				+ "\tBackend: 9/10\n"
				+ "\tFrontEnd: 7/10\n"
				+ "\tDB Admin: 8/19\n"
				+ "\tDB Desig: 7.10\n"
				+ "\n"
				+ "Languages - Console\n"
				+ "\tJava: 7/10\n"
				+ "\tC++: 5/10\n"
				+ "\tPython: 2/10\n"
				+ "\n"
				+ "Languages - Web\n"
				+ "\tPHP: 9/10\n"
				+ "\tASP.NET 7/10\n"
				+ "\tReact: 5/10\n"
				+ "\tjQuery: 5/10\n"
				+ "\tJavaScript: 5/10\n"
				+ "Languages - Database\n"
				+ "\tMySQL: 8/10\n"
				+ "\tMsSQL: 7/10\nt"
				+ "\tTSQL: 4/10\n"
				+ "\tSQL Lite: 4/10"
				+ "\n\n"
				+ "Press Enter to close screen...");
		
	}

	@Override
	public void userInput(String userInput) {
		System.out.println("\n back to menu");
		calculator.setState(calculator.getMenuScreenState());
	}

}
