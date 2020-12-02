package screens.calculator.irvingluna;

import states.calculator.irvingluna.ScreenState;

public class LoadingScreen implements Screen {
	
	private ScreenState calculator;
	
	public LoadingScreen(ScreenState calculator) {
		this.calculator = calculator;
	}

	@Override
	public void show() {
		System.out.println("------------------------------------------------------------------------------------------====----\n"
				+ "|  SS   IIIIII MM      MM PPPPP   LL     EEEEEEE                                                 |\n"
				+ "|SS  SS   II   MMMM  MMMM PP   PP LL     EE                                                      |\n"
				+ "|SS       II   MM  MM  MM PP   PP LL     EE                                                      |\n"
				+ "|  SS     II   MM      MM PPPPP   LL     EEEEEEE                                                 |\n"
				+ "|    SS   II   MM      MM PP      LL     EE                                                      |\n"
				+ "|SS  SS   II   MM      MM PP      LL     EE                                                      |\n"
				+ "|  SS   IIIIII MM      MM PP      LLLLLL EEEEEEE                                                 |\n"
				+ "|        CCCC       AA     LL       CCCC   UU      UU LL         AA     TTTTTTTTT   OOOO   RRRR  |\n"
				+ "|      CC    CC    AAAA    LL     CC    CC UU      UU LL        AAAA        TT    OO    OO RR  RR|\n"
				+ "|      CC         AA  AA   LL     CC       UU      UU LL       AA  AA       TT    OO    OO RR  RR|\n"
				+ "|      CC        AAAAAAAA  LL     CC       UU      UU LL      AAAAAAAA      TT    OO    OO RRRRRR|\n"
				+ "|      CC       AA      AA LL     CC       UU      UU LL     AA      AA     TT    OO    OO RR RR |\n"
				+ "|      CC    CC AA      AA LL     CC    CC UU      UU LL     AA      AA     TT    OO    OO RR  RR|\n"
				+ "|        CCCC   AA      AA LLLLLL   CCCC     UUUUUU   LLLLLL AA      AA     TT      OOOO   RR  RR|\n"
				+ "--------------------------------------------------------------------------------------------------\n"
				+ "Press enter to continue...");

	}

	@Override
	public void userInput(String userinput) {
		calculator.setState(calculator.getMenuScreenState());
	}

}
