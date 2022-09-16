package javaHomeWork1;

public class for_while {

	public static void main(String[] args) {

						// FOR

		for (int i = 2; i <= 10; i += 2) {

			System.err.println(i);
		}

		System.err.println("For Döngüsü Bitti!");

						// WHILE

		int i = 1;
		while (i < 10) {
			System.err.println(i);
			i += 2;
		}

		System.err.println("While Döngüsü Bitti!");

						// DO-WHILE

		int j = 100;
		do {
			System.err.println(j);
			j++;
		} while (j <= 10);

		System.err.println("Do-While Döngüsü Bitti!");
	}

}
