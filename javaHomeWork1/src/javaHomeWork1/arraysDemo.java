package javaHomeWork1;

public class arraysDemo {

	public static void main(String[] args) {

		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";

		System.err.println(ogrenci1);
		System.err.println(ogrenci2);
		System.err.println(ogrenci3);
		System.err.println(ogrenci4);

		System.err.println("---------------------------");

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.err.println(ogrenciler[i]);
		}

		System.err.println("---------------------------");

		for (String takmaisim : ogrenciler) {
			System.err.println(takmaisim);
		}

	}

}
