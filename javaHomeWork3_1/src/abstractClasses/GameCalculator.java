package abstractClasses;

public abstract class GameCalculator {
	//Abstract sınıflarda verdiğimiz bir methodun içini default da dahil doldurmak istemiyorsak bu şekilde tanımlayıp bırakıyoruz ve
	//GameCalculator sınıfını extends(miras) alan sınıfların doldurmasını mecburi tutuyoruz.
	//Aynı zamanda abstract sınıflarda abstract method ya da tamamlanmış method bulunması mecburi değildir aynı şekilde bura da olduğu gibi ikisi de aynı anda bulunabilir.
	
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti ");
	}
}
