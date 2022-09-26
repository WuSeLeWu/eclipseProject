package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		
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
			mesajVer("Sayı Mevcuttur : "+wanted);
		} else {
			mesajVer("Sayı Mevcut Değildir : "+wanted);
		}
	}
	
	public static void mesajVer(String mesaj ) {
		System.out.println(mesaj);
	}

}
