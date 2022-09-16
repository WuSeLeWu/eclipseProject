package javaHomeWork1;

public class Switch {

	public static void main(String[] args) {
		char grade = 'T';

		switch (grade) {
		case 'A':
			System.err.println("Mükemmel Geçtiniz!");
			break;
		case 'B':
		case 'C':
			System.err.println("İyi Geçtiniz!");
			break;
		case 'D':
			System.err.println("Fena Değil Geçtiniz!");
			break;
		case 'F':
			System.err.println("Malesef Kaldınız!");
		default:
			System.err.println("Doğru Harf Karşılığı Girmediniz.Tekrar Deneyin!");
		}

	}

}
