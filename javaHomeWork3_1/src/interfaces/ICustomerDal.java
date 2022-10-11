package interfaces;

public interface ICustomerDal {
	// Interface'ler new'lenemezler yalnızca kendisi implements eden sınıfları referans olarak kullanırlar.
	// Aynı zamanda interface'ler tamamlanmış method kullanmazlar yeni güncellemelerle bu eklenmiştir.
	// fakat abstract sınıflara göre farkı budur tamamlanmış method kullanmazlar.
	// Başka bir özelliği ise bir sınıf birden fazla interface'i implements edebilir.
	void add();
}
