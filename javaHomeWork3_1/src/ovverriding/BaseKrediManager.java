package ovverriding;

public class BaseKrediManager {
	
	public double hesapla(double tutar) {
		return tutar*1.20;
	}
	
	public final void message(String message) { 
		//final methodu ovverride edilemez anlamına gelir.BaseKrediManager'ı inherit eden hiçbir class bu methodu değiştirrmez aynen kullanmak zorundadır.
		System.out.println("Kredi Verildi "+message);
	}
}
