package javaHomeWork1;

public class sayiBulma {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 6, 7, 9, 0, };
		int wanted = 7;
		boolean value = false;

		for (int i = 0; i < numbers.length; i++) {

			if (wanted == numbers[i]) {
				value = true;
				break;
			}

		}

		if (value == true) {
			System.err.println("Aranan Sayı Dizide Bulunmaktadır!");
		} else {
			System.err.println("Aranan Sayı Dizide Yoktur!");
		}
	}

}
