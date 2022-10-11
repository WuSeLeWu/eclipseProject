package ovverriding;

public class TarimKrediManager extends BaseKrediManager{

	public double hesapla(double tutar) {
		return tutar*1.15;
	}
}
