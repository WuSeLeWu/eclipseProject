package methodOverloading;

public class Main {

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(5, 7));
		System.out.println(dortIslem.topla(7, 8, 5));
		System.out.println(dortIslem.topla(7, 8, 5, 7, 8, 9));

	}

}