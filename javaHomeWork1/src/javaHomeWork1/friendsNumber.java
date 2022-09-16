package javaHomeWork1;

public class friendsNumber {

	public static void main(String[] args) {

						// 220-284 Haricinde 1184 ve 1210 da arkadaş sayılara dahildir.

		int number1 = 220;
		int number2 = 284;

		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 += i;
			}
		}

		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 += i;
			}
		}

		if (total1 == number2 && total2 == number1) {
			System.err.println(number1 + " ve " + number2 + " Arkadaş Sayılardır!");
		} else {
			System.err.println(number1 + " ve " + number2 + " Arkadaş Sayı Değildir!");
		}
	}

}
