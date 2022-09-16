package javaHomeWork1;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.err.println(mesaj);

		System.err.println("Eleman Sayısı :" + mesaj.length());
		System.err.println("5.Eleman :" + mesaj.charAt(4));
		System.err.println(mesaj.concat(" Yaşasın!"));
		System.err.println(mesaj.startsWith("b"));
		System.err.println(mesaj.endsWith("."));

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.err.println(karakterler);

		System.err.println(mesaj.indexOf("av"));
		System.err.println(mesaj.lastIndexOf("a"));

		String yeniMesaj = mesaj.replace(" ", "-");
		System.err.println(yeniMesaj);
		System.err.println(mesaj.substring(2, 5));

		for (String kelime : mesaj.split(" ")) {
			System.err.println(kelime);
		}

		System.err.println(mesaj.toLowerCase());
		System.err.println(mesaj.toUpperCase());

		System.err.println(mesaj.trim()); // Başındaki ve sonundaki boşlukları siler.
	}

}
