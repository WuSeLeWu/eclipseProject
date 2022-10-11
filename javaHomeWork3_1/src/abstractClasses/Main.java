package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomenGameCalculator calculator = new WomenGameCalculator();
		calculator.hesapla();
		calculator.gameOver();

		GameCalculator gameCalculator = new KidsCalculator();
		gameCalculator.hesapla();
	}

}
