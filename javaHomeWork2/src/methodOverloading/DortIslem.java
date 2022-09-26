package methodOverloading;

public class DortIslem {

	public int topla(int number1, int number2) {

		return number1 + number2;
	}

	public int topla(int number1, int number2, int number3) {

		return number1 + number2 + number3;
	}

	public int topla(int... numbers) {

		int total = 0;
		for (int a : numbers) {

			total += a;
		}

		return total;
	}
}
