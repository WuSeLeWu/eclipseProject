package javaHomeWork1;

public class niniProjeAsalSayi {

	public static void main(String[] args) {

		int number = 11;
		int value = 0;

		if (number < 2) {
			System.err.println("Gireceğiniz değer 1,0 ve 0'dan küçük olamaz!");

		} else {
			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					value = 1;
					break;
				}
			}
			if (value == 0) {
				System.err.println("Sayı Asaldır!");
			} else {
				System.err.println("Sayı Asal Değildir!");
			}
		}

	}

}
