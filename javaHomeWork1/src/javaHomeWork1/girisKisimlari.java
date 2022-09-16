package javaHomeWork1;

public class girisKisimlari {

	public static void main(String[] args) {

		// İF-ELSE
		int sayi = 19;

		if (sayi < 20) {
			System.err.println("Sayı 20'den küçüktür! ");
		} else if (sayi == 20) {
			System.err.println("Sayı 20'ye eşittir! ");
		} else {
			System.err.println("Sayı 20'den büyüktür! ");
		}

		// Sayıların En büyüğünü bulma.

		int birincisayi = 170;
		int ikincisayi = 102;
		int ucuncusayi = 67;

		int enbuyuksayi = birincisayi;

		if (enbuyuksayi < ikincisayi) {
			enbuyuksayi = ikincisayi;
		}
		if (enbuyuksayi < ucuncusayi) {
			enbuyuksayi = ucuncusayi;
		}

		System.err.println("En büyük sayı :" + enbuyuksayi);

	}

}
