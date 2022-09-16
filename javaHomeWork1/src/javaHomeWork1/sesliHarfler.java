package javaHomeWork1;

public class sesliHarfler {
	
	public static void main(String[] args) {
		char harf = 'i';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.err.println(harf + " Kalın Seslidir!");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
			System.err.println(harf + " İnce Seslidir!");
			break;
		default:
			System.err.println("Girdiğiniz harf sesli değildir!!!");
		}
	}
}
