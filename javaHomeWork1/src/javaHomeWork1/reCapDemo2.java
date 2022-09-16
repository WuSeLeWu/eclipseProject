package javaHomeWork1;

public class reCapDemo2 {

	public static void main(String[] args) {

		double[] myList = { 1.5, 8.7, 4.9 };

		double toplam = 0;
		double enbuyuk = 0;

		for (double sayilar : myList) {
			if (enbuyuk < sayilar) {
				enbuyuk = sayilar;
			}

			toplam += sayilar;
			System.err.println(sayilar);
		}
		System.err.println("En buyuk Sayı:" + enbuyuk);
		System.err.println("Sayiların Toplamı :" + toplam);

		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (max < myList[i]) {
				max = myList[i];
			}
		}
		System.err.println("Max Değer :" + max);
	}

}
