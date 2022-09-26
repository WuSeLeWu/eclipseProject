package inheritance;

public class Main {

	public static void main(String[] args) {
		
		//Customer ve Employee sınıfları Person sınıfından miras aldıkları tanımlamaları ve ayrıca kendilerinde özel olarak bulunan tanımlamaları kullanabilir.
		Customer customer=new Customer();
		customer.age=30;	
		Employee employee=new Employee();
		employee.age=40;
		
		//CustomerManager ve EmployeeManager sınıfları PersonManager sınıfından miras aldıkları methodları ve ayrıca kendilerinde özel olarak bulunan methodları kullanabilir.
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add();
		EmployeeManager employeeManager=new EmployeeManager();
		employeeManager.Add();

	}

}
